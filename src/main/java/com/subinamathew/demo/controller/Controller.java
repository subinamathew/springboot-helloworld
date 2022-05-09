package com.subinamathew.demo.controller;

import java.util.HashMap;
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
    public Map<String,Map> api() {
        HashMap<String, Map> map = new HashMap<>();
        HashMap<String, String> detail = new HashMap<>();
        detail.put("url", "https://github.com/subinamathew/springboot-helloworld");
        detail.put("kind", "Springboot");
        map.put("backend",detail );
        HashMap<String, String> detail2 = new HashMap<>();
        detail2.put("url", "https://gitlab.com/gitpod-examples/fe-angular");
        detail2.put("kind", "Angular");
        map.put("frontend",detail2 );
        return map;
    }
}
