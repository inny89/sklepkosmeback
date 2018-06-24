package com.sda.sklepback.controllers;


import com.sda.sklepback.model.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class BaseController {


    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public ResponseEntity<Item> test() {
        return ResponseEntity.ok(new Item());
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<Item> search(){
        return
    }

}
