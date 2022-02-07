package murraco.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.swagger.annotations.Api;
import murraco.model.model_claim.ClaimModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * The type Policy controller.
 */
@Api
@RestController
@RequestMapping("/api/policy")
public class PolicyControllerImpl implements PolicyController {


    private static List<ClaimModel> PARSED_POLICY_MODELS = new ArrayList<>();

    @Autowired
    private ResourceLoader resourceLoader;


    @GetMapping(value = "auto",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ClaimModel>> getCountries(@RequestParam(value = "policyNumber", required = false) String policyNumber) {

        if (policyNumber == null) {
            return ResponseEntity.ok(getParsedClaims());
        }

        List<ClaimModel> collect = getParsedClaims().stream().filter(claim -> Objects.equals(claim.getPolicyNumber(), policyNumber)).collect(Collectors.toList());

        return ResponseEntity.ok(collect);
    }

    @Override
    @GetMapping("/home-owners")
    public ResponseEntity homeOwners() {
        return ResponseEntity.ok(PolicyController.POLICY_HOME_OWNERS);
    }

    @Override
    @GetMapping("/mobile-home")
    public ResponseEntity mobileHome() {
        return ResponseEntity.ok(PolicyController.POLICY_MOBILE_HOME);
    }

    @Override
    @GetMapping("/renters")
    public ResponseEntity renters() {
        return ResponseEntity.ok(PolicyController.POLICY_RENTERS);
    }

    @Override
    @GetMapping("/address")
    public ResponseEntity address(@RequestParam String testParam) {
        return ResponseEntity.ok("{\n" +
                "  \"fullAddress\":\"" + testParam + "\"\n" +
                "}");
    }

    @Override
    @GetMapping("search-words")
    public ResponseEntity searchWords(@RequestParam("word") String word) {

        List<String> filtered = words.stream()
                .filter(each -> each.contains(word))
                .collect(Collectors.toList());
        HashMap<String, List<String>> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("array", filtered);
        return ResponseEntity.ok(objectObjectHashMap);
    }





    public List<ClaimModel> getParsedClaims() {
        if (PARSED_POLICY_MODELS.isEmpty()) {
            StringBuilder builder = new StringBuilder();
            Resource resource = resourceLoader.getResource("classpath:claims.json");
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
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ");
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.registerModule(new JavaTimeModule());
                objectMapper.setDateFormat(simpleDateFormat);
                ClaimModel[] models = objectMapper.readValue(builder.toString(), ClaimModel[].class);

                PARSED_POLICY_MODELS = Arrays.stream(models).collect(Collectors.toList());
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
        return PARSED_POLICY_MODELS;
    }
}
