/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Backend.controllers;

import com.portfolio.Backend.models.proyectosModel;
import com.portfolio.Backend.services.IproyectosService;
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
@RequestMapping("/api/proyectos")
public class proyectosController {
    
    @Autowired
    private IproyectosService proyectosService;
    
    
    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<?> traerproyectos(){
        return ResponseEntity.ok(proyectosService.getProyectos());
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("{id}")
    public ResponseEntity<?> traerProyectosId(@PathVariable Long id){
        Optional<proyectosModel> oProyectos = proyectosService.getProyectoPorId(id);
        if (oProyectos.isPresent()){
            return ResponseEntity.ok(oProyectos);
        }
        return ResponseEntity.notFound().build();
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<?> postProyecto(@RequestBody proyectosModel pro){
        return ResponseEntity.status(HttpStatus.CREATED).body(proyectosService.addProyecto(pro));
    }
    
    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarProyecto(@PathVariable Long id){
       Optional<proyectosModel> oProyectos = proyectosService.getProyectoPorId(id);
       if (oProyectos.isPresent()){
           proyectosService.deleteProyecto(id);
           return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
       }
       return ResponseEntity.notFound().build();
   }
    
    @CrossOrigin(origins = "*")
    @PutMapping("/{id}")
    public ResponseEntity<?> modificarProyectoId(@PathVariable Long id, @RequestBody proyectosModel pro){
        Optional<proyectosModel> oProyectos = proyectosService.getProyectoPorId(id);
        if (oProyectos.isPresent()){
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(proyectosService.addProyecto(pro));
        }
        return ResponseEntity.notFound().build();
    }
}
