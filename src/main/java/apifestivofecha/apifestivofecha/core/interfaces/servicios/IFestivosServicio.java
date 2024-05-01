package apifestivofecha.apifestivofecha.core.interfaces.servicios;

import apifestivofecha.apifestivofecha.core.entidades.Festivos;

public interface IFestivosServicio {
     
    public Festivos obtenerDia(int dia);

    public Festivos obtenerMes(int mes);

    public Festivos obtenerAño(int año);

    public Festivos verificarFestivos(int dia, int mes, int año);

}
