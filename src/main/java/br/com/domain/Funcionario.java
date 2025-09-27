package br.com.domain;

public abstract class Funcionario {
    protected String nome;
    protected String matricula;
    protected Double salarioBase;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;

    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;

    }
    public Double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;

    }

    public Funcionario(String nome, String matrícula, Double salarioBase){
        this.nome = nome;
        this.matricula = matrícula;
        this.salarioBase = salarioBase;


    }
    //Método abstrato para ser implementado nas subclasses
     public abstract double calcularSalario();

    //método abstrato deve ser implementado pelas classes
    public void exibirDados(){
        System.out.println("Nome:" + nome);
        System.out.println("matricula: " + matricula);
        System.out.println("Salario Base : "+ salarioBase);
        System.out.println("Salário Final R$ : "+calcularSalario());
    }
}
