/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Backend.services;



import com.portfolio.Backend.models.experienciaModel;
import java.util.List;
import java.util.Optional;


public interface IexperienciaService {
    
    public List getExperiencia();
    
    public Optional getExperienciaPorId(Long id);
    
    public experienciaModel addExperiencia(experienciaModel expe);
    
    public void deleteExpeiencia (Long id);
    
}
