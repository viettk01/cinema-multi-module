package com.nongviet201.cinema.core.repository;

import com.nongviet201.cinema.core.model.entity.cinema.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {
}