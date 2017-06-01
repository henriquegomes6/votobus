package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 15/02/2016.
 */
public class Fortaleza {
    public String[] diasemanda = {"SEG/SEX","SABADO"};
    public String vigencia = "08/10/2016";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("06:00"));
        lst.add(new horario("07:00"));
        lst.add(new horario("08:10"));
        lst.add(new horario("09:30"));
        lst.add(new horario("10:40"));
        lst.add(new horario("11:50"));
        lst.add(new horario("13:00"));
        lst.add(new horario("14:10"));
        lst.add(new horario("15:20"));
        lst.add(new horario("16:40"));
        lst.add(new horario("17:50"));
        lst.add(new horario("19:00"));
        lst.add(new horario("20:00"));
        return lst;
    }

    public List<horario> segSexO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("06:15"));
        lst.add(new horario("07:20"));
        lst.add(new horario("08:30"));
        lst.add(new horario("09:50"));
        lst.add(new horario("11:00"));
        lst.add(new horario("12:10"));
        lst.add(new horario("13:20"));
        lst.add(new horario("14:30"));
        lst.add(new horario("15:40"));
        lst.add(new horario("17:00"));
        lst.add(new horario("18:10"));
        lst.add(new horario("19:20"));
        return lst;
    }

    public List<horario> sabI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("06:00"));
        lst.add(new horario("07:00"));
        lst.add(new horario("08:10"));
        lst.add(new horario("09:30"));
        lst.add(new horario("10:40"));
        lst.add(new horario("11:50"));
        lst.add(new horario("13:00"));
        lst.add(new horario("14:10"));
        lst.add(new horario("15:20"));
        lst.add(new horario("16:40"));
        lst.add(new horario("17:50"));
        lst.add(new horario("19:00"));
        return lst;
    }

    public List<horario> sabO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("06:15"));
        lst.add(new horario("07:20"));
        lst.add(new horario("08:30"));
        lst.add(new horario("09:50"));
        lst.add(new horario("11:00"));
        lst.add(new horario("12:10"));
        lst.add(new horario("13:20"));
        lst.add(new horario("14:30"));
        lst.add(new horario("15:40"));
        lst.add(new horario("17:00"));
        lst.add(new horario("18:10"));
        lst.add(new horario("19:20"));
        return lst;
    }
}
