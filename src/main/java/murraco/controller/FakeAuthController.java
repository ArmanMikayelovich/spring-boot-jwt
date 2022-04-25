package murraco.controller;

import murraco.model.CarModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@RestController
@RequestMapping("/api/auths/")
public class FakeAuthController {

    @GetMapping("basic")
    public ResponseEntity httpBasic(HttpServletRequest request) {

        String authorization = request.getHeader("Authorization");
        if (Objects.equals(authorization, "Basic cm9vdDpyb290")) {
            CarModel body = new CarModel();
            body.setModel("M5");
            body.setBrand("BMW");
            return ResponseEntity.ok(body);
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }

    @GetMapping("token")
    public ResponseEntity token(HttpServletRequest request) {

        String authorization = request.getHeader("Authorization");
        if (authorization.equals("important_token")) {
            CarModel body = new CarModel();
            body.setModel("M5");
            body.setBrand("BMW");
            return ResponseEntity.ok(body);
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }
}
