Your task is to implement an insurance calculation system based on the provided interface structure. The system handles
three types of insurance: Car Insurance, Life Insurance, and Household Insurance.

### Default Interface: Insurance

### Insurance Types and Rules

#### Car Insurance (CarInsurance)

- **Parameters:**
    - CO2 emissions (g/km)
    - Horsepower (hp)
    - Oldtimer status (boolean)
- **Validation Rules:**
    - CO2 must not be null
    - Horsepower must not be null or negative
    - Oldtimer status must not be null

#### Life Insurance (LifeInsurance)

- **Parameters:**
    - Age
    - Dangerous job status (boolean)
- **Validation Rules:**
    - Age must not be null and must be between 18 and 70
    - Dangerous job status must not be null

#### Household Insurance (HousholdInsurance)

- **Parameters:**
    - Living area (square meters)
    - House status (boolean)
    - Number of living people
- **Validation Rules:**
    - Living area must not be null or negative
    - House status must not be null
    - Number of living people must not be null and must be between 0 and 10

### Task

Implement the insurance calculation system based on the provided interface structure. The system should be able to
calculate the insurance premium based on the provided parameters. The calculation rules are as follows:

The \`getPrice\` method in the \`Contract\` class calculates the price of different types of insurance based on the provided
\`Insurance\` object. It uses a switch expression to handle different insurance types and applies specific multipliers and
calculations for each type:

- For \`CarInsurance\` with \`isOldTimer\` set to true, it multiplies the CO2 emissions by a constant and the
  horsepower.
- For regular \`CarInsurance\`, it multiplies the CO2 emissions by the horsepower and a constant.
- For \`HousholdInsurance\`, it multiplies the living area by the number of living people.
- For \`LifeInsurance\` with a dangerous job, it multiplies the age by a constant.
- For \`LifeInsurance\` with age less than 33, it multiplies the age by a different constant.
- For default \`LifeInsurance\`, it multiplies the age by a default constant.
