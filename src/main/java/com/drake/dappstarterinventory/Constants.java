package com.drake.dappstarterinventory;

import com.google.common.annotations.VisibleForTesting;

// TODO: retrieve from yaml
@VisibleForTesting
public class Constants {
    private Constants() {
    }

    public static final String POLYGON_TESTNET_URL = "https://matic-mumbai.chainstacklabs.com";

    // TODO: THIS SHOULD NOT BE HERE IN MAIN NET
    public static final String CHANGGO_ADDRESS = "0xc9B7F6CB9Ee166f4d113B5394A05E346048628d1";
    public static final String CHANGGO_PRIVATE_KEY = "936886a8be4264c1ad4df6130716d5eb700bfbc21a0e5cd7f076fc688c7aa8f6";

    public static final String OWNER_ADDRESS = "0x448464649a3a8f5c1fD78826fa327fe361D2eD13";


    public static final String mintAnimalTokenAddress = "0xaFe8b37F4D4C319379E8760FBa5677B9a5efBbbd";
    public static final String saleAnimalTokenAddress = "0xC4cFC60da5Fb10D7bfb8dF735b0613E94C2445fC";
}
