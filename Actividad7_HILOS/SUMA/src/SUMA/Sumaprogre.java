/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SUMA;

public class Sumaprogre {
    public static void main(String[] args) {
        System.out.println("Iniciando el hilo con Runnable...\n");

        // Crear el Runnable
        SumadorR tarea = new SumadorR();

        // Pasar el Runnable a un objeto Thread
        Thread hilo = new Thread(tarea);

        // Iniciar el hilo
        hilo.start();

        System.out.println("El hilo de suma se ha iniciado correctamente.");
    }
}