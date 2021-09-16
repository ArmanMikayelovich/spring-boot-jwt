package murraco.controller;

import io.swagger.annotations.Api;
import murraco.JwtAuthServiceApp;
import murraco.model.ZipCodesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@RestController
@RequestMapping("")
@Api(tags = "ZIP CODES")
public class ZipControllerImpl {

    private static List<String> PARSED_ZIP_CODES = new ArrayList<>();


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
}
