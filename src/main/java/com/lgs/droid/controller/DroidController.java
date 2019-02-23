package com.lgs.droid.controller;

import com.lgs.droid.model.Droid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/droid")
@Slf4j
public class DroidController {

    @PostMapping("/add")
    public ResponseEntity addDroid(@RequestBody Droid droid){

        return ResponseEntity.ok("Droid added");
    }

    @GetMapping("/get/{id}")
    public ResponseEntity getDroid(@PathVariable Long id){

        return ResponseEntity.ok("Droid found");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateDroid(@PathVariable Long id, @RequestBody Droid droid){

        return ResponseEntity.ok("Droid updated");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteDroid(@PathVariable Long id){

        return ResponseEntity.ok("Droid deleted");
    }


}
