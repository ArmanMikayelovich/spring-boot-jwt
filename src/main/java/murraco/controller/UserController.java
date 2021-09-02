package murraco.controller;

import io.swagger.annotations.*;
import murraco.dto.UserDataDTO;
import murraco.model.Role;
import murraco.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("")
@Api(tags = "users")
public class UserController {


    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @GetMapping("/token")
    public ResponseEntity<Map<String,String>> signup() {
      UserDataDTO userDataDTO = new UserDataDTO();
      userDataDTO.setUsername("SUPER_ADMIN");
      userDataDTO.getRoles().add(Role.ROLE_ADMIN);

        String token = jwtTokenProvider.createToken(userDataDTO.getUsername(), userDataDTO.getRoles());
        HashMap<String, String> map = new HashMap<>();
        map.put("token_type", "Bearer");
        map.put("access_token", token);

        return ResponseEntity.ok(map);

    }

}
