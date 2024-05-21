
package com.mycompany.mavenproject2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Reflactor {

    public static void main(String[] args) {
        try {
            File archivo=new File("archivo.txt");
            FileWriter escritor=new FileWriter(archivo);
            escritor.write("hola aceu");
            escritor.close();
            FileReader lector =new FileReader(archivo);
            BufferedReader lectorr=new BufferedReader(lector);
            String linea=lectorr.readLine();
            lectorr.close();
            System.out.println("el archivo dice; "+ linea);
            System.out.println("quieres editar el archivo?");
            Scanner scanner=new Scanner(System.in);
            String input=scanner.nextLine();
            if(input.equalsIgnoreCase("si")){
                System.out.println("ingrese su edicion");
                   String edit=scanner.nextLine();
                   FileWriter editado=new FileWriter(archivo);
                   editado.write(edit);
                   editado.close();
            FileReader lector2 =new FileReader(archivo);
            BufferedReader lectoor=new BufferedReader(lector2);
            String linea2=lectoor.readLine();
                System.out.println("su archivo editado es :"+ linea2);
            }
            
        } catch (IOException e) {
            System.out.println("no se pudo crear el archivo");
        }
        }
    
}
