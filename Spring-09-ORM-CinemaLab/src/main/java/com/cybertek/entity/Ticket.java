package com.cybertek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Ticket extends BaseEntity {

    @Column(name = "seat_number")
    private Integer seatNumber;

    @Column(name = "row_number")
    private Integer rowNumber;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime localDateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private MovieCinema movieCinema;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Ticket(Integer seatNumber, Integer rowNumber, LocalDateTime localDateTime) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.localDateTime = localDateTime;
    }

}
