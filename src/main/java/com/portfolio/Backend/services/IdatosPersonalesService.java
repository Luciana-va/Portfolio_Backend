/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Backend.services;

import com.portfolio.Backend.models.datos_personales;
import java.util.List;
import java.util.Optional;


public interface IdatosPersonalesService {
    
    public List getDatosPers();
    
    public Optional getDatoPer(Long id);
    
    public datos_personales addDatoPer(datos_personales dato);
    
    public void deleteDatoPer (Long id);
    
}
