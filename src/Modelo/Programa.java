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
import java.util.ArrayList;
import java.util.List;

public class Programa {
    
    List<Asignatura> asignaturaList = null;

    private String codigo;
    private String nombre;
    private Profesor director;

    public Programa() {
        asignaturaList = new ArrayList<Asignatura>();
        cargarAsignaturas();
        
    }

    public Programa(String codigo, String nombre, Profesor director) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.director = director;
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

    public Profesor getDirector() {
        return director;
    }

    public void setDirector(Profesor director) {
        this.director = director;
    }
    
    public void cargarAsignaturas(){
        Asignatura a1=new Asignatura();
        a1.toString();
        asignaturaList.add(a1);
        Asignatura a2=new Asignatura();
        a2.toString();
        asignaturaList.add(a2);
        Asignatura a3=new Asignatura();
        a3.toString();
        asignaturaList.add(a3);
    }

}
