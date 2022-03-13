package com.drake.inventory.item;

import com.drake.inventory.dto.DepositRequest;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue
    private Integer itemId;

    private Integer nftId;

    private String nftDescription;

//    @Size(min=2, message = "pw 2글자 이상 입력해 주세요.")
    private String password;

    private String ownerWalletAddress;

    @Builder
    public Item(Integer nftId, String nftDescription, String password, String ownerWalletAddress) {
        this.nftId = nftId;
        this.nftDescription = nftDescription;
        this.password = password;
        this.ownerWalletAddress = ownerWalletAddress;
    }

    public static Item from(DepositRequest depositRequest) {
        return Item.builder()
                .nftDescription(depositRequest.getDescription())
                .nftId(depositRequest.getNftId())
                .password(depositRequest.getPassword().trim())
                .ownerWalletAddress(depositRequest.getWalletAddress()).build();
    }
}
