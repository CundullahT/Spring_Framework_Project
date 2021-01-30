package com.cybertek.entity;

import com.cybertek.enums.MovieState;
import com.cybertek.enums.MovieType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(value = {"hibernate_Lazy_Initializer"}, ignoreUnknown = true)
public class Movie extends BaseEntity {

    private String name;

    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;

    private Integer duration;

    @Column(columnDefinition = "text")
    private String summary;

    @Enumerated(EnumType.STRING)
    private MovieType type;

    @Enumerated(EnumType.STRING)
    private MovieState state;

    private BigDecimal price;

    @ManyToMany
    @JoinTable(name = "movie_genre_rel",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genreList = new ArrayList<>();

    public Movie(String name, LocalDate releaseDate, Integer duration, MovieType type, MovieState state, BigDecimal price) {

        this.name = name;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.type = type;
        this.state = state;
        this.price = price;

    }

}
