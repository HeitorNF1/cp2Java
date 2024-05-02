package br.fiap.heitor.domain.model;

public class Caminhao extends Veiculos {

    private double carga;
    //construtor da super classe
    public Caminhao(String marca, String modelo, int ano, int velocidadeAtual) {
        super(marca, modelo, ano, velocidadeAtual);
        setVelocidadeMaxima(100);
        if (getVelocidadeAtual() > getVelocidadeMaxima()) {

            setVelocidadeAtual(getVelocidadeMaxima());
        }
    }

    //métodos da classe carro

    @Override
    public void acelerar(int incremento) {
        if (incremento >= 0) {
            if ((getVelocidadeAtual() + incremento) == 0) {
                System.out.println("Caminhao parado com a velocidade 0!");
            } else if (getVelocidadeMaxima() >= (getVelocidadeAtual() + incremento)) {
                setVelocidadeAtual(getVelocidadeAtual() + incremento);
                System.out.println("Acelerando o caminhao..." + "\nvelocidade atual: " + (getVelocidadeAtual())+ "km/h");
            } else if ((getVelocidadeAtual() + incremento) >= getVelocidadeMaxima()) {
                setVelocidadeAtual(getVelocidadeMaxima());
                System.out.println("caminhao atingiu velocidade maxima de: " + getVelocidadeMaxima()+ "km/h");
            }
        } else {
            System.out.println("Informe um valor positivo ou nulo!");
        }
    }

    @Override
    public void reduzirVelocidade(int decremento) {
        if (decremento >= 0) {
            if ((getVelocidadeAtual() - decremento) > 0) {
                setVelocidadeAtual(getVelocidadeAtual() - decremento);
                System.out.println("Reduzindo a velocidade..." + "\nVelocidade atual: " + (getVelocidadeAtual())+ "km/h");
            } else if ((getVelocidadeAtual() - decremento) <= 0) {
                setVelocidadeAtual(0);
                System.out.println("Parando o caminhao...");
            }
        } else {
            System.out.println("Informe um valor positivo ou nulo!");
        }
    }

    @Override
    public void obterStatus() {

        System.out.println("Informações: " + "\n Marca: " + getMarca() + "\n Modelo: " + getModelo() + "\n ano: " + getAno()
                + "\n velocidade maxima: " + getVelocidadeMaxima() + "km/h"+ "\n Velocidade Atual: " + getVelocidadeAtual()+ "km/h"
                + "\n Carga levada: " + carga);
    }

    public void carregar(double valor) {
        if (valor > 0) {
            carga = carga + valor;
            if (carga <= 1000) {

                System.out.println("carga carregada com sucesso! peso atual: " + carga + "KG");
            } else if (carga > 1000) {
                carga = 1000;
                System.out.println("O caminhao só consegue carregar ate 1 Tonelada");
            }
        }else{
            System.out.println("Informe um valor entre 0 e 1000 KG");
        }
    }
    public void descarregar(double valor) {
        if (valor >= 0) {
            carga = carga - valor;
            if (carga <= 1000) {

                System.out.println("carga descarregada com sucesso! peso atual: " + carga + "KG");
            } else if (carga <= 0) {
                carga = 0;
                System.out.println("Carga tirada totalmente!");
            }
        }else{
            System.out.println("Informe um valor entre 0 e 1000KG");
        }
    }
}