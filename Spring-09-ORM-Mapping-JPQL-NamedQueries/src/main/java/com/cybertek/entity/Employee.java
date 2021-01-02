package com.cybertek.entity;

import com.cybertek.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity//(name = "Employees")        ---         We can change the name of the entity too.
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Employee extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(columnDefinition = "DATE")      // No need to use this line if we have LocalDate or LocalDateTime
    private LocalDate hireDate;

    @ManyToOne
    @JoinColumn(name = "department")
    private Department department;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Integer salary;

    @ManyToOne
    @JoinColumn(name = "region_id")     // No need to put it in here but just put it to make sure it works for other databases too, just in case if database changes or whatever.
    private Region region;

}
