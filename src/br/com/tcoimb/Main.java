package br.com.tcoimb;

public class Main {
    public static void main(String[] args){
        ICarroFactory fabrica;
        fabrica = new LuxoFactory();
        IMotor motor = fabrica.criarMotor();
        IEstofado estofado = fabrica.criarEstofado();

        System.out.println("Produzindo Carro");
        motor.ligar();
        estofado.exibirTipo();
    }
}
