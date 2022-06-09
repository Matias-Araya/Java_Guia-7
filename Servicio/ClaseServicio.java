/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Libro.Libro;
import java.util.Scanner;

/**
 *
 * @author CTI6345
 */
public class ClaseServicio {
    public Libro CargarLibro(){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de ISBN");
        int ISBN = leer.nextInt();
        System.out.println("Ingrese el título del libro");
        String titulo = leer.next();
        System.out.println("Ingrese el autor");
        String autor = leer.next();
        System.out.println("Ingrese la cantidad de páginas");
        int paginas = leer.nextInt();
        
        return new Libro(ISBN, titulo, autor, paginas);
    }
    
    public void MostrarLibro(Libro libro1) {
        System.out.println("==");
        System.out.println("Datos del libro ingresado:");
        System.out.println("ISBN: "+libro1.ISBN);
        System.out.println("Título: "+libro1.titulo);
        System.out.println("Autor: "+libro1.autor);
        System.out.println("Cantidad de paginas: "+libro1.paginas);
    }
}
