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
public class MusicTag {
    @Id @GeneratedValue
    private Long musicTagId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "musicId")
    private Music music;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personId")
    private Person person;
}
