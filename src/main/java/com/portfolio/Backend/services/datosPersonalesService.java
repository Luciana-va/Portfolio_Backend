/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Backend.services;

import com.portfolio.Backend.models.datos_personales;
import com.portfolio.Backend.repositories.IdatosPersonalesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class datosPersonalesService implements IdatosPersonalesService{
    
  @Autowired
  private IdatosPersonalesRepository datosPersonalesRepository;


    @Override
    public List getDatosPers() {
        return datosPersonalesRepository.findAll();
    }

    @Override
    public Optional getDatoPer(Long id) {
        return datosPersonalesRepository.findById(id);
    }

    @Override
    public datos_personales addDatoPer(datos_personales dato) {
        return datosPersonalesRepository.save(dato);
    }

    @Override
    public void deleteDatoPer(Long id) {
        datosPersonalesRepository.deleteById(id);
    }
    
}
