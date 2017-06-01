package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 15/02/2016.
 */
public class Votocel {
    public String[] diasemanda = {"SEG/SEX"};
    public String vigencia = "19/03/2015";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("17:00"));
        lst.add(new horario("17:30"));
        lst.add(new horario("18:00"));
        lst.add(new horario("18:30"));
        lst.add(new horario("19:00"));
        lst.add(new horario("19:30"));
        return lst;
    }

    public List<horario> segSexO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("07:15"));
        lst.add(new horario("17:10"));
        lst.add(new horario("17:40"));
        lst.add(new horario("18:10"));
        lst.add(new horario("18:40"));
        lst.add(new horario("19:10"));
        lst.add(new horario("19:40"));
        return lst;
    }
}
