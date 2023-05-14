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
@Table (name = "experiencia")
public class experienciaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    
    @Column(length = 300, nullable = false)
    private String descripcion;
    
    @Column(length = 10, nullable = false)
    private String fechaInicio;
    
    @Column(length = 10, nullable = true)
    private String fechaFinalizacion;
    
    @Column(length = 100, nullable = true)
    private String institucion;
    
    @Column(length = 200, nullable = true)
    private String linkLogo;
    
    @Column(length = 200, nullable = true)
    private String textoAlternativo;  

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getLinkLogo() {
        return linkLogo;
    }

    public void setLinkLogo(String linkLogo) {
        this.linkLogo = linkLogo;
    }

    public String getTextoAlternativo() {
        return textoAlternativo;
    }

    public void setTextoAlternativo(String textoAlternativo) {
        this.textoAlternativo = textoAlternativo;
    }
    
    
}
