package imc;

public class Imc {

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso <= 0) return;
        this.peso = peso;
    }

    private double peso;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double altura;

    public double getImc() {
        return imc;
    }

    private double imc;

    public Imc (double peso, double altura){
        //metodo com o mesmo nome da classe é contructor e nao tem retorno
        this.peso = peso;
        //peso da classe Imc recebe do parametro
        this.altura = altura;
        //altura da classe Imc recebe do parametro
    }


    public void calculaImc(){
        //funcao que faz o calculo do imc
        this.imc = ((this.peso) / (this.altura * this.altura));

    }

    public String classificacao(){
        //retorna classificacao d acordo como calculo acima
        this.calculaImc();
        if(this.peso < 18.5) return  "magreza";
        if(this.peso < 24.9) return  "normal";
        if(this.peso < 29.9) return  "sobrepeso";
        if(this.peso < 39.9) return  "obesidade grave";
        return "obesidade grave";

    }


}
