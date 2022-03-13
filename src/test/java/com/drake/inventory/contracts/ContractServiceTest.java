package com.drake.inventory.contracts;

import com.drake.inventory.service.ContractService;
import org.junit.jupiter.api.Test;

public class ContractServiceTest {

    @Test
    void testRetrieveAddress() throws Exception {
        ContractService sv = new ContractService();
        String own = sv.findOwnerByNftId(2);
        System.out.println(own);


    }
}
