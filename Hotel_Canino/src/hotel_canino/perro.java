/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_canino;

import java.io.*;

public class perro {
        String fecha, raza, color, nombre, edad, dueño, ci, datos;
    
    void agregar() throws IOException{
        /*
            Dentro del bloque del try se solicitan todos los datos, en caso de 
            en caso de que se genere algun error lo muestra y sale.
        */
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    try{
    System.out.print("Ingrese fecha:");
    fecha = br.readLine();
    
    System.out.print("Ingrese raza:");
    raza = br.readLine();
    
    System.out.print("Ingrese el color:");
    color = br.readLine();
    
    System.out.print("Ingrese el nombre:");
    nombre = br.readLine();
    
    System.out.print("Ingrese la edad:");
    edad = br.readLine();
    
    System.out.print("Ingrese el dueño:");
    dueño = br.readLine();
    
    System.out.print("Ingrese la cedula de identidad:");
    ci = br.readLine();
    }
    catch(Exception e){
        System.err.println("Se produjo un Error: " + e.getMessage());
    }
    
    /*
        La variable datos guarda todos los datos tanto del perro como de su dueño
    */
    datos = "Fecha de ingreso: " + fecha + "\n" + "Raza: " + raza + "\n" + 
            "Color: " + color + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + 
            edad + "\n" + "Dueño: " + dueño + "\n" + "Cedula: " + ci;
    }
}
