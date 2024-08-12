package com.nongviet201.cinema.core.service;

import com.nongviet201.cinema.core.entity.cinema.Seat;

import java.util.List;

public interface SeatService {
    List<Seat> getAllSeatsByAuditoriumIdOrderBySeatColumnDesc(int auditoriumId);

    Seat getSeatById(int seatId);
    
}
