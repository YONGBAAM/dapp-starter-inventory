package com.drake.dappstarterinventory.contracts;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.Wallet;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;
import org.web3j.tx.gas.DefaultGasProvider;

import java.util.List;

import static com.drake.dappstarterinventory.Constants.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContractTest {


    @Test
    public void getEthClientVersionSync() throws Exception
    {
        Web3j web3j = Web3j.build(new HttpService(POLYGON_TESTNET_URL));
        Web3ClientVersion web3ClientVersion = web3j.web3ClientVersion().send();
        System.out.println(web3ClientVersion.getWeb3ClientVersion());
    }

    @Test
    public void getEthClientVersionASync() throws Exception
    {
        Web3j web3 = Web3j.build(new HttpService(POLYGON_TESTNET_URL));  // defaults to http://localhost:8545/
        Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().sendAsync().get();
        System.out.println(web3ClientVersion.getWeb3ClientVersion());
    }

    @Test
    public void test() throws Exception
    {
        Web3j web3 = Web3j.build(new HttpService(POLYGON_TESTNET_URL));
//        web// defaults to http://localhost:854
        Credentials cred = Credentials.create(CHANGGO_PRIVATE_KEY); // todo: https://docs.web3j.io/command_line.html learn command line tools for generating waller file

        Contracts_MintAnimalToken_sol_MintAnimalToken contract = Contracts_MintAnimalToken_sol_MintAnimalToken
                .load(mintAnimalTokenAddress, web3, cred, new DefaultGasProvider());

        if (contract.isValid()) {
            List result = contract.getAnimalTokens(OWNER_ADDRESS).send();
            System.out.println(result);
        }


//        Contract.
//        contract =
//
//
//
//        Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().sendAsync().get();
//        System.out.println(web3ClientVersion.getWeb3ClientVersion());
    }

    @Test
    public void getEthClientVersionRx() throws Exception
    {
        Web3j web3 = Web3j.build(new HttpService(POLYGON_TESTNET_URL));  // defaults to http://localhost:8545/
        web3.web3ClientVersion().flowable().subscribe(x -> {
            System.out.println(x.getWeb3ClientVersion());
        });

        Thread.sleep(5000);
    }


}
