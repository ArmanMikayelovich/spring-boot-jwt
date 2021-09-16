package murraco.controller;

import io.swagger.annotations.Api;
import murraco.model.ZipCodesModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("")
@Api(tags = "ZIP CODES")
public class ZipControllerImpl {

    private static final List<String> PARSED_ZIP_CODES = Arrays.asList(ZipController.FULL_ZIP_CODES.split(","));


    @PostMapping("/zip")
    public ResponseEntity<ZipCodesModel> getZipCodes(@RequestParam(required = true) String code) {

        ZipCodesModel zipCodesModel = new ZipCodesModel();
        List<String> collect = PARSED_ZIP_CODES.stream().filter(zip -> zip.startsWith(code)).collect(Collectors.toList());

        zipCodesModel.setCodes(collect);
        return ResponseEntity.ok(zipCodesModel);
    }


}
