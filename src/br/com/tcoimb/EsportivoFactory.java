package br.com.tcoimb;

public class EsportivoFactory implements ICarroFactory {

    @Override
    public IMotor criarMotor() {
        return new MotorTurbo();
    }

    @Override
    public IEstofado criarEstofado() {
        return new EstofadoConcha();
    }
}
