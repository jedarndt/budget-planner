package com.neo4j.budgetPlanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HolidayService {

    @Autowired
    private HolidayRepository holidayRepository;

    public List<Holiday> getAllHolidays() {

        List<Holiday> holidays = new ArrayList<>();

        holidayRepository.findAll()
                         .forEach(holidays::add);
        return holidays;
    }

    public Holiday getHoliday(String id) {
        return holidayRepository.findOne(id);
    }

    public void addHoliday(Holiday holiday) {
        holidayRepository.save(holiday);
    }

    public void updateHoliday(Holiday holiday) {
        holidayRepository.save(holiday);
    }

    public void deleteHoliday(String id) {
        holidayRepository.delete(id);
    }

}
