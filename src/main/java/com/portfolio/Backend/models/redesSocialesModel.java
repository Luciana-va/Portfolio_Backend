/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "redesSociales")
public class redesSocialesModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    
    @Column(length = 150, nullable = false)
    private String linkFacebook;
    
    @Column(length = 150, nullable = false)
    private String linkInstagram;
    
    @Column(length = 150, nullable = false)
    private String linkLinkelin;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getLinkFacebook() {
        return linkFacebook;
    }

    public void setLinkFacebook(String linkFacebook) {
        this.linkFacebook = linkFacebook;
    }

    public String getLinkInstagram() {
        return linkInstagram;
    }

    public void setLinkInstagram(String linkInstagram) {
        this.linkInstagram = linkInstagram;
    }

    public String getLinkLinkelin() {
        return linkLinkelin;
    }

    public void setLinkLinkelin(String linkLinkelin) {
        this.linkLinkelin = linkLinkelin;
    }
    
    
    
}
