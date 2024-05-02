package br.fiap.heitor.domain.model;

public class Carro extends Veiculos{

    private boolean carro_ligado = true;
    private String ar = "desligado";
    //construtor da super classe
    public Carro(String marca, String modelo, int ano ,int velocidadeAtual) {
        super(marca, modelo, ano, velocidadeAtual);

        setVelocidadeMaxima(180);

        if (getVelocidadeAtual() > getVelocidadeMaxima()){

            setVelocidadeAtual(getVelocidadeMaxima());
        }
    }

    //sobre escrevencdo as classes do super

    @Override
    public void acelerar(int incremento){
        if (incremento >= 0) {
            if ((getVelocidadeAtual() + incremento) == 0) {
                System.out.println("carro parado com a velocidade 0!");
            }
            else if(getVelocidadeMaxima() >= (getVelocidadeAtual() + incremento)) {
                setVelocidadeAtual(getVelocidadeAtual()+incremento);
                System.out.println("Acelerando o carro..." + "\nvelocidade atual: " + (getVelocidadeAtual())+ "km/h");
            }
            else if ((getVelocidadeAtual() + incremento) >= getVelocidadeMaxima()) {
                setVelocidadeAtual(getVelocidadeMaxima());
                System.out.println("Carro atingiu velocidade maxima de: " + getVelocidadeMaxima()+ "km/h");
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
                System.out.println("Reduzindo a velocidade..." + "\nVelocidade atual: " + (getVelocidadeAtual()) + "km/h");
            }
            else if ((getVelocidadeAtual() - decremento) <= 0 ) {
                setVelocidadeAtual(0);
                System.out.println("Parando o carro...");
            }
        }else{
            System.out.println("Informe um valor positivo ou nulo!");
        }
    }

    @Override
    public void obterStatus(){

        System.out.println("Informações: " + "\n Marca: "+ getMarca() + "\n Modelo: " + getModelo() + "\n ano: " + getAno()
                + "\n velocidade maxima: " + getVelocidadeMaxima() +  "km/h"+"\n Velocidade Atual: " + getVelocidadeAtual()+ "km/h"
                + "\n situação do ar: "+ ar);
    }

    public boolean ligar_carro(){
        return carro_ligado = true;
    }
    public boolean desligar_carro(){
        desligar_ar_condicionado();
        return carro_ligado = false;

    }
    public void ligar_ar_condicionado(){
        if (carro_ligado){
            setAr("ligado");

        }
        else{
            setAr("desligado");

        }
    }
    public void desligar_ar_condicionado(){
        if (carro_ligado){
            setAr("desligado");

        }
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }


}
