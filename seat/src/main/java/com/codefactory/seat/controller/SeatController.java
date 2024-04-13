package com.codefactory.seat.controller;

import com.codefactory.seat.model.Seat;
import com.codefactory.seat.service.IGenerateSeats;
import com.codefactory.seat.service.ISeat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seats")
public class SeatController {

    @Autowired
    private ISeat seatService;

    @Autowired
    private IGenerateSeats generateSeats;

    @RequestMapping("/getAvailableSeats")
    public Iterable<Seat> getAvailableSeats(@RequestParam String status) {
        return seatService.getAvailableSeats(status.toUpperCase());
    }

    @RequestMapping("/generateSeats")
    public Iterable<Seat> generateSeats(@RequestParam String nSeats) {

        return generateSeats.createSeats(Integer.parseInt(nSeats));
    }



}
