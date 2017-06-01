package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;


public class Paraiso {
    public String[] diasemanda = {"SEG/DOMINGO","Extra SEG/SEX"};
    public String vigencia = "10/04/2017";

    public List<horario> segSabI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:15"));
        lst.add(new horario("06:00"));
        lst.add(new horario("07:00"));
        lst.add(new horario("08:00"));
        lst.add(new horario("09:00"));
        lst.add(new horario("10:00"));
        lst.add(new horario("11:00"));
        lst.add(new horario("12:00"));
        lst.add(new horario("13:00"));
        lst.add(new horario("14:00"));
        lst.add(new horario("15:00"));
        lst.add(new horario("16:00"));
        lst.add(new horario("17:00"));
        lst.add(new horario("18:00"));
        lst.add(new horario("19:00"));
        lst.add(new horario("20:00"));
        lst.add(new horario("20:55"));
        lst.add(new horario("21:50"));
        lst.add(new horario("22:35"));
        lst.add(new horario("23:25","Viagem termina no Shopping Iguatemi não atende Res. Sicília"));
        return lst;
    }

    public List<horario> segSabO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("04:40", "Começa no Shopping Iguatemi"));
        lst.add(new horario("05:35"));
        lst.add(new horario("06:25"));
        lst.add(new horario("07:25"));
        lst.add(new horario("08:25"));
        lst.add(new horario("09:25"));
        lst.add(new horario("10:25"));
        lst.add(new horario("11:25"));
        lst.add(new horario("12:25"));
        lst.add(new horario("13:25"));
        lst.add(new horario("14:25"));
        lst.add(new horario("15:25"));
        lst.add(new horario("16:25"));
        lst.add(new horario("17:25"));
        lst.add(new horario("18:25"));
        lst.add(new horario("19:25"));
        lst.add(new horario("20:25"));
        lst.add(new horario("21:20"));
        lst.add(new horario("22:10"));
        lst.add(new horario("23:00"));
        lst.add(new horario("23:45", ""));
        return lst;
    }

    public List<horario> domingoI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("07:30"));
        return lst;
    }

    public List<horario> domingoO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("07:55"));
        return lst;
    }
}
