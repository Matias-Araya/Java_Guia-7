/*
Ctrl + S: Guarda los cambios de la clase en la que estoy posicionado
Ctrl + Shift + S: Guarda los cambios de todas las clases abiertas
Alt + Shift + F: Arregla las lineas de codigo mal identadas
Ctrl + Shift + C: Convierte en comentario las lineas de codigo pintadas
 */
package guia_7_poo_1; //TAMBIEN SE PUEDE IMPORTAR APRETANDO ALT + ENTER PINTANDO LA LINEA DE CODIGO EN LA QUE SE INSTANCIA EL OBJETO
import Libro.Libro;
import Servicio.ClaseServicio;

/**
 *
 * @author CTI6345
 */
public class Guia_7_POO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ClaseServicio cm = new ClaseServicio();
     Libro libro1 = cm.CargarLibro();
     cm.MostrarLibro(libro1);
    }
    
}
