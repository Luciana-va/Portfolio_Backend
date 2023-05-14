/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Backend.controllers;


import com.portfolio.Backend.models.educacionModel;
import com.portfolio.Backend.services.IeducacionService;
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
@RequestMapping("/api/educacion")
public class educacionController {
    
    @Autowired 
    private IeducacionService educacionService;
    
    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<?> traerEducacion(){
        return ResponseEntity.ok(educacionService.getEducacion());
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("{id}")
    public ResponseEntity<?> traerEducacionId(@PathVariable Long id){
        Optional<educacionModel> oEducacion = educacionService.getEducacionPorId(id);
        if (oEducacion.isPresent()){
            return ResponseEntity.ok(oEducacion);
        }
        return ResponseEntity.notFound().build();
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<?> postEducacion(@RequestBody educacionModel edu){
        return ResponseEntity.status(HttpStatus.CREATED).body(educacionService.addEducacion(edu));
    }
    
    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarEducacion(@PathVariable Long id){
       Optional<educacionModel> oEducacion = educacionService.getEducacionPorId(id);
       if (oEducacion.isPresent()){
           educacionService.deleteEducacion(id);
           return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
       }
       return ResponseEntity.notFound().build();
   }
   
   @CrossOrigin(origins = "*")
   @PutMapping("/{id}")
    public ResponseEntity<?> modificarEducacionId(@PathVariable Long id, @RequestBody educacionModel edu){
        Optional<educacionModel> oEducacion = educacionService.getEducacionPorId(id);
        if (oEducacion.isPresent()){
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(educacionService.addEducacion(edu));
        }
        return ResponseEntity.notFound().build();
    }
    
}
