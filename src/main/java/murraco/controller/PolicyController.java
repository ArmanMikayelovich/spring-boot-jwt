package murraco.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

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


    ResponseEntity homeOwners();


    ResponseEntity mobileHome();


    ResponseEntity renters();


    ResponseEntity auto();


    ResponseEntity address(@RequestParam String testParam);
}
