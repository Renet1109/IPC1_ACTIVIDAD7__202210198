
package Serialización;
import java.io.*;
import java.util.ArrayList;

public class serializacion {
    public static void main(String[] args) {
        // Crear lista de libros
        ArrayList<Libros> listaLibros = new ArrayList<>();
        listaLibros.add(new Libros("Cien Años de Soledad", "Gabriel García Márquez", 1967));
        listaLibros.add(new Libros("Don Quijote de la Mancha", "Miguel de Cervantes", 1605));
        listaLibros.add(new Libros("El Principito", "Antoine de Saint-Exupéry", 1943));

        // Serializar la lista
        try (FileOutputStream archivo = new FileOutputStream("libros.ser");
             ObjectOutputStream salida = new ObjectOutputStream(archivo)) {

            salida.writeObject(listaLibros);
            System.out.println("Lista de libros serializada correctamente en 'libros.ser'.");

        } catch (IOException e) {
            System.out.println("Error al serializar: " + e.getMessage());
        }

        // Deserializar la lista
        try (FileInputStream archivoD = new FileInputStream("libros.ser");
             ObjectInputStream entrada = new ObjectInputStream(archivoD)) {

            ArrayList<Libros> librosDeserializados = (ArrayList<Libros>) entrada.readObject();
            System.out.println("\nLibros deserializados:");

            for (Libros libro : librosDeserializados) {
                System.out.println(libro);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar: " + e.getMessage());
        }
    }
}
