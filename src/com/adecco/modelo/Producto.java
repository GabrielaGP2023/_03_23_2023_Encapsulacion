package com.adecco.modelo;

public class Producto {
    //1. Atributos
    private int numProducto;
    private String nombreProducto;
    private double precio;

    private int cantidadExistencia;
    //2. Metodos
    //3. Construcotres
    //4. Setters y Getters
    //Asignar valor al atributo
    public void setNumProducto(int numProducto){
        this.numProducto = numProducto;
    }

    public int getNumProducto(){
        return numProducto;
    }

    public void setNombreProducto(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }

    public String getNombreProducto(){
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(int cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }
}
