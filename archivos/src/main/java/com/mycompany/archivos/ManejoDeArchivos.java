/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.archivos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ManejoDeArchivos {
   public static void crearArchivo(String nombreArchivo){
       File archivo = new File(nombreArchivo);
       try {
           PrintWriter salida = new PrintWriter(archivo);
           salida.close();
           System.out.println("El archivo se creo de manera correcta");
       } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
       }
   }
   
   public static void escribirArchivo(String nombreArchivo, String contenido){
       File archivo = new File(nombreArchivo);
       try {
           PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
           salida.println(contenido);
           salida.close();
           System.out.println("se escribio en el archivo");
       } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
       } catch (IOException ex) {
            ex.printStackTrace(System.out);
       }
   }
   
   public static void leerArchivo(String nombreArchivo){
       File archivo = new File(nombreArchivo);
       try {
           BufferedReader entrada = new BufferedReader(new FileReader(archivo));
           String lectura = entrada.readLine();
           while(lectura!= null){
               System.out.println(lectura);
               lectura = entrada.readLine();
           }
           entrada.close();
           
       } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
       } catch (IOException ex) {
            ex.printStackTrace(System.out);
       }
   }
   
   public static void eliminarArchivo(String nombreArchivo){
       File archivo = new File(nombreArchivo);
       archivo.delete();
       System.out.println("se elimino el archivo");
       
   }
}
