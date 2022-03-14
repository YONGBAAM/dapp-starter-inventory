package com.drake.inventory.contracts;

import com.drake.inventory.service.ContractService;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

@Ignore
public class ContractServiceTest {

    @Test
    void testRetrieveAddress() throws Exception {
        ContractService sv = new ContractService();
        String own = sv.findOwnerByNftId(2);
        System.out.println(own);


    }
}
