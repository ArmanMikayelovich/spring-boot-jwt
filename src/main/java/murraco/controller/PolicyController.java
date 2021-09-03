package murraco.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

public interface PolicyController {
    String POLICY_HOME_OWNERS = "{\n" +
            "  \"state\" : \"AZ\",\n" +
            "  \"agencyLocation\" : {\n" +
            "    \"agency\" : {\n" +
            "      \"agencyName\" : \"COMMONWEALTH CASUALTY COMPANY\",\n" +
            "      \"agencyCode\" : \"001\"\n" +
            "    },\n" +
            "    \"mailingAddress\" : {\n" +
            "      \"streetAddress\" : \"2500 N 24TH ST\",\n" +
            "      \"city\" : \"PHOENIX\",\n" +
            "      \"state\" : \"AZ\",\n" +
            "      \"zipCode\" : \"85008-1842\"\n" +
            "    },\n" +
            "    \"agencyLocationName\" : \"azz001\"\n" +
            "  },\n" +
            "  \"coverages\" : [ ],\n" +
            "  \"policyNumber\" : \"AZH10567779\",\n" +
            "  \"policyDate\" : \"2021-03-01T19:00Z\",\n" +
            "  \"effectiveDate\" : \"2021-03-01T19:00Z\",\n" +
            "  \"expirationDate\" : \"2022-03-01T19:00Z\",\n" +
            "  \"policyTerm\" : \"12 Months\",\n" +
            "  \"policyStatus\" : \"Active\",\n" +
            "  \"communication\" : {\n" +
            "    \"mailingAddress\" : {\n" +
            "      \"streetAddress\" : \"2500 North 24th Street STE 100\",\n" +
            "      \"city\" : \"Phoenix\",\n" +
            "      \"state\" : \"AZ\",\n" +
            "      \"zipCode\" : \"85008\"\n" +
            "    },\n" +
            "    \"homePhone\" : \"8888888888\",\n" +
            "    \"email\" : \"supertest@hellotestdomain.org\"\n" +
            "  },\n" +
            "  \"insured\" : [ {\n" +
            "    \"firstName\" : \"Kris\",\n" +
            "    \"middleName\" : \"Paul\",\n" +
            "    \"lastName\" : \"Evans\",\n" +
            "    \"dateOfBirth\" : \"1982-04-21\",\n" +
            "    \"relationship\" : \"Insured\"\n" +
            "  } ],\n" +
            "  \"properties\" : [ {\n" +
            "    \"coverages\" : [ {\n" +
            "      \"name\" : \"Coins\",\n" +
            "      \"value\" : \"Coins\",\n" +
            "      \"amount\" : 2039,\n" +
            "      \"items\" : [ {\n" +
            "        \"value\" : \"Coins\",\n" +
            "        \"itemName\" : \"TEST NAME 10001\",\n" +
            "        \"itemDescription\" : \"TEST DESCRIPTION 10001\",\n" +
            "        \"itemValue\" : 1250\n" +
            "      }, {\n" +
            "        \"value\" : \"Coins\",\n" +
            "        \"itemName\" : \"TEST NAME 10002\",\n" +
            "        \"itemDescription\" : \"TEST DESCRIPTION 10002\",\n" +
            "        \"itemValue\" : 789\n" +
            "      } ]\n" +
            "    }, {\n" +
            "      \"name\" : \"Coverage A - Dwelling\",\n" +
            "      \"value\" : \"Coverage A - Dwelling\",\n" +
            "      \"amount\" : 255000\n" +
            "    }, {\n" +
            "      \"name\" : \"Coverage B - Other Structures\",\n" +
            "      \"value\" : \"2% of Coverage A\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Coverage C - Contents\",\n" +
            "      \"value\" : \"0% of Coverage A\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Coverage D - Loss of Use\",\n" +
            "      \"value\" : \"5% of Coverage A\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Coverage E - Personal Liability\",\n" +
            "      \"value\" : \"$50,000\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Coverage F - Medical Payments\",\n" +
            "      \"value\" : \"$500\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Deductible\",\n" +
            "      \"value\" : \"$250 AP / $1,000 Hail/Wind\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Golf Cart Physical Damage and Liability\",\n" +
            "      \"value\" : \"2 Golf Carts\",\n" +
            "      \"golfCarts\" : [ {\n" +
            "        \"golfCartYear\" : 2014,\n" +
            "        \"golfCartMake\" : \"TEST MAKE 914\",\n" +
            "        \"golfCartModel\" : \"TEST MODEL 345\",\n" +
            "        \"golfCartSerialOrVin\" : \"21VCB87532C84101\",\n" +
            "        \"golfCartValue\" : 576\n" +
            "      } ]\n" +
            "    }, {\n" +
            "      \"name\" : \"Home Computers\",\n" +
            "      \"value\" : \"$1,000\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Jewelry\",\n" +
            "      \"value\" : \"Jewelry\",\n" +
            "      \"amount\" : 2039,\n" +
            "      \"items\" : [ {\n" +
            "        \"value\" : \"Jewelry\",\n" +
            "        \"itemName\" : \"TEST NAME 10001\",\n" +
            "        \"itemDescription\" : \"TEST DESCRIPTION 10001\",\n" +
            "        \"itemValue\" : 1250\n" +
            "      }, {\n" +
            "        \"value\" : \"Jewelry\",\n" +
            "        \"itemName\" : \"TEST NAME 10002\",\n" +
            "        \"itemDescription\" : \"TEST DESCRIPTION 10002\",\n" +
            "        \"itemValue\" : 789\n" +
            "      } ]\n" +
            "    }, {\n" +
            "      \"name\" : \"Jewelry, Watches and Furs\",\n" +
            "      \"value\" : \"$1,000\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Service Line\",\n" +
            "      \"value\" : \"NO\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Water Backup / Sump Pump\",\n" +
            "      \"value\" : \"No Coverage\"\n" +
            "    } ],\n" +
            "    \"address\" : {\n" +
            "      \"streetAddress\" : \"2500 North 24th Street STE 100\",\n" +
            "      \"city\" : \"Phoenix\",\n" +
            "      \"state\" : \"AZ\",\n" +
            "      \"zipCode\" : \"85008\"\n" +
            "    }\n" +
            "  } ],\n" +
            "  \"questions\" : [ {\n" +
            "    \"question\" : \"Does the applicant have an active mobile home policy with commonwealth?\",\n" +
            "    \"answer\" : \"Yes\"\n" +
            "  }, {\n" +
            "    \"question\" : \"Does the home have an operating fire alarm system?\",\n" +
            "    \"answer\" : \"Yes\"\n" +
            "  }, {\n" +
            "    \"question\" : \"Does the home have a complete home sprinkler system?\",\n" +
            "    \"answer\" : \"Yes\"\n" +
            "  } ],\n" +
            "  \"timezone\" : \"America/Phoenix\"\n" +
            "}";

    String POLICY_MOBILE_HOME = "{\n" +
            "  \"state\" : \"AZ\",\n" +
            "  \"agencyLocation\" : {\n" +
            "    \"agency\" : {\n" +
            "      \"agencyName\" : \"COMMONWEALTH CASUALTY COMPANY\",\n" +
            "      \"agencyCode\" : \"001\"\n" +
            "    },\n" +
            "    \"mailingAddress\" : {\n" +
            "      \"streetAddress\" : \"2500 N 24TH ST\",\n" +
            "      \"city\" : \"PHOENIX\",\n" +
            "      \"state\" : \"AZ\",\n" +
            "      \"zipCode\" : \"85008-1842\"\n" +
            "    },\n" +
            "    \"agencyLocationName\" : \"azz001\"\n" +
            "  },\n" +
            "  \"coverages\" : [ ],\n" +
            "  \"policyNumber\" : \"AZM12000087\",\n" +
            "  \"policyDate\" : \"2021-03-01T19:00Z\",\n" +
            "  \"effectiveDate\" : \"2021-03-01T19:00Z\",\n" +
            "  \"expirationDate\" : \"2022-03-01T19:00Z\",\n" +
            "  \"policyTerm\" : \"12 Months\",\n" +
            "  \"policyStatus\" : \"Active\",\n" +
            "  \"communication\" : {\n" +
            "    \"mailingAddress\" : {\n" +
            "      \"streetAddress\" : \"2500 North 24th Street STE 100\",\n" +
            "      \"city\" : \"Phoenix\",\n" +
            "      \"state\" : \"AZ\",\n" +
            "      \"zipCode\" : \"85008\"\n" +
            "    },\n" +
            "    \"homePhone\" : \"8888888888\",\n" +
            "    \"email\" : \"supertest@hellotestdomain.org\"\n" +
            "  },\n" +
            "  \"insured\" : [ {\n" +
            "    \"firstName\" : \"Kris\",\n" +
            "    \"middleName\" : \"Paul\",\n" +
            "    \"lastName\" : \"Evans\",\n" +
            "    \"dateOfBirth\" : \"1982-04-21\",\n" +
            "    \"relationship\" : \"Insured\"\n" +
            "  } ],\n" +
            "  \"properties\" : [ {\n" +
            "    \"coverages\" : [ {\n" +
            "      \"name\" : \"2% Non-Structural Hail\",\n" +
            "      \"value\" : \"No Coverage\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Coins\",\n" +
            "      \"value\" : \"Coins\",\n" +
            "      \"amount\" : 2039,\n" +
            "      \"items\" : [ {\n" +
            "        \"value\" : \"Coins\",\n" +
            "        \"itemName\" : \"TEST NAME 10001\",\n" +
            "        \"itemDescription\" : \"TEST DESCRIPTION 10001\",\n" +
            "        \"itemValue\" : 1250\n" +
            "      }, {\n" +
            "        \"value\" : \"Coins\",\n" +
            "        \"itemName\" : \"TEST NAME 10002\",\n" +
            "        \"itemDescription\" : \"TEST DESCRIPTION 10002\",\n" +
            "        \"itemValue\" : 789\n" +
            "      } ]\n" +
            "    }, {\n" +
            "      \"name\" : \"Coverage A - Dwelling\",\n" +
            "      \"value\" : \"Replacement Value\",\n" +
            "      \"amount\" : 255000\n" +
            "    }, {\n" +
            "      \"name\" : \"Coverage B - Other Structures\",\n" +
            "      \"value\" : \"5% of Coverage A\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Coverage C - Contents\",\n" +
            "      \"value\" : \"0% of Coverage A\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Coverage D - Loss of Use\",\n" +
            "      \"value\" : \"10% of Coverage A\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Coverage E - Personal Liability\",\n" +
            "      \"value\" : \"$100,000\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Coverage F - Medical Payments\",\n" +
            "      \"value\" : \"$1,000\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Deductible\",\n" +
            "      \"value\" : \"$250 AP\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Earthquake\",\n" +
            "      \"value\" : \"No Coverage\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Flood and Rising Water\",\n" +
            "      \"value\" : \"No Coverage\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Golf Cart Physical Damage and Liability\",\n" +
            "      \"value\" : \"2 Golf Carts\",\n" +
            "      \"golfCarts\" : [ {\n" +
            "        \"golfCartYear\" : 2014,\n" +
            "        \"golfCartMake\" : \"TEST MAKE 914\",\n" +
            "        \"golfCartModel\" : \"TEST MODEL 345\",\n" +
            "        \"golfCartSerialOrVin\" : \"21VCB87532C84101\",\n" +
            "        \"golfCartValue\" : 576\n" +
            "      } ]\n" +
            "    }, {\n" +
            "      \"name\" : \"Identity Fraud\",\n" +
            "      \"value\" : \"No Coverage\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Jewelry\",\n" +
            "      \"value\" : \"Jewelry\",\n" +
            "      \"amount\" : 2039,\n" +
            "      \"items\" : [ {\n" +
            "        \"value\" : \"Jewelry\",\n" +
            "        \"itemName\" : \"TEST NAME 10001\",\n" +
            "        \"itemDescription\" : \"TEST DESCRIPTION 10001\",\n" +
            "        \"itemValue\" : 1250\n" +
            "      }, {\n" +
            "        \"value\" : \"Jewelry\",\n" +
            "        \"itemName\" : \"TEST NAME 10002\",\n" +
            "        \"itemDescription\" : \"TEST DESCRIPTION 10002\",\n" +
            "        \"itemValue\" : 789\n" +
            "      } ]\n" +
            "    }, {\n" +
            "      \"name\" : \"Permitted Vacancy\",\n" +
            "      \"value\" : \"No Coverage\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Water Backup / Sump Pump\",\n" +
            "      \"value\" : \"No Coverage\"\n" +
            "    } ],\n" +
            "    \"address\" : {\n" +
            "      \"streetAddress\" : \"2500 North 24th Street STE 100\",\n" +
            "      \"city\" : \"Phoenix\",\n" +
            "      \"state\" : \"AZ\",\n" +
            "      \"zipCode\" : \"85008\"\n" +
            "    }\n" +
            "  } ],\n" +
            "  \"questions\" : [ {\n" +
            "    \"question\" : \"Does the residence use a supplemental heating source?\",\n" +
            "    \"answer\" : \"No\"\n" +
            "  }, {\n" +
            "    \"question\" : \"Has the insured lived at the residence for at least 36 months?\",\n" +
            "    \"answer\" : \"No\"\n" +
            "  }, {\n" +
            "    \"question\" : \"Does the applicant have an active automobile policy with Commonwealth?\",\n" +
            "    \"answer\" : \"No\"\n" +
            "  } ],\n" +
            "  \"timezone\" : \"America/Phoenix\"\n" +
            "}";

    String POLICY_RENTERS = "{\n" +
            "  \"state\" : \"AZ\",\n" +
            "  \"agencyLocation\" : {\n" +
            "    \"agency\" : {\n" +
            "      \"agencyName\" : \"COMMONWEALTH CASUALTY COMPANY\",\n" +
            "      \"agencyCode\" : \"001\"\n" +
            "    },\n" +
            "    \"mailingAddress\" : {\n" +
            "      \"streetAddress\" : \"2500 N 24TH ST\",\n" +
            "      \"city\" : \"PHOENIX\",\n" +
            "      \"state\" : \"AZ\",\n" +
            "      \"zipCode\" : \"85008-1842\"\n" +
            "    },\n" +
            "    \"agencyLocationName\" : \"azz001\"\n" +
            "  },\n" +
            "  \"coverages\" : [ ],\n" +
            "  \"policyNumber\" : \"AZR01258458\",\n" +
            "  \"policyDate\" : \"2021-03-01T19:00Z\",\n" +
            "  \"effectiveDate\" : \"2021-03-01T19:00Z\",\n" +
            "  \"expirationDate\" : \"2022-03-01T19:00Z\",\n" +
            "  \"policyTerm\" : \"12 Months\",\n" +
            "  \"policyStatus\" : \"Active\",\n" +
            "  \"communication\" : {\n" +
            "    \"mailingAddress\" : {\n" +
            "      \"streetAddress\" : \"2500 North 24th Street STE 100\",\n" +
            "      \"city\" : \"Phoenix\",\n" +
            "      \"state\" : \"AZ\",\n" +
            "      \"zipCode\" : \"85008\"\n" +
            "    },\n" +
            "    \"homePhone\" : \"8888888888\",\n" +
            "    \"email\" : \"supertest@hellotestdomain.org\"\n" +
            "  },\n" +
            "  \"insured\" : [ {\n" +
            "    \"firstName\" : \"Kris\",\n" +
            "    \"middleName\" : \"Paul\",\n" +
            "    \"lastName\" : \"Evans\",\n" +
            "    \"dateOfBirth\" : \"1982-04-21\",\n" +
            "    \"relationship\" : \"Insured\"\n" +
            "  } ],\n" +
            "  \"properties\" : [ {\n" +
            "    \"coverages\" : [ {\n" +
            "      \"name\" : \"Coins\",\n" +
            "      \"value\" : \"Rate and Current Coins\",\n" +
            "      \"amount\" : 2039,\n" +
            "      \"items\" : [ {\n" +
            "        \"value\" : \"Rate and Current Coins\",\n" +
            "        \"itemName\" : \"TEST NAME 10001\",\n" +
            "        \"itemDescription\" : \"TEST DESCRIPTION 10001\",\n" +
            "        \"itemValue\" : 1250\n" +
            "      }, {\n" +
            "        \"value\" : \"Rate and Current Coins\",\n" +
            "        \"itemName\" : \"TEST NAME 10002\",\n" +
            "        \"itemDescription\" : \"TEST DESCRIPTION 10002\",\n" +
            "        \"itemValue\" : 789\n" +
            "      } ]\n" +
            "    }, {\n" +
            "      \"name\" : \"Coverage C - Contents\",\n" +
            "      \"value\" : \"$5,000\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Coverage E - Personal Liability\",\n" +
            "      \"value\" : \"$25,000\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Coverage F - Medical Payments\",\n" +
            "      \"value\" : \"$500\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Deductible\",\n" +
            "      \"value\" : \"$250\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Home Computers\",\n" +
            "      \"value\" : \"$1,000\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Jewelry\",\n" +
            "      \"value\" : \"Jewelry\",\n" +
            "      \"amount\" : 2039,\n" +
            "      \"items\" : [ {\n" +
            "        \"value\" : \"Jewelry\",\n" +
            "        \"itemName\" : \"TEST NAME 10001\",\n" +
            "        \"itemDescription\" : \"TEST DESCRIPTION 10001\",\n" +
            "        \"itemValue\" : 1250\n" +
            "      }, {\n" +
            "        \"value\" : \"Jewelry\",\n" +
            "        \"itemName\" : \"TEST NAME 10002\",\n" +
            "        \"itemDescription\" : \"TEST DESCRIPTION 10002\",\n" +
            "        \"itemValue\" : 789\n" +
            "      } ]\n" +
            "    }, {\n" +
            "      \"name\" : \"Jewelry, Watches and Furs\",\n" +
            "      \"value\" : \"$1,000\"\n" +
            "    } ],\n" +
            "    \"address\" : {\n" +
            "      \"streetAddress\" : \"2500 North 24th Street STE 100\",\n" +
            "      \"city\" : \"Phoenix\",\n" +
            "      \"state\" : \"AZ\",\n" +
            "      \"zipCode\" : \"85008\"\n" +
            "    }\n" +
            "  } ],\n" +
            "  \"questions\" : [ {\n" +
            "    \"question\" : \"Is the residence located on 5 acres of land or more?\",\n" +
            "    \"answer\" : \"No\"\n" +
            "  }, {\n" +
            "    \"question\" : \"Does the residence property contain any exotic, farm, saddle or hooved animals?\",\n" +
            "    \"answer\" : \"No\"\n" +
            "  }, {\n" +
            "    \"question\" : \"Does the property have a trampoline?\",\n" +
            "    \"answer\" : \"No\"\n" +
            "  } ],\n" +
            "  \"timezone\" : \"America/Phoenix\"\n" +
            "}";

    String POLICY_AUTO = "{\n" +
            "  \"state\" : \"AZ\",\n" +
            "  \"agencyLocation\" : {\n" +
            "    \"agency\" : {\n" +
            "      \"agencyName\" : \"COMMONWEALTH CASUALTY COMPANY\",\n" +
            "      \"agencyCode\" : \"001\"\n" +
            "    },\n" +
            "    \"mailingAddress\" : {\n" +
            "      \"streetAddress\" : \"2500 N 24TH ST\",\n" +
            "      \"city\" : \"PHOENIX\",\n" +
            "      \"state\" : \"AZ\",\n" +
            "      \"zipCode\" : \"85008-1842\"\n" +
            "    },\n" +
            "    \"agencyLocationName\" : \"azz001\"\n" +
            "  },\n" +
            "  \"coverages\" : [ {\n" +
            "    \"name\" : \"Accidental Death and Dismemberment\",\n" +
            "    \"value\" : \"$2,500\",\n" +
            "    \"beneficiaryName\" : \"JOHN SMITH\",\n" +
            "    \"beneficiaryAddress\" : {\n" +
            "      \"streetAddress\" : \"2500 North 24th Street STE 100\",\n" +
            "      \"city\" : \"Phoenix\",\n" +
            "      \"state\" : \"AZ\",\n" +
            "      \"zipCode\" : \"85008\"\n" +
            "    },\n" +
            "    \"beneficiaryPhone\" : \"5555567890\",\n" +
            "    \"beneficiaryBirthDate\" : \"1982-04-21\"\n" +
            "  }, {\n" +
            "    \"name\" : \"Roadside Assistance\",\n" +
            "    \"value\" : \"Platinum up to $125 service\"\n" +
            "  }, {\n" +
            "    \"name\" : \"Uninsured Motorist Property Damage\",\n" +
            "    \"value\" : \"$2,500 each accident\"\n" +
            "  } ],\n" +
            "  \"policyNumber\" : \"AZZ28799901\",\n" +
            "  \"policyDate\" : \"2021-03-01T19:00Z\",\n" +
            "  \"effectiveDate\" : \"2021-03-01T19:00Z\",\n" +
            "  \"expirationDate\" : \"2021-09-01T19:00Z\",\n" +
            "  \"policyTerm\" : \"6 Months\",\n" +
            "  \"policyStatus\" : \"Active\",\n" +
            "  \"communication\" : {\n" +
            "    \"mailingAddress\" : {\n" +
            "      \"streetAddress\" : \"2500 North 24th Street STE 100\",\n" +
            "      \"city\" : \"Phoenix\",\n" +
            "      \"state\" : \"AZ\",\n" +
            "      \"zipCode\" : \"85008\"\n" +
            "    },\n" +
            "    \"homePhone\" : \"8888888888\",\n" +
            "    \"email\" : \"supertest@hellotestdomain.org\"\n" +
            "  },\n" +
            "  \"insured\" : [ {\n" +
            "    \"firstName\" : \"Kris\",\n" +
            "    \"middleName\" : \"Paul\",\n" +
            "    \"lastName\" : \"Evans\",\n" +
            "    \"dateOfBirth\" : \"1982-04-21\",\n" +
            "    \"relationship\" : \"Insured\",\n" +
            "    \"licenseNumber\" : \"DR1234567890\",\n" +
            "    \"martialStatus\" : \"Single\",\n" +
            "    \"licenseState\" : \"AZ\",\n" +
            "    \"gender\" : \"Male\",\n" +
            "    \"hasSr22Filing\" : false,\n" +
            "    \"violations\" : [ {\n" +
            "      \"name\" : \"Following too closely\",\n" +
            "      \"code\" : \"28-730A\",\n" +
            "      \"violationDate\" : \"2020-11-20\"\n" +
            "    } ]\n" +
            "  }, {\n" +
            "    \"firstName\" : \"Jameson\",\n" +
            "    \"middleName\" : \"Bright\",\n" +
            "    \"lastName\" : \"Wisemen\",\n" +
            "    \"dateOfBirth\" : \"1990-08-10\",\n" +
            "    \"relationship\" : \"Relative/Other\",\n" +
            "    \"licenseNumber\" : \"DR1234567890\",\n" +
            "    \"martialStatus\" : \"Single\",\n" +
            "    \"licenseState\" : \"AZ\",\n" +
            "    \"gender\" : \"Male\",\n" +
            "    \"hasSr22Filing\" : false,\n" +
            "    \"violations\" : [ ]\n" +
            "  } ],\n" +
            "  \"properties\" : [ {\n" +
            "    \"coverages\" : [ {\n" +
            "      \"name\" : \"Bodily Injury Liability\",\n" +
            "      \"value\" : \"$25,000 each person / $50,000 each accident\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Collision\",\n" +
            "      \"value\" : \"$500 deductible each accident\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Custom or Additional Equipment\",\n" +
            "      \"value\" : \"Custom or Additional Equipment\",\n" +
            "      \"amount\" : 550\n" +
            "    }, {\n" +
            "      \"name\" : \"OTC / Comprehensive\",\n" +
            "      \"value\" : \"$500 deductible each accident\"\n" +
            "    }, {\n" +
            "      \"name\" : \"Property Damage Liability\",\n" +
            "      \"value\" : \"$15,000 each accident\"\n" +
            "    } ],\n" +
            "    \"address\" : {\n" +
            "      \"streetAddress\" : \"2500 North 24th Street STE 100\",\n" +
            "      \"city\" : \"Phoenix\",\n" +
            "      \"state\" : \"AZ\",\n" +
            "      \"zipCode\" : \"85008\"\n" +
            "    },\n" +
            "    \"year\" : 2018,\n" +
            "    \"make\" : \"Ford\",\n" +
            "    \"model\" : \"Edge SE\",\n" +
            "    \"style\" : \"SUV\",\n" +
            "    \"vehicleUse\" : \"Work (less than 20 miles)\"\n" +
            "  } ],\n" +
            "  \"excludedDrivers\" : [ {\n" +
            "    \"firstName\" : \"Link\",\n" +
            "    \"lastName\" : \"Thomas\",\n" +
            "    \"dateOfBirth\" : \"1990-11-20\",\n" +
            "    \"relationship\" : \"Friend\",\n" +
            "    \"hasSr22Filing\" : false,\n" +
            "    \"violations\" : [ ]\n" +
            "  } ],\n" +
            "  \"timezone\" : \"America/Phoenix\"\n" +
            "}";

    List<String> words = Arrays.asList("aback", "abaft", "abandoned", "abashed", "aberrant", "abhorrent", "abiding", "abject", "ablaze", "able", "abnormal", "aboard", "aboriginal", "abortive", "abounding", "abrasive", "abrupt", "absent", "absorbed", "absorbing", "abstracted", "absurd", "abundant", "abusive", "accept", "acceptable", "accessible", "accidental", "account", "accurate", "achiever", "acid", "acidic", "acoustic", "acoustics", "acrid", "act", "action", "activity", "actor", "actually", "ad hoc", "adamant", "adaptable", "add", "addicted", "addition", "adhesive", "adjoining", "adjustment", "admire", "admit", "adorable", "adventurous", "advertisement", "advice", "advise", "afford", "afraid", "aftermath", "afternoon", "afterthought", "aggressive", "agonizing", "agree", "agreeable", "agreement", "ahead", "air", "airplane", "airport", "ajar", "alarm", "alcoholic", "alert", "alike", "alive", "alleged", "allow", "alluring", "aloof", "amazing", "ambiguous", "ambitious", "amount", "amuck", "amuse", "amused", "amusement", "amusing", "analyze", "ancient", "anger", "angle", "angry", "animal", "animated", "announce", "annoy", "annoyed", "annoying", "answer", "ants", "anxious", "apathetic", "apologise", "apparatus", "apparel", "appear", "applaud", "appliance", "appreciate", "approval", "approve", "aquatic", "arch", "argue", "argument", "arithmetic", "arm", "army", "aromatic", "arrange", "arrest", "arrive", "arrogant", "art", "ashamed", "ask", "aspiring", "assorted", "astonishing", "attach", "attack", "attempt", "attend", "attract", "attraction", "attractive", "aunt", "auspicious", "authority", "automatic", "available", "average", "avoid", "awake", "aware", "awesome", "awful", "axiomatic", "babies", "baby", "back", "bad", "badge", "bag", "bait", "bake", "balance", "ball", "ban", "bang", "barbarous", "bare", "base", "baseball", "bashful", "basin", "basket", "basketball", "bat", "bath", "bathe", "battle", "bawdy", "bead", "beam", "bear", "beautiful", "bed", "bedroom", "beds", "bee", "beef", "befitting", "beg", "beginner", "behave", "behavior", "belief", "believe", "bell", "belligerent", "bells", "belong", "beneficial", "bent", "berry", "berserk", "best", "better", "bewildered", "big", "bike", "bikes", "billowy", "bird", "birds", "birth", "birthday", "bit", "bite", "bite-sized", "bitter", "bizarre", "black", "black-and-white", "blade", "bleach", "bless", "blind", "blink", "blood", "bloody", "blot", "blow", "blue", "blue-eyed", "blush", "blushing", "board", "boast", "boat", "boil", "boiling", "bolt", "bomb", "bone", "book", "books", "boorish", "boot", "border", "bore", "bored", "boring", "borrow", "bottle", "bounce", "bouncy", "boundary", "boundless", "bow", "box", "boy", "brainy", "brake", "branch", "brash", "brass", "brave", "brawny", "breakable", "breath", "breathe", "breezy", "brick", "bridge", "brief", "bright", "broad", "broken", "brother", "brown", "bruise", "brush", "bubble", "bucket", "building", "bulb", "bump", "bumpy", "burly", "burn", "burst", "bury", "bushes", "business", "bustling", "busy", "butter", "button", "buzz", "cabbage", "cable", "cactus", "cagey", "cake", "cakes", "calculate", "calculating", "calculator", "calendar", "call", "callous", "calm", "camera", "camp", "can", "cannon", "canvas", "cap", "capable", "capricious", "caption", "car", "card", "care", "careful", "careless", "caring", "carpenter", "carriage", "carry", "cars", "cart", "carve", "cast", "cat", "cats", "cattle", "cause", "cautious", "cave", "ceaseless", "celery", "cellar", "cemetery", "cent", "certain", "chalk", "challenge", "chance", "change", "changeable", "channel", "charge", "charming", "chase", "cheap", "cheat", "check", "cheer", "cheerful", "cheese", "chemical", "cherries", "cherry", "chess", "chew", "chicken", "chickens", "chief", "childlike", "children", "chilly", "chin", "chivalrous", "choke", "chop", "chubby", "chunky", "church", "circle", "claim", "clam", "clammy", "clap", "class", "classy", "clean", "clear", "clever", "clip", "cloistered", "close", "closed", "cloth", "cloudy", "clover", "club", "clumsy", "cluttered", "coach", "coal", "coast", "coat", "cobweb", "coherent", "coil", "cold", "collar", "collect", "color", "colorful", "colossal", "colour", "comb", "combative", "comfortable", "command", "committee", "common", "communicate", "company", "compare", "comparison", "compete", "competition", "complain", "complete", "complex", "concentrate", "concern", "concerned", "condemned", "condition", "confess", "confuse", "confused", "connect", "connection", "conscious", "consider", "consist", "contain", "continue", "control", "cooing", "cook", "cool", "cooperative", "coordinated", "copper", "copy", "corn", "correct", "cough", "count", "country", "courageous", "cover", "cow", "cowardly", "cows", "crabby", "crack", "cracker", "crash", "crate", "craven", "crawl", "crayon", "crazy", "cream", "creator", "creature", "credit", "creepy", "crib", "crime", "crook", "crooked", "cross", "crow", "crowd", "crowded", "crown", "cruel", "crush", "cry", "cub", "cuddly", "cultured", "cumbersome", "cup", "cure", "curious", "curl", "curly", "current", "curtain", "curve", "curved", "curvy", "cushion", "cut", "cute", "cycle", "cynical", "dad", "daffy", "daily", "dam", "damage", "damaged", "damaging", "damp", "dance", "dangerous", "dapper", "dare", "dark", "dashing", "daughter", "day", "dazzling", "dead", "deadpan", "deafening", "dear", "death", "debonair", "debt", "decay", "deceive", "decide", "decision", "decisive", "decorate", "decorous", "deep", "deeply", "deer", "defeated", "defective", "defiant", "degree", "delay", "delicate", "delicious", "delight", "delightful", "delirious", "deliver", "demonic", "depend", "dependent", "depressed", "deranged", "describe", "descriptive", "desert", "deserted", "deserve", "design", "desire", "desk", "destroy", "destruction", "detail", "detailed", "detect", "determined", "develop", "development", "devilish", "didactic", "different", "difficult", "digestion", "diligent", "dime", "dinner", "dinosaurs", "direction", "direful", "dirt", "dirty", "disagree", "disagreeable", "disappear", "disapprove", "disarm", "disastrous", "discover", "discovery", "discreet", "discussion", "disgusted", "disgusting", "disillusioned", "dislike", "dispensable", "distance", "distinct", "distribution", "disturbed", "divergent", "divide", "division", "dizzy", "dock", "doctor", "dog", "dogs", "doll", "dolls", "domineering", "donkey", "door", "double", "doubt", "doubtful", "downtown", "drab", "draconian", "drag", "drain", "dramatic", "drawer", "dream", "dreary", "dress", "drink", "drip", "driving", "drop", "drown", "drum", "drunk", "dry", "duck", "ducks", "dull", "dust", "dusty", "dynamic", "dysfunctional", "eager", "ear", "early", "earn", "earsplitting", "earth", "earthquake", "earthy", "easy", "eatable", "economic", "edge", "educate", "educated", "education", "effect", "efficacious", "efficient", "egg", "eggnog", "eggs", "eight", "elastic", "elated", "elbow", "elderly", "electric", "elegant", "elfin", "elite", "embarrass", "embarrassed", "eminent", "employ", "empty", "enchanted", "enchanting", "encourage", "encouraging", "end", "endurable", "energetic", "engine", "enjoy", "enormous", "enter", "entertain", "entertaining", "enthusiastic", "envious", "equable", "equal", "erect", "erratic", "error", "escape", "ethereal", "evanescent", "evasive", "even", "event", "examine", "example", "excellent", "exchange", "excite", "excited", "exciting", "exclusive", "excuse", "exercise", "exist", "existence", "exotic", "expand", "expansion", "expect", "expensive", "experience", "expert", "explain", "explode", "extend", "extra-large", "extra-small", "exuberant", "exultant", "eye", "eyes", "fabulous", "face", "fact", "fade", "faded", "fail", "faint", "fair", "fairies", "faithful", "fall", "fallacious", "false", "familiar", "famous", "fanatical", "fancy", "fang", "fantastic", "far", "far-flung", "farm", "fascinated", "fast", "fasten", "fat", "faulty", "fax", "fear", "fearful", "fearless", "feeble", "feeling", "feigned", "female", "fence", "fertile", "festive", "fetch", "few", "field", "fierce", "file", "fill", "film", "filthy", "fine", "finger", "finicky", "fire", "fireman", "first", "fish", "fit", "five", "fix", "fixed", "flag", "flagrant", "flaky", "flame", "flap", "flash", "flashy", "flat", "flavor", "flawless", "flesh", "flight", "flimsy", "flippant", "float", "flock", "flood", "floor", "flow", "flower", "flowers", "flowery", "fluffy", "fluttering", "fly", "foamy", "fog", "fold", "follow", "food", "fool", "foolish", "foot", "force", "foregoing", "forgetful", "fork", "form", "fortunate", "found", "four", "fowl", "fragile", "frail", "frame", "frantic", "free", "freezing", "frequent", "fresh", "fretful", "friction", "friend", "friendly", "friends", "frighten", "frightened", "frightening", "frog", "frogs", "front", "fruit", "fry", "fuel", "full", "fumbling", "functional", "funny", "furniture", "furry", "furtive", "future", "futuristic", "fuzzy", "gabby", "gainful", "gamy", "gaping", "garrulous", "gate", "gather", "gaudy", "gaze", "geese", "general", "gentle", "ghost", "giant", "giants", "giddy", "gifted", "gigantic", "giraffe", "girl", "girls", "glamorous", "glass", "gleaming", "glib", "glistening", "glorious", "glossy", "glove", "glow", "glue", "godly", "gold", "good", "goofy", "gorgeous", "government", "governor", "grab", "graceful", "grade", "grain", "grandfather", "grandiose", "grandmother", "grape", "grass", "grate", "grateful", "gratis", "gray", "grease", "greasy", "great", "greedy", "green", "greet", "grey", "grieving", "grin", "grip", "groan", "groovy", "grotesque", "grouchy", "ground", "group", "growth", "grubby", "gruesome", "grumpy", "guarantee", "guard", "guarded", "guess", "guide", "guiltless", "guitar", "gullible", "gun", "gusty", "guttural", "habitual", "hair", "haircut", "half", "hall", "hallowed", "halting", "hammer", "hand", "handle", "hands", "handsome", "handsomely", "handy", "hang", "hanging", "hapless", "happen", "happy", "harass", "harbor", "hard", "hard-to-find", "harm", "harmonious", "harmony", "harsh", "hat", "hate", "hateful", "haunt", "head", "heady", "heal", "health", "healthy", "heap", "heartbreaking", "heat", "heavenly", "heavy", "hellish", "help", "helpful", "helpless", "hesitant", "hideous", "high", "high-pitched", "highfalutin", "hilarious", "hill", "hissing", "historical", "history", "hobbies", "hole", "holiday", "holistic", "hollow", "home", "homeless", "homely", "honey", "honorable", "hook", "hop", "hope", "horn", "horrible", "horse", "horses", "hose", "hospitable", "hospital", "hot", "hour", "house", "houses", "hover", "hug", "huge", "hulking", "hum", "humdrum", "humor", "humorous", "hungry", "hunt", "hurried", "hurry", "hurt", "hushed", "husky", "hydrant", "hypnotic", "hysterical", "ice", "icicle", "icky", "icy", "idea", "identify", "idiotic", "ignorant", "ignore", "ill", "ill-fated", "ill-informed", "illegal", "illustrious", "imaginary", "imagine", "immense", "imminent", "impartial", "imperfect", "impolite", "important", "imported", "impossible", "impress", "improve", "impulse", "incandescent", "include", "income", "incompetent", "inconclusive", "increase", "incredible", "industrious", "industry", "inexpensive", "infamous", "influence", "inform", "inject", "injure", "ink", "innate", "innocent", "inquisitive", "insect", "insidious", "instinctive", "instruct", "instrument", "insurance", "intelligent", "intend", "interest", "interesting", "interfere", "internal", "interrupt", "introduce", "invent", "invention", "invincible", "invite", "irate", "iron", "irritate", "irritating", "island", "itch", "itchy", "jaded", "jagged", "jail", "jam", "jar", "jazzy", "jealous", "jeans", "jelly", "jellyfish", "jewel", "jittery", "jobless", "jog", "join", "joke", "jolly", "joyous", "judge", "judicious", "juggle", "juice", "juicy", "jumbled", "jump", "jumpy", "juvenile", "kaput", "keen", "kettle", "key", "kick", "kill", "kind", "kindhearted", "kindly", "kiss", "kittens", "kitty", "knee", "kneel", "knife", "knit", "knock", "knot", "knotty", "knowing", "knowledge", "knowledgeable", "known", "label", "labored", "laborer", "lace", "lackadaisical", "lacking", "ladybug", "lake", "lame", "lamentable", "lamp", "land", "language", "languid", "large", "last", "late", "laugh", "laughable", "launch", "lavish", "lazy", "lean", "learn", "learned", "leather", "left", "leg", "legal", "legs", "lethal", "letter", "letters", "lettuce", "level", "lewd", "library", "license", "lick", "lie", "light", "lighten", "like", "likeable", "limit", "limping", "line", "linen", "lip", "liquid", "list", "listen", "literate", "little", "live", "lively", "living", "load", "loaf", "lock", "locket", "lonely", "long", "long-term", "longing", "look", "loose", "lopsided", "loss", "loud", "loutish", "love", "lovely", "loving", "low", "lowly", "lucky", "ludicrous", "lumber", "lumpy", "lunch", "lunchroom", "lush", "luxuriant", "lying", "lyrical", "macabre", "machine", "macho", "maddening", "madly", "magenta", "magic", "magical", "magnificent", "maid", "mailbox", "majestic", "makeshift", "male", "malicious", "mammoth", "man", "manage", "maniacal", "many", "marble", "march", "mark", "marked", "market", "married", "marry", "marvelous", "mask", "mass", "massive", "match", "mate", "material", "materialistic", "matter", "mature", "meal", "mean", "measly", "measure", "meat", "meaty", "meddle", "medical", "meek", "meeting", "mellow", "melodic", "melt", "melted", "memorize", "memory", "men", "mend", "merciful", "mere", "mess up", "messy", "metal", "mice", "middle", "mighty", "military", "milk", "milky", "mind", "mindless", "mine", "miniature", "minister", "minor", "mint", "minute", "miscreant", "miss", "mist", "misty", "mitten", "mix", "mixed", "moan", "moaning", "modern", "moldy", "mom", "momentous", "money", "monkey", "month", "moon", "moor", "morning", "mother", "motion", "motionless", "mountain", "mountainous", "mourn", "mouth", "move", "muddle", "muddled", "mug", "multiply", "mundane", "murder", "murky", "muscle", "mushy", "mute", "mysterious", "nail", "naive", "name", "nappy", "narrow", "nasty", "nation", "natural", "naughty", "nauseating", "near", "neat", "nebulous", "necessary", "neck", "need", "needle", "needless", "needy", "neighborly", "nerve", "nervous", "nest", "new", "next", "nice", "nifty", "night", "nimble", "nine", "nippy", "nod", "noise", "noiseless", "noisy", "nonchalant", "nondescript", "nonstop", "normal", "north", "nose", "nostalgic", "nosy", "note", "notebook", "notice", "noxious", "null", "number", "numberless", "numerous", "nut", "nutritious", "nutty", "oafish", "oatmeal", "obedient", "obeisant", "obese", "obey", "object", "obnoxious", "obscene", "obsequious", "observant", "observation", "observe", "obsolete", "obtain", "obtainable", "occur", "ocean", "oceanic", "odd", "offbeat", "offend", "offer", "office", "oil", "old", "old-fashioned", "omniscient", "one", "onerous", "open", "opposite", "optimal", "orange", "oranges", "order", "ordinary", "organic", "ossified", "outgoing", "outrageous", "outstanding", "oval", "oven", "overconfident", "overflow", "overjoyed", "overrated", "overt", "overwrought", "owe", "own", "pack", "paddle", "page", "pail", "painful", "painstaking", "paint", "pale", "paltry", "pan", "pancake", "panicky", "panoramic", "paper", "parallel", "parcel", "parched", "park", "parsimonious", "part", "partner", "party", "pass", "passenger", "past", "paste", "pastoral", "pat", "pathetic", "pause", "payment", "peace", "peaceful", "pear", "peck", "pedal", "peel", "peep", "pen", "pencil", "penitent", "perfect", "perform", "periodic", "permissible", "permit", "perpetual", "person", "pest", "pet", "petite", "pets", "phobic", "phone", "physical", "picayune", "pick", "pickle", "picture", "pie", "pies", "pig", "pigs", "pin", "pinch", "pine", "pink", "pipe", "piquant", "pizzas", "place", "placid", "plain", "plan", "plane", "planes", "plant", "plantation", "plants", "plastic", "plate", "plausible", "play", "playground", "pleasant", "please", "pleasure", "plot", "plough", "plucky", "plug", "pocket", "point", "pointless", "poised", "poison", "poke", "polish", "polite", "political", "pollution", "poor", "pop", "popcorn", "porter", "position", "possess", "possessive", "possible", "post", "pot", "potato", "pour", "powder", "power", "powerful", "practice", "pray", "preach", "precede", "precious", "prefer", "premium", "prepare", "present", "preserve", "press", "pretend", "pretty", "prevent", "previous", "price", "pricey", "prick", "prickly", "print", "private", "probable", "produce", "productive", "profit", "profuse", "program", "promise", "property", "prose", "protect", "protective", "protest", "proud", "provide", "psychedelic", "psychotic", "public", "puffy", "pull", "pump", "pumped", "punch", "puncture", "punish", "punishment", "puny", "purple", "purpose", "purring", "push", "pushy", "puzzled", "puzzling", "quack", "quaint", "quarrelsome", "quarter", "quartz", "queen", "question", "questionable", "queue", "quick", "quickest", "quicksand", "quiet", "quill", "quilt", "quince", "quirky", "quiver", "quixotic", "quizzical", "rabbit", "rabbits", "rabid", "race", "racial", "radiate", "ragged", "rail", "railway", "rain", "rainstorm", "rainy", "raise", "rake", "rambunctious", "rampant", "range", "rapid", "rare", "raspy", "rat", "rate", "ratty", "ray", "reach", "reaction", "reading", "ready", "real", "realize", "reason", "rebel", "receipt", "receive", "receptive", "recess", "recognise", "recondite", "record", "red", "reduce", "redundant", "reflect", "reflective", "refuse", "regret", "regular", "reign", "reject", "rejoice", "relation", "relax", "release", "relieved", "religion", "rely", "remain", "remarkable", "remember", "remind", "reminiscent", "remove", "repair", "repeat", "replace", "reply", "report", "representative", "reproduce", "repulsive", "request", "rescue", "resolute", "resonant", "respect", "responsible", "rest", "retire", "return", "reward", "rhetorical", "rhyme", "rhythm", "rice", "rich", "riddle", "rifle", "right", "righteous", "rightful", "rigid", "ring", "rings", "rinse", "ripe", "risk", "ritzy", "river", "road", "roasted", "rob", "robin", "robust", "rock", "rod", "roll", "romantic", "roof", "room", "roomy", "root", "rose", "rot", "rotten", "rough", "round", "route", "royal", "rub", "ruddy", "rude", "ruin", "rule", "run", "rural", "rush", "rustic", "ruthless", "sable", "sack", "sad", "safe", "sail", "salt", "salty", "same", "sand", "sassy", "satisfy", "satisfying", "save", "savory", "saw", "scale", "scandalous", "scarce", "scare", "scarecrow", "scared", "scarf", "scary", "scatter", "scattered", "scene", "scent", "school", "science", "scientific", "scintillating", "scissors", "scold", "scorch", "scrape", "scratch", "scrawny", "scream", "screeching", "screw", "scribble", "scrub", "sea", "seal", "search", "seashore", "seat", "second", "second-hand", "secret", "secretary", "secretive", "sedate", "seed", "seemly", "selection", "selective", "self", "selfish", "sense", "separate", "serious", "servant", "serve", "settle", "shade", "shaggy", "shake", "shaky", "shallow", "shame", "shape", "share", "sharp", "shave", "sheep", "sheet", "shelf", "shelter", "shiny", "ship", "shirt", "shiver", "shivering", "shock", "shocking", "shoe", "shoes", "shop", "short", "show", "shrill", "shrug", "shut", "shy", "sick", "side", "sidewalk", "sigh", "sign", "signal", "silent", "silk", "silky", "silly", "silver", "simple", "simplistic", "sin", "sincere", "sink", "sip", "sister", "sisters", "six", "size", "skate", "ski", "skillful", "skin", "skinny", "skip", "skirt", "sky", "slap", "slave", "sleep", "sleepy", "sleet", "slim", "slimy", "slip", "slippery", "slope", "sloppy", "slow", "small", "smart", "smash", "smell", "smelly", "smile", "smiling", "smoggy", "smoke", "smooth", "snail", "snails", "snake", "snakes", "snatch", "sneaky", "sneeze", "sniff", "snobbish", "snore", "snotty", "snow", "soak", "soap", "society", "sock", "soda", "sofa", "soft", "soggy", "solid", "somber", "son", "song", "songs", "soothe", "sophisticated", "sordid", "sore", "sort", "sound", "soup", "sour", "space", "spade", "spare", "spark", "sparkle", "sparkling", "special", "spectacular", "spell", "spicy", "spiders", "spiffy", "spiky", "spill", "spiritual", "spiteful", "splendid", "spoil", "sponge", "spooky", "spoon", "spot", "spotless", "spotted", "spotty", "spray", "spring", "sprout", "spurious", "spy", "squalid", "square", "squash", "squeak", "squeal", "squealing", "squeamish", "squeeze", "squirrel", "stage", "stain", "staking", "stale", "stamp", "standing", "star", "stare", "start", "statement", "station", "statuesque", "stay", "steadfast", "steady", "steam", "steel", "steep", "steer", "stem", "step", "stereotyped", "stew", "stick", "sticks", "sticky", "stiff", "stimulating", "stingy", "stir", "stitch", "stocking", "stomach", "stone", "stop", "store", "stormy", "story", "stove", "straight", "strange", "stranger", "strap", "straw", "stream", "street", "strengthen", "stretch", "string", "strip", "striped", "stroke", "strong", "structure", "stuff", "stupendous", "stupid", "sturdy", "subdued", "subsequent", "substance", "substantial", "subtract", "succeed", "successful", "succinct", "suck", "sudden", "suffer", "sugar", "suggest", "suggestion", "suit", "sulky", "summer", "sun", "super", "superb", "superficial", "supply", "support", "suppose", "supreme", "surprise", "surround", "suspect", "suspend", "swanky", "sweater", "sweet", "sweltering", "swift", "swim", "swing", "switch", "symptomatic", "synonymous", "system", "table", "taboo", "tacit", "tacky", "tail", "talented", "talk", "tall", "tame", "tan", "tangible", "tangy", "tank", "tap", "tart", "taste", "tasteful", "tasteless", "tasty", "tawdry", "tax", "teaching", "team", "tearful", "tease", "tedious", "teeny", "teeny-tiny", "teeth", "telephone", "telling", "temper", "temporary", "tempt", "ten", "tendency", "tender", "tense", "tent", "tenuous", "terrible", "terrific", "terrify", "territory", "test", "tested", "testy", "texture", "thank", "thankful", "thaw", "theory", "therapeutic", "thick", "thin", "thing", "things", "thinkable", "third", "thirsty", "thought", "thoughtful", "thoughtless", "thread", "threatening", "three", "thrill", "throat", "throne", "thumb", "thunder", "thundering", "tick", "ticket", "tickle", "tidy", "tie", "tiger", "tight", "tightfisted", "time", "tin", "tiny", "tip", "tire", "tired", "tiresome", "title", "toad", "toe", "toes", "tomatoes", "tongue", "tooth", "toothbrush", "toothpaste", "toothsome", "top", "torpid", "touch", "tough", "tour", "tow", "towering", "town", "toy", "toys", "trace", "trade", "trail", "train", "trains", "tramp", "tranquil", "transport", "trap", "trashy", "travel", "tray", "treat", "treatment", "tree", "trees", "tremble", "tremendous", "trick", "tricky", "trip", "trite", "trot", "trouble", "troubled", "trousers", "truck", "trucks", "truculent", "true", "trust", "truthful", "try", "tub", "tug", "tumble", "turkey", "turn", "twig", "twist", "two", "type", "typical", "ubiquitous", "ugliest", "ugly", "ultra", "umbrella", "unable", "unaccountable", "unadvised", "unarmed", "unbecoming", "unbiased", "uncle", "uncovered", "understood", "underwear", "undesirable", "undress", "unequal", "unequaled", "uneven", "unfasten", "unhealthy", "uninterested", "unique", "unit", "unite", "unkempt", "unknown", "unlock", "unnatural", "unpack", "unruly", "unsightly", "unsuitable", "untidy", "unused", "unusual", "unwieldy", "unwritten", "upbeat", "uppity", "upset", "uptight", "use", "used", "useful", "useless", "utopian", "utter", "uttermost", "vacation", "vacuous", "vagabond", "vague", "valuable", "value", "van", "vanish", "various", "vase", "vast", "vegetable", "veil", "vein", "vengeful", "venomous", "verdant", "verse", "versed", "vessel", "vest", "victorious", "view", "vigorous", "violent", "violet", "visit", "visitor", "vivacious", "voice", "voiceless", "volatile", "volcano", "volleyball", "voracious", "voyage", "vulgar", "wacky", "waggish", "wail", "wait", "waiting", "wakeful", "walk", "wall", "wander", "wandering", "want", "wanting", "war", "warlike", "warm", "warn", "wary", "wash", "waste", "wasteful", "watch", "water", "watery", "wave", "waves", "wax", "way", "weak", "wealth", "wealthy", "weary", "weather", "week", "weigh", "weight", "welcome", "well-groomed", "well-made", "well-off", "well-to-do", "wet", "wheel", "whimsical", "whine", "whip", "whirl", "whisper", "whispering", "whistle", "white", "whole", "wholesale", "wicked", "wide", "wide-eyed", "wiggly", "wild", "wilderness", "willing", "wind", "window", "windy", "wine", "wing", "wink", "winter", "wipe", "wire", "wiry", "wise", "wish", "wistful", "witty", "wobble", "woebegone", "woman", "womanly", "women", "wonder", "wonderful", "wood", "wooden", "wool", "woozy", "word", "work", "workable", "worm", "worried", "worry", "worthless", "wound", "wrap", "wrathful", "wreck", "wren", "wrench", "wrestle", "wretched", "wriggle", "wrist", "writer", "writing", "wrong", "wry", "x-ray", "yak", "yam", "yard", "yarn", "yawn", "year", "yell", "yellow", "yielding", "yoke", "young", "youthful", "yummy", "zany", "zealous", "zebra", "zephyr", "zesty", "zinc", "zip", "zipper", "zippy", "zonked", "zoo", "zoom"
    );

    ResponseEntity homeOwners();


    ResponseEntity mobileHome();


    ResponseEntity renters();


    ResponseEntity auto();


    ResponseEntity address(@RequestParam String testParam);

    @GetMapping("search-words")
    ResponseEntity searchWords(@RequestParam("word") String word);
}
