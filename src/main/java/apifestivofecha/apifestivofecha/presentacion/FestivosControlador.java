package apifestivofecha.apifestivofecha.presentacion;

import org.springframework.web.bind.annotation.RestController;

import apifestivofecha.apifestivofecha.core.interfaces.servicios.IFestivosServicio;

import java.time.Month;
import java.time.Year;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/festivos/verificar")
public class FestivosControlador {

    private IFestivosServicio servicio;

    public FestivosControlador(IFestivosServicio servicio) {
        this.servicio = servicio;
    }
  
    @RequestMapping(value = "/{año}/{mes}/{dia}", method = RequestMethod.GET)
    public String verificarFestivos(@PathVariable int dia, @PathVariable int mes, @PathVariable int año) {
       if (validarFechaValida(dia, mes, año) == false) {
           return "Fecha No Valida";
       }else{
           if(servicio.verificarFestivos(dia, mes, año) == true){
               return "Es festivo";
           } else {
               return "No es festivo";
           }    
       }
    }

public boolean validarFechaValida(int dia, int mes, int año) {
   if (año > 0 && (mes > 0 && mes < 13)) {
       int diasDelMes = Month.of(mes).length(Year.isLeap(año));
       return dia > 0 && dia <= diasDelMes;
   }
   return false;
}
}