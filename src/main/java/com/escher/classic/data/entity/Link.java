package com.escher.classic.data.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Link {
    @Id @GeneratedValue
    private Long linkId;
    private String etag;
    private String id;
    private String kind;
    private String localized;
    private String categoryId;
    private String channelId;
    private String channelTitle;
    private String title;
    private String description;
    private String liveBroadcastContent;
    private String localizedDescription;
    private String localizedTitle;
    private String publishedAt;
    private String tags;
    private String thumbnailDefault;
    private String thumbnailMedium;
    private String thumbnailStandard;
    private String thumbnailHigh;
    private String thumbnailMaxres;    

    @OneToMany(mappedBy = "music", fetch = FetchType.LAZY)
    private List<LinkMusic> linkMusics = new ArrayList<>();

    @OneToMany(mappedBy = "music", fetch = FetchType.LAZY)
    private List<LinkPerson> linkPerson = new ArrayList<>();
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

}
