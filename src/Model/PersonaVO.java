/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author beto-
 */
public class PersonaVO {

    private int idPers;
    private String nombrePers;
    private String apPaPers;
    private String apMaPers;
    private String domicilio;
    private String medContacPref;
    private String ocupacion;

    public int getIdPers() {
        return idPers;
    }

    public void setIdPers(int idPers) {
        this.idPers = idPers;
    }

    public String getNombrePers() {
        return nombrePers;
    }

    public void setNombrePers(String nombrePers) {
        this.nombrePers = nombrePers;
    }

    public String getApPaPers() {
        return apPaPers;
    }

    public void setApPaPers(String apPaPers) {
        this.apPaPers = apPaPers;
    }

    public String getApMaPers() {
        return apMaPers;
    }

    public void setApMaPers(String apMaPers) {
        this.apMaPers = apMaPers;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMedContacPref() {
        return medContacPref;
    }

    public void setMedContacPref(String medContacPref) {
        this.medContacPref = medContacPref;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

}
