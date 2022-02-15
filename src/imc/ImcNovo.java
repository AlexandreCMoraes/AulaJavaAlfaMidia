package imc;

public class ImcNovo extends Imc{
    //chama o metodo imc ja feito pq nao tem aqui e nao foi feito

    public ImcNovo(double peso, double altura){
        super(peso, altura);
        //chama p constructor de imc = public Imc (double peso, double altura){...

    }

    @Override
    //sobrescreve o metodo anterior da classe IMC se houver mudanças ou nao.
    public String classificacao() {
        this.calculaImc();
        if(this.getImc() < 16) return  "magreza grave";
        if(this.getImc() < 17) return  "magreza moderada";
        if(this.getImc() < 18.5) return  "magreza leve";
        if(this.getImc() < 25) return  "saudavel";
        if(this.getImc() < 30) return  "sobrepeso";
        if(this.getImc() < 35) return  "obesidade grau 1";
        if(this.getImc() < 40) return  "obesidade grau 2";
        return "obesidade grau 3";
    }

    //    public String classificacao(){
//
//        this.calculaImc();
//        if(this.getImc() < 16) return  "magreza grave";
//        if(this.getImc() < 17) return  "magreza moderada";
//        if(this.getImc() < 18.5) return  "magreza leve";
//        if(this.getImc() < 25) return  "saudavel";
//        if(this.getImc() < 30) return  "sobrepeso";
//        if(this.getImc() < 35) return  "obesidade grau 1";
//        if(this.getImc() < 40) return  "obesidade grau 2";
//        return "obesidade grau 3";
//    }

}
