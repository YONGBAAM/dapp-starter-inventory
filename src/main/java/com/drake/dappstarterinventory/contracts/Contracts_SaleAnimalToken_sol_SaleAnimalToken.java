package com.drake.dappstarterinventory.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.1.
 */
@SuppressWarnings("rawtypes")
public class Contracts_SaleAnimalToken_sol_SaleAnimalToken extends Contract {
    public static final String BINARY = "60806040523480156200001157600080fd5b506040516200111d3803806200111d8339818101604052810190620000379190620000e8565b806000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550506200011a565b600080fd5b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000620000b08262000083565b9050919050565b620000c281620000a3565b8114620000ce57600080fd5b50565b600081519050620000e281620000b7565b92915050565b6000602082840312156200010157620001006200007e565b5b60006200011184828501620000d1565b91505092915050565b610ff3806200012a6000396000f3fe6080604052600436106100705760003560e01c80634d1d7d5f1161004e5780634d1d7d5f146101065780639f7c764d14610143578063c6ffd54e1461015f578063fdbb69df1461018a57610070565b8063091635e9146100755780632dd7d12f146100a0578063498b520e146100dd575b600080fd5b34801561008157600080fd5b5061008a6101c7565b60405161009791906108aa565b60405180910390f35b3480156100ac57600080fd5b506100c760048036038101906100c291906108f6565b6101d4565b6040516100d491906108aa565b60405180910390f35b3480156100e957600080fd5b5061010460048036038101906100ff9190610923565b6101ec565b005b34801561011257600080fd5b5061012d600480360381019061012891906108f6565b6104b3565b60405161013a91906108aa565b60405180910390f35b61015d600480360381019061015891906108f6565b6104d7565b005b34801561016b57600080fd5b50610174610850565b60405161018191906109e2565b60405180910390f35b34801561019657600080fd5b506101b160048036038101906101ac91906108f6565b610874565b6040516101be91906108aa565b60405180910390f35b6000600280549050905090565b60016020528060005260406000206000915090505481565b60008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16636352211e846040518263ffffffff1660e01b815260040161024891906108aa565b602060405180830381865afa158015610265573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052508101906102899190610a3b565b90503373ffffffffffffffffffffffffffffffffffffffff168173ffffffffffffffffffffffffffffffffffffffff16146102f9576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016102f090610aeb565b60405180910390fd5b6000821161033c576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161033390610b57565b60405180910390fd5b6000600160008581526020019081526020016000205414610392576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161038990610be9565b60405180910390fd5b60008054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663e985e9c582306040518363ffffffff1660e01b81526004016103ed929190610c18565b602060405180830381865afa15801561040a573d6000803e3d6000fd5b505050506040513d601f19601f8201168201806040525081019061042e9190610c79565b61046d576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161046490610d18565b60405180910390fd5b8160016000858152602001908152602001600020819055506002839080600181540180825580915050600190039060005260206000200160009091909190915055505050565b600281815481106104c357600080fd5b906000526020600020016000915090505481565b60006001600083815260200190815260200160002054905060008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16636352211e846040518263ffffffff1660e01b815260040161054b91906108aa565b602060405180830381865afa158015610568573d6000803e3d6000fd5b505050506040513d601f19601f8201168201806040525081019061058c9190610a3b565b9050600082116105d1576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004016105c890610d84565b60405180910390fd5b34821115610614576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161060b90610df0565b60405180910390fd5b3373ffffffffffffffffffffffffffffffffffffffff168173ffffffffffffffffffffffffffffffffffffffff161415610683576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161067a90610e5c565b60405180910390fd5b8073ffffffffffffffffffffffffffffffffffffffff166108fc349081150290604051600060405180830381858888f193505050501580156106c9573d6000803e3d6000fd5b5060008054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166342842e0e8233866040518463ffffffff1660e01b815260040161072793929190610e7c565b600060405180830381600087803b15801561074157600080fd5b505af1158015610755573d6000803e3d6000fd5b505050506000600160008581526020019081526020016000208190555060005b60028054905081101561084a576000600160006002848154811061079c5761079b610eb3565b5b9060005260206000200154815260200190815260200160002054141561083757600260016002805490506107d09190610f11565b815481106107e1576107e0610eb3565b5b906000526020600020015460028281548110610800576107ff610eb3565b5b906000526020600020018190555060028054806108205761081f610f45565b5b600190038181906000526020600020016000905590555b808061084290610f74565b915050610775565b50505050565b60008054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b600060016000838152602001908152602001600020549050919050565b6000819050919050565b6108a481610891565b82525050565b60006020820190506108bf600083018461089b565b92915050565b600080fd5b6108d381610891565b81146108de57600080fd5b50565b6000813590506108f0816108ca565b92915050565b60006020828403121561090c5761090b6108c5565b5b600061091a848285016108e1565b91505092915050565b6000806040838503121561093a576109396108c5565b5b6000610948858286016108e1565b9250506020610959858286016108e1565b9150509250929050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b60006109a86109a361099e84610963565b610983565b610963565b9050919050565b60006109ba8261098d565b9050919050565b60006109cc826109af565b9050919050565b6109dc816109c1565b82525050565b60006020820190506109f760008301846109d3565b92915050565b6000610a0882610963565b9050919050565b610a18816109fd565b8114610a2357600080fd5b50565b600081519050610a3581610a0f565b92915050565b600060208284031215610a5157610a506108c5565b5b6000610a5f84828501610a26565b91505092915050565b600082825260208201905092915050565b7f43616c6c6572206973206e6f7420616e696d616c20746f6b656e206f776e657260008201527f2e00000000000000000000000000000000000000000000000000000000000000602082015250565b6000610ad5602183610a68565b9150610ae082610a79565b604082019050919050565b60006020820190508181036000830152610b0481610ac8565b9050919050565b7f5072696365206973207a65726f206f72206c6f7765722e000000000000000000600082015250565b6000610b41601783610a68565b9150610b4c82610b0b565b602082019050919050565b60006020820190508181036000830152610b7081610b34565b9050919050565b7f5468697320616e696d616c20746f6b656e20697320616c7265616479206f6e2060008201527f73616c652e000000000000000000000000000000000000000000000000000000602082015250565b6000610bd3602583610a68565b9150610bde82610b77565b604082019050919050565b60006020820190508181036000830152610c0281610bc6565b9050919050565b610c12816109fd565b82525050565b6000604082019050610c2d6000830185610c09565b610c3a6020830184610c09565b9392505050565b60008115159050919050565b610c5681610c41565b8114610c6157600080fd5b50565b600081519050610c7381610c4d565b92915050565b600060208284031215610c8f57610c8e6108c5565b5b6000610c9d84828501610c64565b91505092915050565b7f416e696d616c20746f6b656e206f776e657220646964206e6f7420617070726f60008201527f766520746f6b656e2e0000000000000000000000000000000000000000000000602082015250565b6000610d02602983610a68565b9150610d0d82610ca6565b604082019050919050565b60006020820190508181036000830152610d3181610cf5565b9050919050565b7f416e696d616c20746f6b656e206e6f742073616c652e00000000000000000000600082015250565b6000610d6e601683610a68565b9150610d7982610d38565b602082019050919050565b60006020820190508181036000830152610d9d81610d61565b9050919050565b7f43616c6c65722073656e74206c6f776572207468616e2070726963652e000000600082015250565b6000610dda601d83610a68565b9150610de582610da4565b602082019050919050565b60006020820190508181036000830152610e0981610dcd565b9050919050565b7f43616c6c657220697320616e696d616c20746f6b656e206f776e65722e000000600082015250565b6000610e46601d83610a68565b9150610e5182610e10565b602082019050919050565b60006020820190508181036000830152610e7581610e39565b9050919050565b6000606082019050610e916000830186610c09565b610e9e6020830185610c09565b610eab604083018461089b565b949350505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b6000610f1c82610891565b9150610f2783610891565b925082821015610f3a57610f39610ee2565b5b828203905092915050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052603160045260246000fd5b6000610f7f82610891565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff821415610fb257610fb1610ee2565b5b60018201905091905056fea2646970667358221220cc946c8cb5fe12e423efeb5ae8fbfc610bab5cb2de5be270fe47828cc512f2a664736f6c634300080c0033";

    public static final String FUNC_ANIMALTOKENPRICES = "animalTokenPrices";

    public static final String FUNC_GETANIMALTOKENPRICE = "getAnimalTokenPrice";

    public static final String FUNC_GETONSALEANIMALTOKENARRAYLENGTH = "getOnSaleAnimalTokenArrayLength";

    public static final String FUNC_MINTANIMALTOKENADDRESS = "mintAnimalTokenAddress";

    public static final String FUNC_ONSALEANIMALTOKENARRAY = "onSaleAnimalTokenArray";

    public static final String FUNC_PURCHASEANIMALTOKEN = "purchaseAnimalToken";

    public static final String FUNC_SETFORSALEANIMALTOKEN = "setForSaleAnimalToken";

    @Deprecated
    protected Contracts_SaleAnimalToken_sol_SaleAnimalToken(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Contracts_SaleAnimalToken_sol_SaleAnimalToken(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Contracts_SaleAnimalToken_sol_SaleAnimalToken(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Contracts_SaleAnimalToken_sol_SaleAnimalToken(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<BigInteger> animalTokenPrices(BigInteger param0) {
        final Function function = new Function(FUNC_ANIMALTOKENPRICES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> getAnimalTokenPrice(BigInteger _animalTokenId) {
        final Function function = new Function(FUNC_GETANIMALTOKENPRICE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_animalTokenId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> getOnSaleAnimalTokenArrayLength() {
        final Function function = new Function(FUNC_GETONSALEANIMALTOKENARRAYLENGTH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> mintAnimalTokenAddress() {
        final Function function = new Function(FUNC_MINTANIMALTOKENADDRESS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> onSaleAnimalTokenArray(BigInteger param0) {
        final Function function = new Function(FUNC_ONSALEANIMALTOKENARRAY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> purchaseAnimalToken(BigInteger _animalTokenId) {
        final Function function = new Function(
                FUNC_PURCHASEANIMALTOKEN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_animalTokenId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setForSaleAnimalToken(BigInteger _animalTokenId, BigInteger _price) {
        final Function function = new Function(
                FUNC_SETFORSALEANIMALTOKEN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_animalTokenId), 
                new org.web3j.abi.datatypes.generated.Uint256(_price)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Contracts_SaleAnimalToken_sol_SaleAnimalToken load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Contracts_SaleAnimalToken_sol_SaleAnimalToken(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Contracts_SaleAnimalToken_sol_SaleAnimalToken load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Contracts_SaleAnimalToken_sol_SaleAnimalToken(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Contracts_SaleAnimalToken_sol_SaleAnimalToken load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Contracts_SaleAnimalToken_sol_SaleAnimalToken(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Contracts_SaleAnimalToken_sol_SaleAnimalToken load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Contracts_SaleAnimalToken_sol_SaleAnimalToken(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Contracts_SaleAnimalToken_sol_SaleAnimalToken> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _mintAnimalTokenAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _mintAnimalTokenAddress)));
        return deployRemoteCall(Contracts_SaleAnimalToken_sol_SaleAnimalToken.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<Contracts_SaleAnimalToken_sol_SaleAnimalToken> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _mintAnimalTokenAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _mintAnimalTokenAddress)));
        return deployRemoteCall(Contracts_SaleAnimalToken_sol_SaleAnimalToken.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Contracts_SaleAnimalToken_sol_SaleAnimalToken> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _mintAnimalTokenAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _mintAnimalTokenAddress)));
        return deployRemoteCall(Contracts_SaleAnimalToken_sol_SaleAnimalToken.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Contracts_SaleAnimalToken_sol_SaleAnimalToken> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _mintAnimalTokenAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _mintAnimalTokenAddress)));
        return deployRemoteCall(Contracts_SaleAnimalToken_sol_SaleAnimalToken.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }
}
