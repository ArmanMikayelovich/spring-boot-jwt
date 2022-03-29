package murraco.controller;

import murraco.model.CarModel;
import murraco.model.person_data.PersonData;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/api/deep-json")
public class DuplicableBlockTestController {

    @GetMapping(value = "/get-cars-by-year", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CarModel>> getCarByYear(@RequestParam(required = false) Integer year) {
        List<CarModel> carModels = generateCarData();
        if (year != null) {

           carModels = carModels.stream().filter(x -> x.getYear().equals(year)).collect(Collectors.toList());
        }
        return ResponseEntity.ok(carModels);
    }


    private List<CarModel> generateCarData() {
        List<CarModel> carModels = new ArrayList<>();
        ArrayList<String> countries = new ArrayList<>();
        ArrayList<String> brands = new ArrayList () {{
            add("BMW");
            add("KIA");
            add("NISSAN");
        }};
        List<PersonData> parsedPersonModels = PersonDataController.getParsedPersonModels();


        Random rand = new Random();

        countries.add("Afghanistan");
        countries.add("American Samoa");
        countries.add("Angola");
        countries.add("Armenia");
        countries.add("Bahamas");
        countries.add("Brazil");
        countries.add("Canada");
        countries.add("Dominican Republic");
        countries.add("Estonia");
        countries.add("Finland");
        countries.add("Germany");
        countries.add("Georgia");
        countries.add("Iraq");
        countries.add("Kazakhstan");

        int startYear = 2000;
        for (int x = 0; x < 5; x++) {
            for (int y= 0; y < rand.nextInt(5)+5; y++) {
                CarModel carModel = new CarModel();
                carModel.setYear(startYear+x);
                carModel.setBrand(brands.get(rand.nextInt(3)));

                carModel.getCountriesWhereTheCarWas().add(countries.get(rand.nextInt(13)));
                carModel.getCountriesWhereTheCarWas().add(countries.get(rand.nextInt(13)));
                carModel.getCountriesWhereTheCarWas().add(countries.get(rand.nextInt(13)));

                carModel.setDescription(generateRandomString(rand,150));
                carModel.setModel(generateRandomString(rand, 8));
                carModel.setOnBoardComputer(rand.nextBoolean());
                carModel.setGasEquipment(rand.nextBoolean());
                carModel.setAudioSystem(rand.nextBoolean());
                carModel.setAutoDrive(rand.nextBoolean());

                int random1 = rand.nextInt(parsedPersonModels.size());
                int random2 = rand.nextInt(parsedPersonModels.size());
                int random3 = rand.nextInt(parsedPersonModels.size());
                int random4 = rand.nextInt(parsedPersonModels.size());
                int random5 = rand.nextInt(parsedPersonModels.size());

                carModel.getDrivers().add(parsedPersonModels.get(random1));
                carModel.getDrivers().add(parsedPersonModels.get(random2));
                carModel.getDrivers().add(parsedPersonModels.get(random3));
                carModel.getDrivers().add(parsedPersonModels.get(random4));
                carModel.getDrivers().add(parsedPersonModels.get(random5));
                carModels.add(carModel);
            }
        }
        return carModels;
    }


    public String generateRandomString(Random random, int length) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        return buffer.toString();
    }
}
