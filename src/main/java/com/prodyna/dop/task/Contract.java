package com.prodyna.dop.task;

import com.prodyna.dop.task.Insurance;

public class Contract {

    private static final double OLD_TIMER_CAR_INSURANCE_MULTIPLIER = 2.0;
    private static final double NORMAL_CAR_CAR_INSURANCE_MULTIPLIER = 0.5;
    private static final double DANGEROUS_JOB_INSURANCE_MULTIPLIER = 1.1;
    private static final double DEFAULT_PERSON_INSURANCE_MULTIPLIER = 1.0;
    private static final double YOUNG_PERSON_INSURANCE_MULTIPLIER = 0.9;

    /**
     * Calculates the price of the given insurance based on its type and attributes.
     *
     * @param insurance the insurance object for which the price needs to be calculated
     * @return the calculated price of the insurance
     */
    public Double getPrice(Insurance insurance) {
        return switch (insurance) {
            case Insurance.CarInsurance(Integer co2, Integer hp, Boolean isOldTimer) when isOldTimer ->
                    OLD_TIMER_CAR_INSURANCE_MULTIPLIER * co2 * hp;
            case Insurance.CarInsurance(Integer co2, Integer hp, _) -> NORMAL_CAR_CAR_INSURANCE_MULTIPLIER * co2 * hp;
            case Insurance.HousholdInsurance housholdInsurance ->
                    housholdInsurance.livingArea() * housholdInsurance.numberOfLivingPeople();
            case Insurance.LifeInsurance(Integer age, Boolean hasDangerousJob) when hasDangerousJob ->
                    DANGEROUS_JOB_INSURANCE_MULTIPLIER * age;
            case Insurance.LifeInsurance(Integer age, _) when age < 33 -> YOUNG_PERSON_INSURANCE_MULTIPLIER * age;
            case Insurance.LifeInsurance(Integer age, _) -> DEFAULT_PERSON_INSURANCE_MULTIPLIER * age;

        };
    }
}
