package com.nongviet201.cinema.core.repository;

import com.nongviet201.cinema.core.entity.bill.BaseTicketPrice;
import com.nongviet201.cinema.core.entity.cinema.Cinema;
import com.nongviet201.cinema.core.model.enums.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseTicketPriceRepository extends JpaRepository<BaseTicketPrice, Integer> {

    BaseTicketPrice findByCinemaAndAuditoriumTypeAndDayTypeAndScreeningTimeTypeAndGraphicsTypeAndSeatType(
        Cinema cinema,
        AuditoriumType auditoriumType,
        DayType dayType,
        ScreeningTimeType screeningTimeType,
        GraphicsType graphicsType,
        SeatType seatType
    );
}
