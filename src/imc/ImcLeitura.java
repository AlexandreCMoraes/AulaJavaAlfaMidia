package imc;

import java.util.Scanner;

public class ImcLeitura extends Imc{
    Scanner entrada;
    //preparar para pegar dados

    public ImcLeitura(double peso, double altura) {
        super(peso, altura);
        entrada = new Scanner(System.in);
    }
    public ImcLeitura(){
        super (88,1.8);
        entrada = new Scanner(System.in);
    }

    public void LerPeso() {
        //vai pegar o dado de peso
        System.out.println("Entre com seu peso: ");
        this.setPeso(entrada.nextDouble());
    }

    public void lerAltura() {
        System.out.println("Entre com sua altura: ");
        this.setAltura(entrada.nextDouble());
    }
}
