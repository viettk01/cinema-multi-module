package com.nongviet201.cinema.web.sdk.service;

import com.nongviet201.cinema.core.model.entity.cinema.Showtime;
import java.util.List;

public interface ShowtimeService {
    List<Showtime> getShowtimeByMovieIdAndCityId(int movieId, int cityId);
}