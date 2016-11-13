package hotel_canino;

import java.io.*;

public class Hotel_Canino {

    public static void main(String[] args) throws IOException {
    
        String continuar = "s";
        String lista[];             //Se crea el arreglo
        lista = new String[5];

        String opcion;      //variable de opciones
        
        int i = 0, j;           //variables de contadores
        String ver;

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        //for (int l=0 ; l<=4;l++){
         //   lista[l]="vacio";
        //}

        while ("s".equals(continuar)){
            
            try{
            System.out.println("Que operacion desea realizar:\nA.- Agregar.\nB.- Modificar.\nC.- Eliminar.\nD.- Ninguna.");
            opcion = br.readLine();

            if (opcion.equals("a")){
               perro agregar = new perro();
               agregar.agregar();
               lista[i]= agregar.datos;
               i++;
            }
            else{
                if ("b".equals(opcion)){
                    System.out.print("Ingrese el numero que desea modificar(0-4):");
                    j = Integer.parseInt(br.readLine());
                    perro modificar = new perro();
                    modificar.agregar();
                    lista[j]=modificar.datos;
                }
                else{
                    if (opcion.equals("c")){
                    System.out.print("Ingrese el numero que desea eliminar(0-4):");
                    j = Integer.parseInt(br.readLine());
                    lista[j]=null;
                    }
                    else{
                            continuar = "n";
                        }
                }
            }
            System.out.print("Desea continuar(s/n):");
            continuar = br.readLine();
            }
            catch(IOException | NumberFormatException e){
                System.err.println("Se produjo un Error: " + e.getMessage() + ".Por favor vuelva a ingresar los datos");
            }
        }        
        System.out.print("Ver la lista(s/n):");
        ver = br.readLine();
        
        if ("s".equals(ver)){
                for (int z = 0;z <= 4;z++){
                    System.out.println(lista[z]);
                }
            }
    }
}