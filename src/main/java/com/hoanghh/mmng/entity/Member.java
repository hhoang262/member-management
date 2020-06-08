package com.hoanghh.mmng.entity;

import lombok.Data;

import javax.persistence.*;


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
}
