package com.drake.inventory.dto;

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
    private String password;
    private String walletAddress;
    private String description;
}
