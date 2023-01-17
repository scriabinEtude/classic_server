package com.escher.classic.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Code {
    @Id @GeneratedValue
    private Long codeId;

    private String groupname;
    private String codename;
    private Integer seq;
    private String value;

}
