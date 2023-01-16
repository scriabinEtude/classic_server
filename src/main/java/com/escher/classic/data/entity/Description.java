package com.escher.classic.data.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.escher.classic.data.enums.DescriptionStatus;
import com.escher.classic.data.enums.LangType;

import lombok.Data;

@Entity
@Data
public class Description {
    @Id @GeneratedValue
    private Long descriptionId;

    private String refTableName;
    private String refTableId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "descriptionId")
    private Description parent;
    private int depth;
    private LangType lang;
    private String title;
    private String description;
    private DescriptionStatus status;

    @OneToMany(mappedBy = "description", fetch = FetchType.LAZY)
    private List<DescriptionReport> descriptionReports = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    private int likeCount;
    private int reportCount;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;


    
}