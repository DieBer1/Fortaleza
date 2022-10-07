/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author COMPUMAX
 */
import java.util.List;

public class Asignatura {

    List<Grupo> grupoList = null;

    private String codigo;
    private String nombre;
    private Integer creditos;
    private Programa programa;

    public Asignatura() {
    }

    public Asignatura(String codigo, String nombre, Integer creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "grupoList=" + grupoList + ", codigo=" + codigo + ", nombre=" + nombre + ", creditos=" + creditos + ", programa=" + programa + '}';
    }

    
}
