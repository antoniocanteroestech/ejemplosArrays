package es.estech;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
            ARRAYS UNIDIMENSIONALES
         */
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
        for (int i = 0; i < numerosArrayInt.length; i++){
            System.out.print(numerosArrayInt[i] + " ");
        }
        System.out.println();

        /*
        bucle for in (también llamado foreach o bucle for "mejorado"
         */
        for (int n: numerosArrayInt) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println();

        /*
            ARRAYS BIDIMENSIONALES
         */
        int [][] arrayBidimensional = new int [3][3];
        arrayBidimensional [0][0] = 1;
        arrayBidimensional [0][1] = 2;
        arrayBidimensional [0][2] = 3;
        arrayBidimensional [1][0] = 4;
        arrayBidimensional [1][1] = 5;
        arrayBidimensional [1][2] = 6;
        arrayBidimensional [2][0] = 7;
        arrayBidimensional [2][1] = 8;
        arrayBidimensional [2][2] = 9;

        System.out.println(Arrays.toString(arrayBidimensional)); //aquí no nos vale este método
        System.out.println();

        /*
        para imprimir un array bidimensional (o matriz), necesitamos dos estructuras for anidadas
         */
        for (int i=0; i < arrayBidimensional.length; i++) { //recorremos las filas
            System.out.print("|");                          // por el comienzo de cada fila le ponemos un decorador
            for (int j=0; j < arrayBidimensional[i].length; j++) { // por cada fila recorremos su array
                System.out.print (arrayBidimensional[i][j]);
                if (j!=arrayBidimensional[i].length-1) System.out.print("\t"); // tabula si no ha llegado al último elemento
            }
            System.out.println("|");                    // al final de cada fila le ponemos un decorador
        }

//
    }
}
