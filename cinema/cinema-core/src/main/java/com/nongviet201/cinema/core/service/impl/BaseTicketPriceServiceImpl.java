package com.nongviet201.cinema.core.service.impl;

import com.nongviet201.cinema.core.model.entity.bill.BaseTicketPrice;
import com.nongviet201.cinema.core.model.entity.cinema.Cinema;
import com.nongviet201.cinema.core.model.enums.*;
import com.nongviet201.cinema.core.repository.BaseTicketPriceRepository;
import com.nongviet201.cinema.core.service.BaseTicketPriceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BaseTicketPriceServiceImpl implements BaseTicketPriceService {

    private final BaseTicketPriceRepository baseTicketPriceRepository;

    @Override
    public long getPrice(
        SeatType seatType,
        GraphicsType graphicsType,
        ScreeningTimeType screeningTimeType,
        DayType dayType,
        AuditoriumType auditoriumType,
        Cinema cinema
    ) {
        BaseTicketPrice price = baseTicketPriceRepository.findByCinemaAndAuditoriumTypeAndDayTypeAndScreeningTimeTypeAndGraphicsTypeAndSeatType(
            cinema,
            auditoriumType,
            dayType,
            screeningTimeType,
            graphicsType,
            seatType
        );

        return price.getPrice();
    }
}