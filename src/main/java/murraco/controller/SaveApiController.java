package murraco.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping(value = "/api/save")
public class SaveApiController {

    private final List<String> dataList = new CopyOnWriteArrayList<>();

    @RequestMapping(value = "/post-data", method = {RequestMethod.POST, RequestMethod.PUT})
    public ResponseEntity<String> saveApiDate(@RequestBody String data, HttpServletRequest request) {
        if (dataList.size() > 10) {
            List<String> strings = dataList.subList(9, dataList.size() - 1);
            dataList.removeAll(strings);
        }
        dataList.add(0, data);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getAll() {
        return dataList;
    }
}
