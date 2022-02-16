package com.company;

import imc.Imc;
import imc.ImcLeitura;
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
        //TODO precisa veriricar pois esta dando obesidade grave com qualquer numero
        ImcNovo imc2 = new ImcNovo(80,2.10);
        System.out.println("O classificação é: " + imc2.classificacao());
        //TODO precisa veriricar pois esta dando obesidade grave com qualquer numero
        //feito para ler dados
        ImcLeitura imc3 = new ImcLeitura();
        //chama o constructor da classe
        //chama os metodos feitos pq aqui acontece no console
        imc3.LerPeso();
        imc3.lerAltura();
        System.out.println("O classificação é: " + imc3.classificacao());
        //TODO precisa veriricar pois esta dando obesidade grave com qualquer numero
    }
}
