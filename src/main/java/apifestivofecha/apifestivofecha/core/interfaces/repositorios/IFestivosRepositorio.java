package apifestivofecha.apifestivofecha.core.interfaces.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apifestivofecha.apifestivofecha.core.entidades.Festivos;

@Repository
public interface IFestivosRepositorio extends JpaRepository<Festivos, Integer> {
    
}
