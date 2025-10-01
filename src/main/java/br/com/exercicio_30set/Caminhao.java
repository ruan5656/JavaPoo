package br.com.exercicio_30set;

public class Caminhao extends Veiculo{
    private int QtdEixo;
    private  boolean ComCarreta;

    public Caminhao ( String modelo,
                      String marca,
                      int ano,
                      boolean ComCarreta){
        super(modelo,marca,ano);
        this.QtdEixo = QtdEixo;
        this.ComCarreta = ComCarreta;
    }

    @Override

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Quantos Eixos: " + QtdEixo);
        System.out.println("Possui Carreta?: " + (ComCarreta ? "Sim" : "Não"));
    }


}
