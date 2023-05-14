/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Backend.services;

import com.portfolio.Backend.models.proyectosModel;
import com.portfolio.Backend.repositories.IproyectosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class proyectosService implements IproyectosService{
    
    @Autowired
  private IproyectosRepository proyectosRepository;

    @Override
    public List getProyectos() {
        return proyectosRepository.findAll();
    }

    @Override
    public Optional getProyectoPorId(Long id) {
        return proyectosRepository.findById(id);
    }

    @Override
    public proyectosModel addProyecto(proyectosModel pro) {
        return proyectosRepository.save(pro);
    }

    @Override
    public void deleteProyecto(Long id) {
        proyectosRepository.deleteById(id);
    }
    
}
