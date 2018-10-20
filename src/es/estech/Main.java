package es.estech;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayDeclarado; // declaración de un array

        int[] arrayVacio = new int[3]; // inicialización de un array vacío, hay que indicar su tamaño
        arrayVacio[0] = 3; // agregamos un valor al a posición 1
        arrayVacio[1] = 2; // agregamos un valor al a posición 2
        arrayVacio[2] = 5; // agregamos un valor al a posición 3
        System.out.println(arrayVacio); // si imprimimos el arrayVacio, nos da la dirección de memoria
        System.out.println(Arrays.toString(arrayVacio)); // hay que pasarlo a String

        arrayVacio[1] = 0; // si sobrescribimos una posición, sustituimos el valor que tuviera
        System.out.println(Arrays.toString(arrayVacio));

        int[] numerosArrayInt = {1,2,3,4,5,6,7,8,9,0}; // inicialización de un array con datos
        System.out.println(numerosArrayInt.length); // el tamaño lo infiere de los datos introducidos

        /*
        podemos recorrer un array con cualquier tipo de bucle
        por ejemplo un bucle for
         */
        for (int i = 0; i <= numerosArrayInt.length-1; i++){
            System.out.print(i + " ");
        }


        /*
        bucle for in (también llamado foreach o bucle for "mejorado"
         */
        for (int n: numerosArrayInt) {
            System.out.print(n + " ");
        }


    }
}
