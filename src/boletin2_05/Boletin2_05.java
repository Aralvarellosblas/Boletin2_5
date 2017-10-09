package boletin2_05;

import java.util.Scanner;

public class Boletin2_05 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        float metros, millasM, km;
        System.out.println("Introduce el numero de Millas náuticas");
        millasM= teclado.nextFloat();
        metros= millasM *1852;
        km= metros/1000;    //Modificado para dar el valor en KM
        System.out.println(millasM+" millas marinas son "+metros+"m y "+km+" kilometros");
    }
    
}
