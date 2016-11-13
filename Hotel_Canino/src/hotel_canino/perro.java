/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_canino;

import java.io.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class perro {
      static String  raza, color, nombre, edad, dueño, ci; //todo es estatico para que no se borre al final del metodo//
      static String datos, datos2;
      static int year, month, day;
    
   static void agregar() throws IOException{
        /*
            Dentro del bloque del try se solicitan todos los datos, en caso de 
            en caso de que se genere algun error lo muestra y sale.
        */
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    try{
    Date date = new Date();
    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    year = localDate.getYear();
    month = localDate.getMonthValue();
    day = localDate.getDayOfMonth();
    
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
    datos = "Fecha de ingreso: " + day +"/" + month + "/"+ year+ 
            "\n" + "Raza: " + raza + "\n" + "Color: " + color + 
            "\n" + "Nombre: " + nombre + "\n" + "Edad: " + 
            edad + "\n" + "Dueño: " + dueño + "\n" + "Cedula: " + ci;
    }
    
    void modificar (String menu) throws IOException{
        datos2 = datos; // para que datos2 comience con la misma informacion que se ingreso en el comienzo//
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        try {
            switch (menu.toLowerCase()){  //dependiendo de la opcion deseada, se realiza el cambio//
            case "raza":
                System.out.print("Ingrese la nueva raza: ");
                raza = br.readLine();
                break;
            case "color":
                System.out.print("Ingrese el nuevo color: ");
                color = br.readLine();
                break;
            case "nombre":
                System.out.print("ingrese el nuevo nombre: ");
                nombre = br.readLine();
                break;
            case "edad":
                System.out.print("ingrese la nueva edad: ");
                edad = br.readLine();
                break;
            case "dueño":
                System.out.print("ingrese su nuevo dueño: ");
                dueño = br.readLine();
                break;
            case "cedula":
                System.out.print("ingrese la nueva cedula: ");
                ci = br.readLine();
                break;
            default:
                System.out.print("Esta opcion no es valida: ");
            }
        }
        catch(Exception e){
        System.err.println("Se produjo un Error: " + e.getMessage());
        }
        
        datos2 = "Fecha de ingreso: " + day +"/" + month + "/"+ year+ 
            "\n" + "Raza: " + raza + "\n" + "Color: " + color + 
            "\n" + "Nombre: " + nombre + "\n" + "Edad: " + 
            edad + "\n" + "Dueño: " + dueño + "\n" + "Cedula: " + ci; 
            // ahora tiene la informacion ingresada mas la modificada//
    }
}
