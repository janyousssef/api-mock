package com.jan.mock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/model")
public class MockApiController {
    @GetMapping("/severity")
    public SeverityDTO getSeverity(@RequestParam("id") String id) {
        System.out.println("id = " + id);
        return new SeverityDTO(String.valueOf(Math.random()*100));
    }

    @GetMapping("/label")
    public LabelDTO getLabel(@RequestParam("id") String id) {
        System.out.println("id = " + id);
        return new LabelDTO(Label.covid.toString(), String.valueOf(Math.random()*100));
    }
}
