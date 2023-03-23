package com.adecco.presentacion;

import com.adecco.modelo.Producto;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto();

        p1.setNumProducto(1);
        System.out.println("IdProducto -> " +p1.getNumProducto());
        p1.setNombreProducto("Ratón inalambrico");
        System.out.println("Nombre producto -> "+ p1.getNombreProducto());
        p1.setPrecio(15);
        System.out.println("Precio -> " + p1.getPrecio());

        p1.setCantidadExistencia(100);
        System.out.println("Cantidad en existencia ->"+ p1.getCantidadExistencia());



    }
}