package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 27/01/2016.
 */
public class Pinheiros {
    public String[] diasemanda = {"SEG/SEX"};
    public String vigencia = "17/10/2016";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("06:40"));
        lst.add(new horario("07:30"));
        lst.add(new horario("12:30"));
        lst.add(new horario("13:35"));
        lst.add(new horario("17:40"));
        return lst;
    }

    public List<horario> segSexO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("SOROCABA"));
        lst.add(new horario("07:05"));
        lst.add(new horario("07:55"));
        lst.add(new horario("12:55"));
        lst.add(new horario("14:00"));
        lst.add(new horario("18:10"));
        return lst;
    }
}
