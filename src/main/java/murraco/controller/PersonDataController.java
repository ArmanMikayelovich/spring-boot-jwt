package murraco.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import murraco.model.person_data.PersonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/api/person-search")
public class PersonDataController {

    private static List<PersonData> PARSED_PERSON_MODELS = new ArrayList<>();


    @Autowired
    private ResourceLoader resourceLoader;

    @PostConstruct
    public void init() {
        getParsedPersons();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PersonData>> getPersonData(
            @RequestParam(value = "id", required = false) String id,
            @RequestParam(value = "status", required = false) String status,
            @RequestParam(value = "fullName", required = false) String fullName,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "phone", required = false) String phone,
            @RequestParam(value = "address", required = false) String address, HttpServletRequest request) {

        List<PersonData> list = getParsedPersons();

        if (id != null) {
            list = filterById(list, id);
        }
        if (status != null) {
            list = filterByStatus(list, status);
        }
        if (fullName != null) {
            list = filterByFullName(list, fullName);
        }
        if (email != null) {
            list = filterByEmail(list, email);
        }
        if (phone != null) {
            list = filterByPhone(list, phone);
        }
        if (address != null) {
            list = filterByAddress(list, address);
        }
        return ResponseEntity.ok(list);
    }

    private List<PersonData> filterById(List<PersonData> data, String id) {
        return data.stream().filter(person -> person.getId().toLowerCase().contains(id.toLowerCase())).collect(Collectors.toList());
    }

    private List<PersonData> filterByStatus(List<PersonData> data, String status) {
        return data.stream().filter(person -> person.getStatus().toLowerCase(Locale.ROOT).contains(status.toLowerCase(Locale.ROOT))).collect(Collectors.toList());
    }

    private List<PersonData> filterByFullName(List<PersonData> data, String fullName) {
        return data.stream()
                .filter(person -> person.getName().toLowerCase(Locale.ROOT).contains(fullName.toLowerCase(Locale.ROOT)))
                .collect(Collectors.toList());
    }

    private List<PersonData> filterByEmail(List<PersonData> data, String email) {
        return data.stream()
                .filter(person -> person.getEmail().toLowerCase(Locale.ROOT).contains(email.toLowerCase(Locale.ROOT)))
                .collect(Collectors.toList());
    }

    private List<PersonData> filterByPhone(List<PersonData> data, String phone) {
        return data.stream()
                .filter(person -> person.getPhone().toLowerCase(Locale.ROOT).contains(phone.toLowerCase(Locale.ROOT)))
                .collect(Collectors.toList());
    }

    private List<PersonData> filterByAddress(List<PersonData> data, String address) {
        return data.stream()
                .filter(person -> person.getAddress().toLowerCase(Locale.ROOT).contains(address.toLowerCase(Locale.ROOT)))
                .collect(Collectors.toList());
    }


    public List<PersonData> getParsedPersons() {
        if (PARSED_PERSON_MODELS.isEmpty()) {
            StringBuilder builder = new StringBuilder();
            Resource resource = resourceLoader.getResource("classpath:personData.json");
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

                ObjectMapper objectMapper = new ObjectMapper();
                PersonData[] models = objectMapper.readValue(builder.toString(), PersonData[].class);

                PARSED_PERSON_MODELS = Arrays.stream(models).collect(Collectors.toList());
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
        return PARSED_PERSON_MODELS;
    }

    public static List<PersonData> getParsedPersonModels() {
        return PARSED_PERSON_MODELS;
    }
}
