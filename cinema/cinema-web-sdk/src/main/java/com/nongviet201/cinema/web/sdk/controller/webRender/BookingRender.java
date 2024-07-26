package com.nongviet201.cinema.web.sdk.controller.webRender;

import com.nongviet201.cinema.core.service.CityService;
import com.nongviet201.cinema.core.service.ComboService;
import com.nongviet201.cinema.web.sdk.service.MovieService;
import com.nongviet201.cinema.web.sdk.service.SeatService;
import com.nongviet201.cinema.web.sdk.service.ShowtimeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/booking/get")
@AllArgsConstructor
public class BookingRender {
    private final MovieService movieService;
    private final CityService cityService;
    private final ShowtimeService showtimeService;
    private final ComboService comboService;

    @GetMapping("/stage-one")
    public String getStageOneFragments(Model model) {
        model.addAttribute(
                "cities",
                cityService.getAllCities()
        );
        model.addAttribute(
                "movies",
                movieService.getAllPublishMoviesOrderByReleaseDate()
        );
        return "booking/stage/stage-one";
    }

    @GetMapping("/stage-two")
    public String getStageTwoFragments(
        @RequestParam(value = "movieId", required = true) Integer movieId,
        @RequestParam(value = "auditoriumId", required = true) Integer auditoriumId,
        Model model
    ) {
        model.addAttribute(
            "showtimes",
            showtimeService.getShowtimeByMovieIdAndAuditoriumId(movieId, auditoriumId)
        );
        return "booking/stage/stage-two";
    }

    @GetMapping("/stage-three")
    public String getStageThreeFragments(
        Model model
    ) {
        model.addAttribute(
                "combos",
                comboService.getAllCombo()
        );
        return "booking/stage/stage-three";
    }
}