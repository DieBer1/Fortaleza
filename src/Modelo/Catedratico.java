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
public class Catedratico extends Profesor {

    private int numContratoSemestral;
    private int numHorasSemanales;
    private Double valorHora;
    private String categoria;

    public Catedratico() {
    }

    public Catedratico(int numContratoSemestral, int numHorasSemanales, Double valorHora) {
        this.numContratoSemestral = numContratoSemestral;
        this.numHorasSemanales = numHorasSemanales;
        this.valorHora = valorHora;
    }

    public Double calcularSalario() {

        Double sal = 0.0;

        if (this.getCategoria().contentEquals("Auxiliar")) {
            sal = this.getNumHorasSemanales() * 20000.0;
        }
        if (this.getCategoria().contentEquals("Asistente")) {
            sal = this.getNumHorasSemanales() * 30000.0;
        }
        if (this.getCategoria().contentEquals("Asociado")) {
            sal = this.getNumHorasSemanales() * 40000.0;
        }

        return sal;

    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumContratoSemestral() {
        return numContratoSemestral;
    }

    public void setNumContratoSemestral(int numContratoSemestral) {
        this.numContratoSemestral = numContratoSemestral;
    }

    public int getNumHorasSemanales() {
        return numHorasSemanales;
    }

    public void setNumHorasSemanales(int numHorasSemanales) {
        this.numHorasSemanales = numHorasSemanales;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

}