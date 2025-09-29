package br.com.exercicio_26set;

public class Gerente extends Funcionario{
       private double bonusPerfomance;
       private double comissao;

       public Gerente(String nome,String matricula, double salarioBase){

               super(nome, matricula, salarioBase);
               this.bonusPerfomance = 0.0;
               this.comissao = 0.0;
           }

    public double getBonusPerfomance() {
        return bonusPerfomance;
    }

    public void setBonusPerfomance(double bonusPerfomance) {
        this.bonusPerfomance = bonusPerfomance;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public double calcularSalario() {
        return 0;
    }

    public void setBonusPerformance(int i) {
    }
}
