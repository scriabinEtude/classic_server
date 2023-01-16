package com.escher.classic.data.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.escher.classic.data.enums.PersonType;

import lombok.Data;

@Entity
@Data
public class Person {
    @Id @GeneratedValue
    private Long personId;

    private String name;
    private String kor;

    private PersonType tyoe;
    
    private LocalDate birth;
    private LocalDate death;
    private String nation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @OneToMany(mappedBy = "composer")
    List<Music> musics = new ArrayList<Music>();
}
