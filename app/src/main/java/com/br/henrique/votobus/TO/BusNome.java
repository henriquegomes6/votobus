package com.br.henrique.votobus.TO;


/**
 * Created by Henrique on 12/01/2016.
 */
public class BusNome implements Comparable<BusNome> {
    private int cod;
    private int numero;
    private String nome;
    private String io;

    public BusNome(int c, int numero,String n, String i){
        this.setCod(c);
        this.setNumero(numero);
        this.setNome(n);
        this.setIo(i);
    }
    public BusNome(){}

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIo() {
        return io;
    }

    public void setIo(String io) {
        this.io = io;
    }

    @Override
    public int compareTo(BusNome busNome) {
        return nome.compareTo(busNome.getNome());
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
