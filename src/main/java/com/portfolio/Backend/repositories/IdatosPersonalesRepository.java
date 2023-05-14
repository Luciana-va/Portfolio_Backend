
package com.portfolio.Backend.repositories;

import com.portfolio.Backend.models.datos_personales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdatosPersonalesRepository extends JpaRepository<datos_personales, Long>{
    
}
