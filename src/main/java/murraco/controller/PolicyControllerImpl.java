package murraco.controller;


import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Policy controller.
 */
@Api
@RestController
@RequestMapping("/api/policy")
public class PolicyControllerImpl implements PolicyController {

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
    @GetMapping("/auto")
    public ResponseEntity auto() {
        return ResponseEntity.ok(PolicyController.POLICY_AUTO);
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

}
