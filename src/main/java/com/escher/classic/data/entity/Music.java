package com.escher.classic.data.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Music {
    @Id @GeneratedValue
    private Long musicId;
    
    private String title;
    private String kor;
    private String subTitle;
    private String subKor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "musicalFormId")
    private MusicalForm musicalFrom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eraId")
    private MusicEra era;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

}
