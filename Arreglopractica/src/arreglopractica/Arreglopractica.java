/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglopractica;

/**
 *
 * @author Javier de Jesus
 */
public class Arreglopractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Prueba1-Desordenado
        System.out.println("Prueba 1");
        int[] numeros1 = {5, 3, 8, 1, 2};
        int[] numeros2 = {5, 3, 8, 1, 2};
        //estado inicial
        System.out.println(java.util.Arrays.toString(numeros1));

        ordenamientoBurbuja(numeros1);
        ordenamientoBurbujaMejorado(numeros2);

        System.out.println("Burbuja normal: "+ java.util.Arrays.toString(numeros1));
        System.out.println("Burbuja mejorado: "+ java.util.Arrays.toString(numeros2));
        System.out.println();

        //Prueba2-Ya ordenado
        System.out.println("Prueba 2");
        numeros1 = new int[]{1, 2, 3, 4, 5};
        numeros2 = new int[]{1, 2, 3, 4, 5};
        //estado inicial
        System.out.println(java.util.Arrays.toString(numeros1));

        ordenamientoBurbuja(numeros1);
        ordenamientoBurbujaMejorado(numeros2);

        System.out.println("Burbuja normal: "+ java.util.Arrays.toString(numeros1));
        System.out.println("Burbuja mejorado: "+ java.util.Arrays.toString(numeros2));
        System.out.println();
        //Prueba3-Orden inverso
        System.out.println("Prueba 3");
        numeros1 = new int[]{5, 4, 3, 2, 1};
        numeros2 = new int[]{5, 4, 3, 2, 1};
        //estado inicial
        System.out.println(java.util.Arrays.toString(numeros1));

        ordenamientoBurbuja(numeros1);
        ordenamientoBurbujaMejorado(numeros2);

        System.out.println("Burbuja normal: "+ java.util.Arrays.toString(numeros1));
        System.out.println("Burbuja mejorado: "+ java.util.Arrays.toString(numeros2));
        System.out.println();
        //Prueba4-Elementos repetidos
        System.out.println("Prueba 4");
        numeros1 = new int[]{4, 2, 4, 1, 2};
        numeros2 = new int[]{4, 2, 4, 1, 2};
        //esatdo inicial
        System.out.println(java.util.Arrays.toString(numeros1));

        ordenamientoBurbuja(numeros1);
        ordenamientoBurbujaMejorado(numeros2);

        System.out.println("Burbuja normal: " + java.util.Arrays.toString(numeros1));
        System.out.println("Burbuja mejorado: "+ java.util.Arrays.toString(numeros2));
    }
    //burbuja tradicional
    public static void ordenamientoBurbuja(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                //comparacion y tmb intercambio
                if (arreglo[j] > arreglo[j + 1]) {
                    int auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
        }
    }
    //burbuja mejorado
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        boolean bandera = true;
        while (bandera) {
            bandera = false;
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                    bandera = true;
                }
            }
        }
    }
}
