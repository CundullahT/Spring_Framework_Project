package com.cybertek.entity;

import com.cybertek.enums.MovieState;
import com.cybertek.enums.MovieType;
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

    public Movie(String name, LocalDate releaseDate, Integer duration, String summary, MovieType type, MovieState state, BigDecimal price) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.summary = summary;
        this.type = type;
        this.state = state;
        this.price = price;
    }

}
