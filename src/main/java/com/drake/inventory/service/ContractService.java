package com.drake.inventory.service;

import com.drake.inventory.Constants;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.mintanimaltoken.MintAnimalToken;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.gas.DefaultGasProvider;

import javax.annotation.PostConstruct;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

import static com.drake.inventory.Constants.*;

@Service
@Slf4j
// TODO: Change to Impl, consider annotation placement
public class ContractService {
    private Web3j web3j;
    private Credentials credentials;
    private MintAnimalToken contract;
    private RawTransactionManager manager;


    public ContractService() {
        OkHttpClient.Builder bld = new OkHttpClient.Builder();
        bld.connectTimeout(300, TimeUnit.SECONDS);
        bld.readTimeout(300, TimeUnit.SECONDS);
        bld.writeTimeout(300, TimeUnit.SECONDS);

        web3j = Web3j.build(new HttpService(POLYGON_TESTNET_URL, bld.build(), false));
        credentials = Credentials.create(CHANGGO_PRIVATE_KEY); // todo: https://docs.web3j.io/command_line.html learn command line tools for generating waller file
        manager = new RawTransactionManager(web3j, credentials, 80001L);
        contract = MintAnimalToken
                .load(mintAnimalTokenAddress, web3j, manager, new DefaultGasProvider());

    }

    public String findOwnerByNftId(int id) throws Exception {
        try {
            String address = contract.ownerOf(BigInteger.valueOf(id)).send();
            log.info("Found owner id: " + id + " addr: " + address);
            return address;
        } catch (Exception e) {
            log.error(e.toString());
            throw (e);
        }
    }

    public void fromChango(String to, int nftId) throws Exception {
        try {
            TransactionReceipt receipt = contract.safeTransferFrom(CHANGGO_ADDRESS, to, BigInteger.valueOf(nftId)).send();
            log.info("receipt for id: " + nftId + " to " + to + "\n" + receipt.toString());
        } catch (Exception e) {
            log.error(e.toString());
            throw (e);
        }
    }

}
