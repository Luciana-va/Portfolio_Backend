/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Backend.services;


import com.portfolio.Backend.models.proyectosModel;
import java.util.List;
import java.util.Optional;


public interface IproyectosService {
    
    public List getProyectos();
    
    public Optional getProyectoPorId(Long id);
    
    public proyectosModel addProyecto(proyectosModel pro);
    
    public void deleteProyecto (Long id);
    
}
