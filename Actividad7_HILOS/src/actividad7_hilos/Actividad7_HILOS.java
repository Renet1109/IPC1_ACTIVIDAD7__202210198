/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad7_hilos;

/**
 *
 * @author willi
 */
public class Actividad7_HILOS {
    public static void main(String[] args) {
        System.out.println("Iniciando el hilo...\n");

        // Crear e iniciar el hilo
        mensaje hilo = new mensaje();
        hilo.start(); // Llama internamente al método run()

        System.out.println("El hilo se ha iniciado correctamente.");
    }
}
