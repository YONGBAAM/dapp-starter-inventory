//package com.drake.inventory.contracts;
//
//import org.bouncycastle.pqc.crypto.ExchangePair;
//import org.junit.Ignore;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.web3j.crypto.Credentials;
//import org.web3j.mintanimaltoken.MintAnimalToken;
//import org.web3j.protocol.Web3j;
//import org.web3j.protocol.core.DefaultBlockParameter;
//import org.web3j.protocol.core.DefaultBlockParameterName;
//import org.web3j.protocol.core.RemoteCall;
//import org.web3j.protocol.core.Request;
//import org.web3j.protocol.core.methods.response.EthGetBalance;
//import org.web3j.protocol.core.methods.response.Web3ClientVersion;
//import org.web3j.protocol.http.HttpService;
//import org.web3j.tx.ChainId;
//import org.web3j.tx.RawTransactionManager;
//import org.web3j.tx.TransactionManager;
//import org.web3j.tx.gas.DefaultGasProvider;
//
//import java.util.List;
//
//import static com.drake.inventory.Constants.*;
//
//@Ignore
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ContractTest {
//
//
//    @Test
//    public void getEthClientVersionSync() throws Exception
//    {
//        Web3j web3j = Web3j.build(new HttpService(POLYGON_TESTNET_URL));
//        Web3ClientVersion web3ClientVersion = web3j.web3ClientVersion().send();
//        System.out.println(web3ClientVersion.getWeb3ClientVersion());
//    }
//
//    @Test
//    public void getEthClientVersionASync() throws Exception
//    {
//        Web3j web3 = Web3j.build(new HttpService(POLYGON_TESTNET_URL));  // defaults to http://localhost:8545/
//        Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().sendAsync().get();
//        System.out.println(web3ClientVersion.getWeb3ClientVersion());
//    }
////
////    @Test
////    public void test() throws Exception
////    {
////        Web3j web3 = Web3j.build(new HttpService(POLYGON_TESTNET_URL));
//////        web// defaults to http://localhost:854
////        Credentials cred = Credentials.create("0x448464649a3a8f5c1fD78826fa327fe361D2eD13"); // todo: https://docs.web3j.io/command_line.html learn command line tools for generating waller file
////
////        MintAnimalToken contract = MintAnimalToken
////                .load("0xaFe8b37F4D4C319379E8760FBa5677B9a5efBbbd", web3, cred, new DefaultGasProvider());
////        if (contract.isValid()) {
////            List result = contract.getAnimalTokens(OWNER_ADDRESS).send();
////            System.out.println(result);
////        } else {
////            throw new RuntimeException("Invalid contract");
////        }
//
//
////        Contract.
////        contract =
////
////
////
////        Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().sendAsync().get();
////        System.out.println(web3ClientVersion.getWeb3ClientVersion());
////    }
//
//    @Test
//    public void test2() throws Exception
//    {
//        Web3j web3 = Web3j.build(new HttpService(POLYGON_TESTNET_URL));
////        web// defaults to http://localhost:854
//        Credentials cred = Credentials.create("c20fdc6468e46e4488e932828c16a7d09d24835cf55b0b4b95f3b0ae70a1af2b"); // todo: https://docs.web3j.io/command_line.html learn command line tools for generating waller file
//        RawTransactionManager manager = new RawTransactionManager(web3, cred, 80001L);
////        MintAnimalToken contract = MintAnimalToken.deploy(web3, txm, new DefaultGasProvider()).send();
//        MintAnimalToken contract = MintAnimalToken
//                .load(mintAnimalTokenAddress, web3, manager, new DefaultGasProvider());
//
////        tr = new RawTransactionManager(web3, cred, ChainId.NONE);
//        System.out.println(contract);
//
//            if (contract.isValid()) {
//                contract.mintAnimalToken().send();
//                List result = contract.getAnimalTokens(CHANGGO_ADDRESS).send();
//                System.out.println(result);
//            } else {
//                throw new RuntimeException("Invalid contract");
//            }
//            web3.shutdown();
//
//
//
////        Contract.
////        contract =
////
////
////
////        Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().sendAsync().get();
////        System.out.println(web3ClientVersion.getWeb3ClientVersion());
//    }
//
//    @Test
//    public void test3() throws Exception
//    {
//        Web3j web3 = Web3j.build(new HttpService(POLYGON_TESTNET_URL));
////        web// defaults to http://localhost:854
//        Credentials cred = Credentials.create("c20fdc6468e46e4488e932828c16a7d09d24835cf55b0b4b95f3b0ae70a1af2b"); // todo: https://docs.web3j.io/command_line.html learn command line tools for generating waller file
//        RawTransactionManager manager = new RawTransactionManager(web3, cred, 80001L);
//        EthGetBalance s = web3.ethGetBalance(CHANGGO_ADDRESS, DefaultBlockParameterName.LATEST).send();
//
//        System.out.println(s.getBalance());
//
////        MintAnimalToken contract = MintAnimalToken.deploy(web3, txm, new DefaultGasProvider()).send();
//
//        MintAnimalToken contract = MintAnimalToken
//                .load(mintAnimalTokenAddress, web3, manager, new DefaultGasProvider());
//// contract.isvalid bugs..
////        tr = new RawTransactionManager(web3, cred, ChainId.NONE);
//        System.out.println(contract.getContractAddress());
//
//        contract.mintAnimalToken().send();
//        List<MintAnimalToken.AnimalTokenData> result = contract.getAnimalTokens(CHANGGO_ADDRESS).send();
//
//        for (MintAnimalToken.AnimalTokenData at : result) {
//            System.out.println("" + at.animalPrice + " " + at.animalTokenId+ " " +  at.animalType);
//        }
//        System.out.println(result);
//
//        web3.shutdown();
//
//
//
////        Contract.
////        contract =
////
////
////
////        Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().sendAsync().get();
////        System.out.println(web3ClientVersion.getWeb3ClientVersion());
//    }
//    @Test
//    public void getEthClientVersionRx() throws Exception
//    {
//        Web3j web3 = Web3j.build(new HttpService(POLYGON_TESTNET_URL));  // defaults to http://localhost:8545/
//        web3.web3ClientVersion().flowable().subscribe(x -> {
//            System.out.println(x.getWeb3ClientVersion());
//        });
//
//        Thread.sleep(5000);
//    }
//
//
//}
