package com.cybertek.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(value = {"hibernate_Lazy_Initializer"}, ignoreUnknown = true)
public class MovieCinema extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;

    public MovieCinema(LocalDateTime dateTime) {

        this.dateTime = dateTime;

    }

    @Override
    public String toString() {

        return "MovieCinema{" +
                "dateTime=" + dateTime +
                '}';

    }

}
