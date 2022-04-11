package com.example.rulemanager;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping(value="/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Dto> test(@RequestBody Dto list) {
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
