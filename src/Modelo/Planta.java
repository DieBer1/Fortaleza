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
public class Planta extends Profesor {

    private Double salarioBasico;
    private int puntosSalariales;
    private Double valorPunto;
    private String Categoria;
    private int numeroResolucionNombramiento;
    private String fechaNombramiento;

    public Planta() {
    }

    public Planta(Double salarioBasico, int puntosSalariales, Double valorPunto, String Categoria, int numeroResolucionNombramiento, String fechaNombramiento) {
        this.salarioBasico = salarioBasico;
        this.puntosSalariales = puntosSalariales;
        this.valorPunto = valorPunto;
        this.Categoria = Categoria;
        this.numeroResolucionNombramiento = numeroResolucionNombramiento;
        this.fechaNombramiento = fechaNombramiento;
    }

    public Double calcularSalario() {

        Double sal = null;
        sal = this.getSalarioBasico() + (this.getPuntosSalariales() * this.getValorPunto());
        return sal;

    }

    public Double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(Double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public int getPuntosSalariales() {
        return puntosSalariales;
    }

    public void setPuntosSalariales(int puntosSalariales) {
        this.puntosSalariales = puntosSalariales;
    }

    public Double getValorPunto() {
        return valorPunto;
    }

    public void setValorPunto(Double valorPunto) {
        this.valorPunto = valorPunto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getNumeroResolucionNombramiento() {
        return numeroResolucionNombramiento;
    }

    public void setNumeroResolucionNombramiento(int numeroResolucionNombramiento) {
        this.numeroResolucionNombramiento = numeroResolucionNombramiento;
    }

    public String getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(String fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

}

