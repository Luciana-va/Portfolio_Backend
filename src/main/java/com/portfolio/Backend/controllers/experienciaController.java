/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Backend.controllers;


import com.portfolio.Backend.models.experienciaModel;
import com.portfolio.Backend.services.IexperienciaService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/experiencia")
public class experienciaController {
    
    @Autowired 
    private IexperienciaService experienciaService;
    
    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<?> traerExperiencia(){
        return ResponseEntity.ok(experienciaService.getExperiencia());
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("{id}")
    public ResponseEntity<?> traerExperienciaId(@PathVariable Long id){
        Optional<experienciaModel> oExperiencia = experienciaService.getExperienciaPorId(id);
        if (oExperiencia.isPresent()){
            return ResponseEntity.ok(oExperiencia);
        }
        return ResponseEntity.notFound().build();
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<?> postExperiencia(@RequestBody experienciaModel expe){
        return ResponseEntity.status(HttpStatus.CREATED).body(experienciaService.addExperiencia(expe));
    }
    
    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarExperiencia(@PathVariable Long id){
       Optional<experienciaModel> oExperiencia = experienciaService.getExperienciaPorId(id);
       if (oExperiencia.isPresent()){
           experienciaService.deleteExpeiencia(id);
           return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
       }
       return ResponseEntity.notFound().build();
   }
    
    @CrossOrigin(origins = "*")
   @PutMapping("/{id}")
    public ResponseEntity<?> modificarExperienciaId(@PathVariable Long id, @RequestBody experienciaModel expe){
        Optional<experienciaModel> oExperiencia = experienciaService.getExperienciaPorId(id);
       if (oExperiencia.isPresent()){
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(experienciaService.addExperiencia(expe));
        }
        return ResponseEntity.notFound().build();
    }
    
}
