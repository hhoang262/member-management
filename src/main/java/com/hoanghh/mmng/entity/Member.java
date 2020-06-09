package com.hoanghh.mmng.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String fullname;
    private String alias;
    private Long refId;
    private String gender;
    private String dob;
    private String photoIdentifyUrl;
    private String story;

    private String phoneNumber;
    private String address;
    private String job;

    public Member() {
        this.fullname = "";
        this.alias = "";
        this.gender = "";
        this.dob = "";
        this.photoIdentifyUrl = "";
        this.story = "";
        this.phoneNumber = "";
        this.address = "";
        this.job = "";
    }
}
