package com.escher.classic.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.escher.classic.data.enums.UserStatus;
import com.escher.classic.data.enums.UserType;

import lombok.Data;

@Entity
@Data
public class User {
    @Id @GeneratedValue
    private Long userId;
    private String provider;
    private String password;
    private String nickname;
    private UserStatus status;
    private UserType type;
    private boolean verified;
    private String platform;
    private String device;
    private String version;
}
