/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Backend.services;

import com.portfolio.Backend.models.educacionModel;
import java.util.List;
import java.util.Optional;


public interface IeducacionService {
    
    public List getEducacion();
    
    public Optional getEducacionPorId(Long id);
    
    public educacionModel addEducacion(educacionModel edu);
    
    public void deleteEducacion (Long id);
    
}
