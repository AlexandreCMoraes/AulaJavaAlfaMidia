package com.company;

import imc.Imc;
import imc.ImcNovo;

public class Main {

    public static void main(String[] args) {

//	double peso = 80;
//    double altura = 1.80;//
//    double imc = (peso / altura*altura);
//        System.out.println("O imc é " + imc);

        Imc imc1 = new Imc(5,1.10);
//        imc1.calculaImc();
        //tirado o de cima, pois sera mostrado a classificação abaixo
        imc1.setPeso(90);
        System.out.println("O classificação é: " + imc1.classificacao());
        ImcNovo imc2 = new ImcNovo(80,2.10);
        System.out.println("O classificação é: " + imc2.classificacao());
    }
}
