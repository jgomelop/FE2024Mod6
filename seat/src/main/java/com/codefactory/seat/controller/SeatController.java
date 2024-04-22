package com.codefactory.seat.controller;

import com.codefactory.seat.model.Seat;
import com.codefactory.seat.service.IGenerateSeats;
import com.codefactory.seat.service.ISeat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/seats")
public class SeatController {

    @Autowired
    private ISeat seatService;

    @Autowired
    private IGenerateSeats generateSeats;

    @RequestMapping(value = "/getAvailableSeats", method = RequestMethod.GET)
    public Iterable<Seat> getAvailableSeats() {
        return seatService.getAvailableSeats("AVAILABLE");
    }

    @RequestMapping(value = "/generateSeats", method = RequestMethod.POST)
    public Iterable<Seat> generateSeats(@RequestParam String nSeats) {
        return generateSeats.createSeats(Integer.parseInt(nSeats));
    }


    



}
