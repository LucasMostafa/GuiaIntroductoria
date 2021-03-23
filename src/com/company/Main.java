package com.company;

public class Main {

    public static void main(String[] args) {
        //Ejercicio 1
        int N= 10;
        double A= 20;
        char C = 'Z';

        System.out.println("Variable N (Int): " + N);
        System.out.println("Variable A (Double):" + A);
        System.out.println("Variable C (Char): " + C);

        System.out.println("\nSuma de la variable N y A: " + suma(A, N));

        System.out.println("\nDiferencia  de la variable N y A: " + resta(A, N));

        int ascii= 'Z';

        System.out.println("\nValor numerico del caracter 'Z': " + ascii);

        //Ejercicio 2
        /*int X= 10;
        int Y= 20;

        double N= 15.5;
        double M= 25.5;

        System.out.println("Multiplicacion de las variables X y N: "+ multiplicacion(X, N));*/
    }

    //Ejercicio 1
    public static double suma(double number, int number2){
        return  number + number2;
    }

    public static double resta(double number, int number2){
        return  number - number2;
    }

    //Ejercicio 2
    public static double multiplicacion(int number, double number2){
        return number * number2;
    }
}

