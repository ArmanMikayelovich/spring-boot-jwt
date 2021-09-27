package murraco.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import murraco.model.CountryModel;
import murraco.model.CountryModelList;
import murraco.model.ZipCodesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@RestController
@RequestMapping("")
@Api(tags = "AUTOCOMPLETE API")
public class AutoCompleteControllerImpl {

    private static final List<String> PARSED_ZIP_CODES = new ArrayList<>();
    private static final List<CountryModel> PARSED_COUNTRY_LIST = new ArrayList<>();

    @Value("classpath:output.xml")
    Resource schemaFile;

    @Autowired
    private ResourceLoader resourceLoader;


    @GetMapping("/zip-codes")
    public ResponseEntity<ZipCodesModel> getZipCodes(@RequestParam(required = true) String code) {

        ZipCodesModel zipCodesModel = new ZipCodesModel();
        List<String> collect = getParsedZipCodes().stream().filter(zip -> zip.startsWith(code)).collect(Collectors.toList());

        zipCodesModel.setCodes(collect);
        return ResponseEntity.ok(zipCodesModel);
    }

    @GetMapping("/countries")
    public ResponseEntity<CountryModelList> getCountries(@RequestParam String code) {

        CountryModelList countryModelList = new CountryModelList();
        List<CountryModel> collect = getParsedCountries().stream().filter(zip -> zip.getName().toLowerCase().contains(code.toLowerCase())).collect(Collectors.toList());

        countryModelList.setCountryModelList(collect);
        return ResponseEntity.ok(countryModelList);
    }

    public List<String> getParsedZipCodes() {
        if (PARSED_ZIP_CODES.isEmpty()) {
            Resource resource = resourceLoader.getResource("classpath:output.txt");
            InputStream inputStream = null;
            try {
                inputStream = resource.getInputStream();
                Scanner scanner = new Scanner(inputStream);

                String str;
                while ((str = scanner.nextLine()) != null) {
                    PARSED_ZIP_CODES.add(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
        return PARSED_ZIP_CODES;
    }

    public List<CountryModel> getParsedCountries() {
        if (PARSED_COUNTRY_LIST.isEmpty()) {
            StringBuilder builder = new StringBuilder();
            Resource resource = resourceLoader.getResource("classpath:countries.json");
            InputStream inputStream = null;
            try {
                inputStream = resource.getInputStream();

                Scanner scanner = new Scanner(inputStream);

                String str;
                while ((str = scanner.nextLine()) != null) {
                    builder.append(str);
                }
            } catch (Exception e) {

            }
            try {
                CountryModelList countryModelList = new ObjectMapper().readValue(builder.toString(), CountryModelList.class);
                PARSED_COUNTRY_LIST.addAll(countryModelList.getCountryModelList());
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
        return PARSED_COUNTRY_LIST;
    }


}
