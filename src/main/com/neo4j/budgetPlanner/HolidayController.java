package com.neo4j.budgetPlanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HolidayController {

    @Autowired
    private HolidayService holidayService;

    @GetMapping("/holidays")
    public ResponseEntity<Object> getAllHolidays() {

        return new ResponseEntity<>(holidayService.getAllHolidays(), HttpStatus.OK);
    }

    @GetMapping("/holidays/{id}")
    public ResponseEntity<Object> getHoliday(@PathVariable String id) {

        return new ResponseEntity<>(holidayService.getHoliday(id), HttpStatus.OK);
    }

    @PostMapping("/holidays")
    public ResponseEntity<Object> addHoliday(@RequestBody Holiday holiday) {

        holidayService.addHoliday(holiday);
        return new ResponseEntity<>("Holiday added", HttpStatus.OK);

    }

    @PutMapping("/holidays/{id}")
    public ResponseEntity<Object> updateHoliday(@RequestBody Holiday holiday) {

        holidayService.updateHoliday(holiday);
        return new ResponseEntity<>("Holiday updated", HttpStatus.OK);

    }

    @DeleteMapping("/holidays/{id}")
    public ResponseEntity<Object> deleteHoliday(@PathVariable String id) {

        holidayService.deleteHoliday(id);

        return new ResponseEntity<>("Holiday " + id + " Deleted", HttpStatus.OK);
    }

}
