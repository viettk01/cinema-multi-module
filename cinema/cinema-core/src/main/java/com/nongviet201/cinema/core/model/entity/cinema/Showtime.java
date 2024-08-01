package com.nongviet201.cinema.core.model.entity.cinema;

import com.nongviet201.cinema.core.model.entity.movie.Movie;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "showtime")
public class Showtime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate screeningDate;
    private LocalTime startTime;
    private LocalTime endTime;

    @ManyToOne
    @JoinColumn(name = "movies_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name= "auditorium_id")
    private Auditorium auditorium;
}
