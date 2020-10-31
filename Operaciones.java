package com.company;

public class Operaciones {

    //Ejercicio 4 (Operación Suma)
    public static int Ejercicio4(int N) {
        //Ejercicio 4 (Devuelva la suma de los números enteros del 1 a N)
        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += i;
        }
        System.out.println("La suma de la secuencia de números es igual a " + suma);

        if (N <= 1) {
            System.out.println("Debe introducir un número mayor que 1");
        }
        return suma;
    }

    //Ejercicio 5 (Devuelva la suma de los cuadrados de los N primeros números naturales. El método debe devolver un int)
    public static int Ejercicio5(int N){
        int suma = 0;
        for (int i = 0; i <= N; i++){
            i *= i;
            suma += i;
        }
        System.out.println("La suma de los cuadrados de los primeros " + N + " números" + "es igual a " + suma);

        if (N <= 1){
            System.out.println("Debes introducir un número mayor que 1");
        }
        return suma;
    }

    public static void Ejercicio6(int N){
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 1; i <= N; i++){
            if(i % 2 == 0){
                sumaPares += i;
            } else {
                sumaImpares += i;
            }
        }
        System.out.println("La suma de los números pares es igual " + sumaPares);
        System.out.println("La suma de los números impares es igual " +  sumaImpares);
    }
}
