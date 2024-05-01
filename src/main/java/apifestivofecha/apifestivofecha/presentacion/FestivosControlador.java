// package apifestivofecha.apifestivofecha.presentacion;

// import org.springframework.web.bind.annotation.RestController;

// import apifestivofecha.apifestivofecha.core.entidades.Festivos;
// import apifestivofecha.apifestivofecha.core.interfaces.servicios.IFestivosServicio;

// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;

// @RestController
// @RequestMapping("/festivos/verificar")
// public class FestivosControlador {

//     private IFestivosServicio servicio;

//     public FestivosControlador(IFestivosServicio servicio) {
//         this.servicio = servicio;
//     }
   
//     @RequestMapping(value = "/{año}/{mes}/{dia}", method = RequestMethod.GET)
//     public Festivos verificarFestivos(@PathVariable int dia, @PathVariable int mes, @PathVariable int año) {
//         return servicio.verificarFestivos(dia, mes, año);
//     }

// }

