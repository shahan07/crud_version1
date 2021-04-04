package com.example.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PERSON_TBL")
public class Person {

    @Id
    //@GeneratedValue
    private Long id;
    private String name;
    private String email;
    //static LocalDateTime dob;
    //private Timestamp useraddat;
    //private Timestamp userupdateat;
}
