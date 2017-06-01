package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

public class Helena {
    public String[] diasemanda = {"SEG/SEX"};
    public String vigencia = "16/03/2017";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("06:25"));
        lst.add(new horario("17:15"));
        return lst;
    }
    public List<horario> segSexO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("06:10"));
        lst.add(new horario("06:55"));
        lst.add(new horario("17:55"));
        return lst;
    }

}
