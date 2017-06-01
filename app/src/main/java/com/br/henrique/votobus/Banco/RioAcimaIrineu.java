package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 21/02/2016.
 */
public class RioAcimaIrineu {
    public String[] diasemanda = {"SEG/SEX","SABADO"};
    public String vigencia = "08/10/2016";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("04:50"));
        lst.add(new horario("05:25","Viagens realizadas sem entrar na Vila Garcia."));
        lst.add(new horario("05:40"));
        lst.add(new horario("06:20"));
        lst.add(new horario("06:40"));
        lst.add(new horario("07:15"));
        lst.add(new horario("12:20"));
        lst.add(new horario("17:55"));
        lst.add(new horario("18:20"));
        return lst;
    }
    public List<horario> segSexO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("06:00","Viagens realizadas sem entrar na Vila Garcia."));
        lst.add(new horario("06:25"));
        lst.add(new horario("07:25"));
        lst.add(new horario("11:35"));
        lst.add(new horario("12:20"));
        lst.add(new horario("13:50"));
        lst.add(new horario("17:10"));
        lst.add(new horario("18:00"));
        lst.add(new horario("18:20"));
        lst.add(new horario("18:40"));
        lst.add(new horario("22:50"));
        return lst;
    }
    public List<horario> sabadoI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:25","Viagens realizadas sem entrar na Vila Garcia."));
        lst.add(new horario("06:40"));
        lst.add(new horario("13:05"));
        lst.add(new horario("15:20"));
        return lst;
    }
    public List<horario> sabadoO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("06:00","Viagens realizadas sem entrar na Vila Garcia."));
        lst.add(new horario("07:25"));
        return lst;
    }

}
