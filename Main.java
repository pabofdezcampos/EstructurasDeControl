package com.company;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Main {

    public static void Ejercicio1(){
        //Ejercicio 1 (Mostrar número del 1-10)

        //Con bucle for
        for (int i = 1; i <= 10; i++){
            System.out.print(i +  " ");
        }

        System.out.println();

        //Con bucle while
        int contador = 1;
        while (contador <= 10){
            System.out.print(contador + " ");
            contador ++;
        }

        System.out.println();

        //Con bucle do while
        int j = 1;
        do{
            System.out.print(j);
            j++;
        } while (j <= 10);
    }

    public static void Ejercicio2(){
        //Ejercicio 2 (Muestre en consola la siguiente serie: 20 25 30 35 . . . 70 75 80)

        //Con el bucle for
        for (int i = 20; i <= 80; i+=5){
            System.out.print(i);
        }

        System.out.println();

        //Con el bucle while
        int contador = 20;
        while (contador <= 80){
            System.out.print(contador + " ");
            contador += 5;
        }

        System.out.println();

        //Con el bucle do while
        int j = 20;
        do{
            System.out.print(j + " ");
            j += 5;
        } while (j <= 80);
    }

    public static void Ejercicio3(){
        //Ejercicio 3 (Muestre en consola la siguiente serie: 100 98 96 94 . . . 56 54 52 50)

        //Con el bucle for
        for (int i = 100; i >= 50; i -= 2){
            System.out.print(i + " ");
        }

        System.out.println();

        //Con el bucle while
        int contador = 100;
        while (contador >= 50){
            System.out.print(contador + " ");
            contador -= 2;
        }

        System.out.println();

        //Con el bucle do while
        int j = 100;
        do{
            System.out.print(j + " ");
            j -= 2;
        } while (j >= 50);
    }

    public static void main(String[] args) {

        /*
           En el main llamo a las funciones que tienen el nombre del ejercicio
           que estoy resolviendo, para ejecutar el ejercicio llame a la función
           en el main y comente (para que así no se ejecuten el resto de funciones) */

        //Ejercicio1();
        //Ejercicio2();
        //Ejercicio3();

        //Ejercicio 4
        System.out.println("Introduce el número para calcular la suma desde el nº 1 hasta N");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        Operaciones.Ejercicio4(numero);

        //Ejercicio 5
        System.out.println("Introduce el número para calcular la suma de cuadrados hasta N");
        Scanner entrada = new Scanner(System.in);
        int number = entrada.nextInt();
        Operaciones.Ejercicio5(number);

        //Ejercicio 6
        System.out.println("Introduce el número que limitará la secuencia de suma");
        Scanner f = new Scanner(System.in);
        int num = f.nextInt();
        Operaciones.Ejercicio6(num);
    }
}
