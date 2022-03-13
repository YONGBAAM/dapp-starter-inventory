package com.drake.dappstarterinventory.dto;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class RetrievalRequest {
    private Integer itemId;

    //    @Size(min=2, message = "pw 2글자 이상 입력해 주세요.")
    private String password;

    private String ownerWalletAddress;
}
