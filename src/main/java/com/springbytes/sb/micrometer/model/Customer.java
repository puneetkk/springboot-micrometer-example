package com.springbytes.sb.micrometer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Data
@Entity
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator", sequenceName = "HIBERNATE_SEQUENCE")
    private Long id;
    @Version
    private Long version;
    private String fname;
    private String lname;

    public Customer(){}

    public Customer(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }

}
