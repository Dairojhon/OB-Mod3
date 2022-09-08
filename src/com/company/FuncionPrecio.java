package com.company;

public class FuncionPrecio {

    public static void main(String[] args)
    {
        double iva= 0.16;
        double precio= 50.99;
        System.out.println("el precio con iva incluido es "+ getPrecioIva(precio,iva));

    }
    static double getIva(double costo,double iva)
    {
        return costo*iva;
    }

    static double getPrecioIva(double costo, double iva)
    {
        return costo+getIva(costo,iva);
    }
}
