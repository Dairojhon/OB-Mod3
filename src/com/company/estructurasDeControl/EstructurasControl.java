package com.company.estructurasDeControl;

public class EstructurasControl {

    public static void main(String[] args) {

        String[] semana= {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        String cadena = "los dias de la semana son: ";

        for (int i=0;i< semana.length;i++)
        {
            cadena= cadena+semana[i]+" ";
        }
        System.out.println(cadena);
    }

}
