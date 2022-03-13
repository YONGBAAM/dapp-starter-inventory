package com.drake.dappstarterinventory.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class DepositRequest {
    private Integer nftId;

    private String nftDescription;

    private String password;

    private String walletAddress;

    private Map<String, String> info;

}
