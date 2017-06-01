package com.br.henrique.votobus.TO;

import java.io.Serializable;

/**
 * Created by Henrique on 01/02/2016.
 */
public class horario implements Serializable {
    private String Io;
    private int ob =1;
    private String obs;

    public horario(String io, String obs) {
        this.setIo(io);
        this.setOb(0);
        this.setObs(obs);

    }
    public horario(String io) {
        this.setIo(io);
    }

    public String getIo() {
        return Io;
    }

    public void setIo(String io) {
        Io = io;
    }

    public int getOb() {
        return ob;
    }

    public void setOb(int ob) {
        this.ob = ob;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }



}
