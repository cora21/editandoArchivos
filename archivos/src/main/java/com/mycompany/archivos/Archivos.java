package com.mycompany.archivos;


public class Archivos {

    public static void main(String[] args) {
        // con esta se crea el archivo en el proyecto
        //ManejoDeArchivos.crearArchivo("Hola.txt");
        
        //con estas rutas yo defino donde se va a guardar el archivo
        //ManejoDeArchivos.crearArchivo("archivo\\Hola.txt");
        
        //como podemos ver definimos la ruta donde va aparecer el archivo
        //ManejoDeArchivos.crearArchivo("C:\\JavaPractice");
        
        // con este metodo podemos escribir en el archivo de texto
        ManejoDeArchivos.escribirArchivo("archivo\\\\Hola.txt", "Hola mundo desde java");
        //ManejoDeArchivos.escribirArchivo("archivo\\\\Hola.txt", "Hola mundo desde java segunda linea");
        
        
        //de esta manera leemos cada una de las lineas que se encuentran en el archivo
        //ManejoDeArchivos.leerArchivo("archivo\\\\Hola.txt");
        
        
        //con este metodo se eliminan los archivos
        //ManejoDeArchivos.eliminarArchivo("archivo\\\\Hola.txt");
        
        
        
    }
}
