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

    public double LerDouble(String texto){
        boolean continuarLeitura = true;
        //feito ate dar um double valido
        double valor = 0;
        while(continuarLeitura){
            System.out.println(texto);
            try {
                valor = Double.parseDouble(entrada.nextLine());
                //le a entrada (usuario) e atribui/converte o double(digitado) no valor
                continuarLeitura = false;
            }
            catch (NumberFormatException e){
                System.out.println("Entrada com valor inválido. Digite apenas números");
            }
        }
        return valor;
    }

    public void LerPeso() {
        //vai pegar o dado de peso
        //System.out.println("Entre com seu peso: ");
        //this.setPeso(entrada.nextDouble());
        //feito abaixo com tratamento de erro
        this.setPeso(this.LerDouble("Entre com seu peso: "));
    }

    public void lerAltura() {
        //vai pegar o dado da altura
        //System.out.println("Entre com sua altura: ");
        //this.setAltura(entrada.nextDouble());
        //feito abaixo com tratamento de erro
        this.setAltura(this.LerDouble("Entre com sua altura em centímetros"));
    }
}
