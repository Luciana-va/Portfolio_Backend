/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Backend.controllers;

import com.portfolio.Backend.models.datos_personales;
import com.portfolio.Backend.services.IdatosPersonalesService;
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
@RequestMapping("/api/datosPersonales")
public class datosPersonalesController {
    
    @Autowired 
    private IdatosPersonalesService datosPersonalesService;
    
    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<?> traerDatos(){
        return ResponseEntity.ok(datosPersonalesService.getDatosPers());
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("{id}")
    public ResponseEntity<?> traerDatoId(@PathVariable Long id){
        Optional<datos_personales> oDatosPersonales = datosPersonalesService.getDatoPer(id);
        if (oDatosPersonales.isPresent()){
            return ResponseEntity.ok(oDatosPersonales);
        }
        return ResponseEntity.notFound().build();
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<?> postDato(@RequestBody datos_personales dato){
        return ResponseEntity.status(HttpStatus.CREATED).body(datosPersonalesService.addDatoPer(dato));
    }
    
    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
   public ResponseEntity<?> eliminarDato(@PathVariable Long id){
       Optional<datos_personales> oDatosPersonales = datosPersonalesService.getDatoPer(id);
       if (oDatosPersonales.isPresent()){
           datosPersonalesService.deleteDatoPer(id);
           return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
       }
       return ResponseEntity.notFound().build();
   }
   
   @CrossOrigin(origins = "*") 
   @PutMapping("/{id}")
    public ResponseEntity<?> modificarUsuarioId(@PathVariable Long id, @RequestBody datos_personales dato){
        Optional<datos_personales> oDatosPersonales = datosPersonalesService.getDatoPer(id);
        if (oDatosPersonales.isPresent()){
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(datosPersonalesService.addDatoPer(dato));
        }
        return ResponseEntity.notFound().build();
    }
    
}
