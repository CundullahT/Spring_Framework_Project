package com.cybertek.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @JsonIgnore
    @Column(name = "create_date", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @JsonIgnore
    @Column(name = "updated_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;

    @JsonIgnore
    @Column(name = "user_created", updatable = false)
    private Integer createUserId;

    @JsonIgnore
    @Column(name = "user_updated", nullable = false)
    private Integer updateUserId;

    @PrePersist
    private void onPrePersist(){
        this.createdDate = new Date();
        this.updatedDate = new Date();
        this.createUserId = 1;
        this.updateUserId = 1;
    }

    @PreUpdate
    private void onPreUpdate(){
        this.updatedDate = new Date();
        this.updateUserId = 1;
    }

}
