package com.sda.sklepback.controllers;


import com.sda.sklepback.model.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class BaseController {


    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public ResponseEntity<Item> test() {
        return ResponseEntity.ok(new Item());
    }

}
