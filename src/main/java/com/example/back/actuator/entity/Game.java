package com.example.back.actuator.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String gameId;
    private String name;
    private String description;
    private String genre;
    private String studio;
    @Column(nullable = false, updatable = false)
    private Date createDate;



}
