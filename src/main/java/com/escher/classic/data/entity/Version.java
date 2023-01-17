package com.escher.classic.data.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.escher.classic.data.enums.VersionForce;
import com.escher.classic.data.enums.VersionType;

import lombok.Data;

@Entity
@Data
public class Version {
    @Id @GeneratedValue
    private Long versionId;
    @Enumerated(EnumType.STRING)
    private VersionType type;
    private String min;
    private String max;
    @Enumerated(EnumType.STRING)
    private VersionForce force;
}
