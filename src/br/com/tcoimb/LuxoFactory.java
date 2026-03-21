package br.com.tcoimb;

public class LuxoFactory implements ICarroFactory {

    @Override
    public IMotor criarMotor() {
        return new MotorHibrido();
    }

    @Override
    public IEstofado criarEstofado() {
        return new EstofadoMassagem();
    }
}