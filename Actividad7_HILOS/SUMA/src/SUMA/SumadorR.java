/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SUMA;

public class SumadorR implements Runnable {

    @Override
    public void run() {
        int suma = 0;
        try {
            for (int i = 1; i <= 10; i++) {
                suma += i;
                System.out.println("Sumando: " + i);
                Thread.sleep(500); // Espera 0.5 segundos
            }
            System.out.println("Total: " + suma);
        } catch (InterruptedException e) {
            System.out.println("El hilo fue interrumpido: " + e.getMessage());
        }
    }
}