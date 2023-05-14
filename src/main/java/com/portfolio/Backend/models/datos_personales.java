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
@Table (name = "datosPersonales")
public class datos_personales {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    
    @Column(length = 40, nullable = false)
    private String nombre;
    
    @Column(length = 100, nullable = false)
    private String linkBanner;
    
    @Column(length = 100, nullable = false)
    private String linkFoto;
    
    @Column(length = 1000, nullable = false)
    private String acerca;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLinkBanner() {
        return linkBanner;
    }

    public void setLinkBanner(String linkBanner) {
        this.linkBanner = linkBanner;
    }

    public String getLinkFoto() {
        return linkFoto;
    }

    public void setLinkFoto(String linkFoto) {
        this.linkFoto = linkFoto;
    }

    public String getAcerca() {
        return acerca;
    }

    public void setAcerca(String acerca) {
        this.acerca = acerca;
    }
    
}
