package br.com.domain;

public class Desenvolvedor extends Funcionario {

    private int horasExtras;
    private Double valorHoraExtra;

    public Desenvolvedor(String nome,
                         String matricula,
                         double salarioBase,
                         int horasExtras,
                         Double valorHoraExtra) {
        super(nome, matricula, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (valorHoraExtra * horasExtras);

    }

    public void Registrar(int horas) {

        this.horasExtras = horas;
    }
}
