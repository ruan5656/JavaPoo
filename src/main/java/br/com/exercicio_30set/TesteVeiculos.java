package br.com.exercicio_30set;

public class TesteVeiculos {
    public static void main(String[] args) {
        Veiculo[] frota = {
                new Carro("Ford", "Fiesta", 2020, 4, true),
                new Moto("Honda", "CG 160", 2021, 160, true),
                new Caminhao("Volvo","FH540",2025,true)
        };

        for (Veiculo veiculo : frota) {
            veiculo.exibirInfo();
            veiculo.acelerar(60);
            System.out.println("---");
        }
    }
}
