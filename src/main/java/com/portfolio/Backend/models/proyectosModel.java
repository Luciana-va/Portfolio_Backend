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
@Table (name = "proyectos")
public class proyectosModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    
    @Column(length = 300, nullable = false)
    private String titulo;
    
    @Column(length = 300, nullable = false)
    private String descripcion;
    
    @Column(length = 200, nullable = false)
    private String linkImagen;
    
    @Column(length = 200, nullable = false)
    private String otros;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLinkImagen() {
        return linkImagen;
    }

    public void setLinkImagen(String linkImagen) {
        this.linkImagen = linkImagen;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }
    
    
    
}
