package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        int numero = 10;
        double doble = 10.56;
        String cadena = "Hola Mundo";
        char caracter= 'a';
        float flotante= (float)10.56;
        String[] nombres= new String[]{"Jhon", "Diana", "Carolina"};
        List<String> equipos= new ArrayList<>();
        equipos.add("Atletico Nacional");
        equipos.add("Juventus FC");
        equipos.add("River Plate");
        Map<String,String> personas= new HashMap<>();
        personas.put("45655","jhon");
        personas.put("45645","Diana");
        personas.put("84652","Carolina");

        System.out.println("Iniciamos mostrando el tipo de dato entero (int) "+numero);
        System.out.println("----------------------------------------------------------");
        System.out.println("mostramos el tipo de dato doble (double) "+doble);
        System.out.println("----------------------------------------------------------");
        System.out.println("mostramos el tipo de dato String o cadena de texto (String) "+cadena);
        System.out.println("----------------------------------------------------------");
        System.out.println("mostramos el tipo de dato char o caracter (char) "+caracter);
        System.out.println("----------------------------------------------------------");
        System.out.println("mostramos el tipo de dato flotante (float) "+flotante);
        System.out.println("----------------------------------------------------------");
        System.out.println("mostramos varios datos en un arreglo (Array) ");
        for (int i=0;i<nombres.length;i++)
        {
            System.out.println(nombres[i]);
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("mostramos varios datos en una lista (List) ");

        for(String equipo: equipos)
        {
            System.out.println(equipo);
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("mostramos varios datos con su clave en un map (Map) ");

        for (Map.Entry<String, String> pair: personas.entrySet())
        {

            System.out.println(pair.getKey()+"/"+pair.getValue());
        }

    }
}