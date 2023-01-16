package com.escher.classic.data.entity;

import javax.persistence.Entity;
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
    private VersionType type;
    private String min;
    private String max;
    private VersionForce force;
}
