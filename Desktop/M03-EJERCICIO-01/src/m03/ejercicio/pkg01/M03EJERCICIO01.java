/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.ejercicio.pkg01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Marta González Bellver
 */
public class M03EJERCICIO01 {

    private static BufferedReader pantalla = new BufferedReader(new InputStreamReader(System.in));
    //declaraciones de array
    static int[] array;
    static String input, input2;
    static int narray, i, posicio, valor;

//Calculos de valores dentro de una array sin prueba de errores aun
    public static void calculosdevalores() throws IOException {

        System.out.println(" dime el numero de elementos de la array ");
        input = pantalla.readLine();
        narray = Integer.parseInt(input);//damos la longitud de la array
        array = new int[narray];
        int max = array[0]; //defineixo variables de maxim
        int min = array[0]; //defineixo variables de minim
        float media = 0.f;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 0);

            //BUSCAMOS EL NUMERO MAYOR Y MENOR DE LA ARRAY Y LA MUESTRO POR PANTALLA
            if (array[i] > max) {  //calculo el numero mas grande de la array
                max = array[i];
            }
            if (array[i] < min) {  //calculo el numero mas pequeño de la array
                min = array[i];
            }

            media = media + array[i];
            //BUSCA VALORES MAYORES A LA MEDIA DE LA ARRAY Y MUESTRA
            if (array[i] > media) {
                System.out.println("x[" + i + "]=" + array[i]);
            }
        }
        
        System.out.println(" dime una posición del array ");
        input = pantalla.readLine();
        posicio = Integer.parseInt(input);
        System.out.println(" dime un valor del array ");
        input2 = pantalla.readLine();
        valor = Integer.parseInt(input2);

        //AÑADIMOS EN LA POSICION DONDE DIGA EL USUARIO EL VALOR Y MUESTRA POR PANTALLA
        if (i >= 0 && i < array.length) {
            array[posicio] = valor;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("el valor más alto = " + max);
        System.out.println("el valor más bajo = " + min);

        //CALCULA LA MEDIA DE TODOS LOS VALORES
        media = media / array.length;
        System.out.println("la media de la array es = " + media);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > media) {
                System.out.println("Posicion[" + i + "]=" + array[i]); //muestra els valors que hay en la array mayores de la media   
            }
        }

    }

    public static void main(String[] args) throws IOException {

        calculosdevalores();

    }

}
