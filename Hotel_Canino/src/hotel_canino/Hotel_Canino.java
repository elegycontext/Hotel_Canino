package hotel_canino;

import java.io.*;

public class Hotel_Canino {

    public static void main(String[] args) throws IOException {
    
        String continuar = "s";
        String lista[][];             //Se crea el arreglo
        lista = new String[5][4];

        String opcion;      //variable de opciones
        
        int i, j, m, k, contador;           //variables de contadores
        String ver, termino;

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); //Leer por teclado
        
        for(i=0;i<5;i++){
            for(j=0;j<4;j++){
                lista[i][j]="Vacio";
            }
        }
        
        i = 0;
        while ("s".equals(continuar)){   //Bucle
            
            try{                           //Trata de leer por teclado
            System.out.println("Que operacion desea realizar:\nA.- Agregar.\nB.- Modificar.\nC.- Eliminar.\nD.- Buscar.\nE.- Ninguna.");
            opcion = br.readLine();
            /*
            Menu de opciones a realizar
            a
            b
            c
            cualquier otro caracter dara la opcion de salir
            */
            if (opcion.equals("a")){
               perro agregar = new perro();
               agregar.agregar();
               lista[i][0]= agregar.datos;
               lista[i][1]= agregar.dueño;
               lista[i][2]= agregar.raza;
               lista[i][3]= agregar.color;
               i++;
            }
            else{
                if ("b".equals(opcion)){
                    System.out.print("Ingrese el numero que desea modificar(0-4):");
                    m = Integer.parseInt(br.readLine());
                    perro modificar = new perro();
                    modificar.agregar();
                    lista[m][0]= modificar.datos;
                    lista[m][1]= modificar.dueño;
                    lista[m][2]= modificar.raza;
                    lista[m][3]= modificar.color;
                    
                }
                else{
                    if (opcion.equals("c")){
                    System.out.print("Ingrese el numero que desea eliminar(0-4):");
                    k = Integer.parseInt(br.readLine());
                    lista[k][0]="Vacio";
                    lista[k][1]="Vacio";
                    lista[k][2]="Vacio";
                    lista[k][3]="Vacio";
                    }
                    else{
                        if("d".equals(opcion)){
                            contador = 0;
                            System.out.println("Ingrese sobre que desea hacer la consulta:\n1.- Dueño.\n2.- Razar.\n3.- Color.");
                            j=Integer.parseInt(br.readLine());
                            System.out.print("Ingrese el termino que desea buscar: ");
                            termino=br.readLine();
                            
                            for (k=0;k<5;k++){
                                //System.out.println(i);
                                //System.out.println(j);
                                System.out.println(lista[k][j]);
                                if (termino.equals(lista[k][j])){
                                    contador++;    
                                }
                            }

                            System.out.println("Se encontraron: " + contador + " coincidencias");
                        }
                        else{
                            continuar = "n";
                        }
                        }
                }
            }
            System.out.print("Desea continuar(s/n):");
            continuar = br.readLine();
            }
            catch(IOException | NumberFormatException e){       //En caso te toparse con algun error al tomar los datos nos pedira ingresarlos otra vez
                System.err.println("Se produjo un Error: " + e.getMessage() + ".Por favor vuelva a ingresar los datos");
            }
        }        
        System.out.print("Ver la lista(s/n):");             //Sentencias para ver el arreglo
        ver = br.readLine();
        
        if ("s".equals(ver)){
                for (i = 0;i <= 4;i++){
                    System.out.println(lista[i][0]);
                }
            }
    }
}