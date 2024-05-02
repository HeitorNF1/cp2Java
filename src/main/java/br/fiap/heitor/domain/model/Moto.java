package br.fiap.heitor.domain.model;

public class Moto extends Veiculos{
    //construtor da super classe
    private boolean empinando = false;
    public Moto(String marca, String modelo, int ano ,int velocidadeAtual) {
        super(marca, modelo, ano, velocidadeAtual);
        setVelocidadeMaxima(120);
        if (getVelocidadeAtual() > getVelocidadeMaxima()){

            setVelocidadeAtual(getVelocidadeMaxima());
        }
    }

    //métodos da classe carro

    @Override
    public void acelerar(int incremento){
        if (incremento >= 0) {
            if ((getVelocidadeAtual() + incremento) == 0) {
                System.out.println("moto parado com a velocidade 0!");
            } else if (getVelocidadeMaxima() >= (getVelocidadeAtual() + incremento)) {
                setVelocidadeAtual(getVelocidadeAtual()+incremento);
                System.out.println("Acelerando o moto..." + "\nvelocidade atual: " + (getVelocidadeAtual())+ "km/h");
            } else if ((getVelocidadeAtual() + incremento) >= getVelocidadeMaxima()) {
                setVelocidadeAtual(getVelocidadeMaxima());
                System.out.println("Moto atingiu velocidade maxima de: " + getVelocidadeMaxima()+ "km/h");
            }
        }
        else{
            System.out.println("Informe um valor positivo ou nulo!");
        }
    }
    @Override
    public void reduzirVelocidade(int decremento){
        if(decremento >= 0 ) {
            if ((getVelocidadeAtual() - decremento) > 0) {
                setVelocidadeAtual(getVelocidadeAtual()-decremento);
                System.out.println("Reduzindo a velocidade..." + "\nVelocidade atual: " + (getVelocidadeAtual())+ "km/h");
            }
            else if ((getVelocidadeAtual() - decremento) <= 0 ) {
                setVelocidadeAtual(0);
                System.out.println("Parando a moto...");
            }
        }else{
            System.out.println("Informe um valor positivo ou nulo!");
        }
    }

    @Override
    public void obterStatus(){

        System.out.println("Informações: " + "\n Marca: "+ getMarca() + "\n Modelo: " + getModelo() + "\n ano: " + getAno()
                + "\n velocidade maxima: " + getVelocidadeMaxima() + "km/h"+"\n Velocidade Atual: " + getVelocidadeAtual() + "km/h"
                + "\n empinando a moto: "+ empinando);
    }



    public void empinar(){

        if (!empinando && getVelocidadeAtual() >= 20 && getVelocidadeAtual() <= 50){
            empinando = true;
            System.out.println("empinando a moto");
        }
        else{
            System.out.println("A moto deve estar entre 20 e 50 KM/H");
        }
    }

    public void parar_de_empinar(){
        if (empinando){
            empinando = false;
            System.out.println("Parando de empinar a moto!");
        }
    }


}
