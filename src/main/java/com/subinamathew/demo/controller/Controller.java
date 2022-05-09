package com.subinamathew.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
    @GetMapping("/")
    public String hello() {
        return "hi!!";
    }

    @GetMapping("/api")
    public List<Map<String, String>> api() {

        List<Map<String, String>> listOfMaps = new ArrayList<Map<String, String>>();

        HashMap<String, String> detail = new HashMap<>();
        detail.put("url", "https://github.com/subinamathew/springboot-helloworld");
        detail.put("kind", "Springboot");
        detail.put("instance", "backend");
        listOfMaps.add(detail);

        HashMap<String, String> detail2 = new HashMap<>();
        detail2.put("url", "https://gitlab.com/gitpod-examples/fe-angular");
        detail2.put("kind", "Angular");
        detail.put("instance", "frontend");

        listOfMaps.add(detail2);
        
        return listOfMaps;
    }
}
