/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lote;

/**
 *
 * @author Estudiantes
 */
public class Lote {
    private String varietal;
    private String notasCata;
    private String origen;
    private double altura;
    private String nombre;
    private double cantidad;
    
    public Lote(String varietal, String notasCata, String origen, double altura, String nombre, double cantidad){
    this.varietal = varietal;
    this.notasCata = notasCata;
    this.origen = origen;
    this.altura = altura;
    this.nombre = nombre;
    this.cantidad = cantidad;
    }
    
    public String toString(){
        return "Lote {"+
                "Varietal='"+varietal+'\''+
                "Notas='"+notasCata+'\''+
                "Origen='"+origen+'\''+
                "Altura='"+altura+'\''+
                "Nombre='"+nombre+'\''+
                "Cantidad='"+cantidad+'}';
    }
}
