package com.prodyna.dop.task;


import org.junit.jupiter.api.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ContractTest {

    @Test
    void getPriceForOldTimerCarInsuranceWithHighValues() {
        Insurance.CarInsurance oldTimerCarInsurance = new Insurance.CarInsurance(100, 200, true);
        Contract contract = new Contract();
        assertEquals(400.0, contract.getPrice(oldTimerCarInsurance));
    }

    @Test
    void getPriceForRegularCarInsuranceWithHighValues() {
        Insurance.CarInsurance regularCarInsurance = new Insurance.CarInsurance(100, 200, false);
        Contract contract = new Contract();
        assertEquals(10000.0, contract.getPrice(regularCarInsurance));
    }

    @Test
    void getPriceForHouseholdInsuranceWithLargeLivingArea() {
        Insurance.HousholdInsurance householdInsurance = new Insurance.HousholdInsurance(200.0, FALSE, 5);
        Contract contract = new Contract();
        assertEquals(1000.0, contract.getPrice(householdInsurance));
    }

    @Test
    void getPriceForLifeInsuranceWithDangerousJob() {
        Insurance.LifeInsurance lifeInsurance = new Insurance.LifeInsurance(40, TRUE);
        Contract contract = new Contract();
        assertEquals(44.0, contract.getPrice(lifeInsurance));
    }

    @Test
    void getPriceForYoungLifeInsurance() {
        Insurance.LifeInsurance lifeInsurance = new Insurance.LifeInsurance(25, FALSE);
        Contract contract = new Contract();
        assertEquals(22.5, contract.getPrice(lifeInsurance));
    }

    @Test
    void getPriceForDefaultLifeInsurance() {
        Insurance.LifeInsurance lifeInsurance = new Insurance.LifeInsurance(40, FALSE);
        Contract contract = new Contract();
        assertEquals(40.0, contract.getPrice(lifeInsurance));
    }
}
