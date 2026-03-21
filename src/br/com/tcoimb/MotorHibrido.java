package br.com.tcoimb;

public class MotorHibrido implements IMotor {
    @Override
    public void ligar() {
        System.out.println("Ligando Motor Híbrido! 🤫");
    }
}