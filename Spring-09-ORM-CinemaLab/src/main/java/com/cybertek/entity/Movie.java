package com.cybertek.entity;

import com.cybertek.enums.MovieState;
import com.cybertek.enums.MovieType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;

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

    private MovieType type;

    private MovieState state;

    private BigDecimal price;

}
