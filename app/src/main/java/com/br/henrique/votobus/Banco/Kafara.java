package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 15/02/2016.
 */
public class Kafara {
    public String[] diasemanda = {"SEG/SEX", "SABADO"};
    public String vigencia = "07/11/2011";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:05"));
        lst.add(new horario("10:30"));
        lst.add(new horario("13:00"));
        lst.add(new horario("18:15"));
        return lst;
    }

    public List<horario> segSexO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("06:00"));
        lst.add(new horario("11:30"));
        lst.add(new horario("14:15"));
        lst.add(new horario("19:20"));
        return lst;
    }

    public List<horario> sabadoI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("06:00"));
        lst.add(new horario("13:00"));
        return lst;
    }

    public List<horario> sabadoO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("07:00"));
        lst.add(new horario("14:15"));
        return lst;
    }
}
