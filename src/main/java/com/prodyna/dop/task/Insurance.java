package com.prodyna.dop.task;

import java.util.Objects;

public sealed interface Insurance {

    record CarInsurance(Integer co2, Integer hp, Boolean isOldTimer) implements Insurance {
        public CarInsurance {
            Objects.requireNonNull(co2);
            Objects.requireNonNull(hp);
            if (hp <= 0)
                throw new IllegalArgumentException("hp should not be negative");
            Objects.requireNonNull(isOldTimer);

        }
    }

    record LifeInsurance(Integer age,
                         Boolean hasDangerousJob) implements Insurance {
        public LifeInsurance {
            Objects.requireNonNull(age);
            if (age < 18 || age > 70)
                throw new IllegalArgumentException("age should be between 18 and 70");
            Objects.requireNonNull(hasDangerousJob);
        }
    }

    record HousholdInsurance(Double livingArea,
                             Boolean isHouse,
                             Integer numberOfLivingPeople) implements Insurance {
        public HousholdInsurance {
            Objects.requireNonNull(livingArea);
            if (livingArea < 0)
                throw new IllegalArgumentException("livingArea should not be negative");
            Objects.requireNonNull(isHouse);
            Objects.requireNonNull(numberOfLivingPeople);
            if (numberOfLivingPeople < 1 || numberOfLivingPeople > 10)
                throw new IllegalArgumentException("numberOfLivingPeople should be between 0 and 10");
        }
    }

}
