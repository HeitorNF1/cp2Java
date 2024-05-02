package br.fiap.heitor.domain.model;

public class Veiculos {
    //atributos bases
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeMaxima;

    private int velocidadeAtual;



    //métodos

    public void acelerar(int incremento){
        System.out.println("acelerando, velocidade atual: " + velocidadeAtual);

    }

    public void reduzirVelocidade(int decremento){
        System.out.println("reduzindo, velocidade atual: " + velocidadeAtual);

    }

    public void obterStatus(){
        if(getVelocidadeAtual() >= getVelocidadeMaxima()){
            setVelocidadeAtual(getVelocidadeMaxima());
        }
        System.out.println("Informações: " + "\n Marca: "+ getMarca() + "\n Modelo: " + getModelo() + "\n ano: " + getAno()
                 + "\n Velocidade Atual: " + getVelocidadeAtual());
    }





    //constructor

    public Veiculos(String marca, String modelo, int ano, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        if (ano >= 0){
            this.ano = ano;
        }
        else{
            throw new IllegalArgumentException("O ano não pode ser negativo.");
        }

        if (velocidadeAtual >= 0){
            this.velocidadeAtual = velocidadeAtual;
        }
        else{
            throw new IllegalArgumentException("A velocidade atual não pode ser negativa.");
        }

    }


    //getters e setters

    public String getMarca() {
        return marca;
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    protected void setAno(int ano) {
        if (ano >= 0){
            this.ano = ano;
        }
        else{
            throw new IllegalArgumentException("O ano não pode se negativo!.");
        }
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    protected void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    protected void setVelocidadeAtual(int velocidadeAtual) {

        if (velocidadeAtual >= 0){
            this.velocidadeAtual = velocidadeAtual;
        }
        else{
            throw new IllegalArgumentException("A velocidade atual não pode ser negativa.");
        }

    }


}
