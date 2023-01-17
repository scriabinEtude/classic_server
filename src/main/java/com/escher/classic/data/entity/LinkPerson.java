package com.escher.classic.data.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class LinkPerson {
    
    @Id @GeneratedValue
    private Long linkPersonId;

    @Enumerated(EnumType.STRING)
    private LinkPersonType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "linkId")
    private Link link;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personId")
    private Person person;
    
}
