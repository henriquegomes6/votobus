package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 23/01/2016.
 */
public class VilaGarciaNova {
    public String[] diasemanda = {"SEG/SAB", "DOMINGO", "Extra SEG/SEX"};
    public String vigencia = "17/10/2016";

    public List<horario> segSabadoI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("VILA NOVA"));
        lst.add(new horario("04:38"));
        lst.add(new horario("04:38"));
        lst.add(new horario("06:00"));
        lst.add(new horario("06:40"));
        lst.add(new horario("07:25"));
        lst.add(new horario("08:10"));
        lst.add(new horario("08:55"));
        lst.add(new horario("09:40"));
        lst.add(new horario("10:25"));
        lst.add(new horario("11:10"));
        lst.add(new horario("11:55"));
        lst.add(new horario("12:40"));
        lst.add(new horario("13:25"));
        lst.add(new horario("14:10","Atendimento a empresa Dixie Toga (Seg a Sex)"));
        lst.add(new horario("14:55"));
        lst.add(new horario("15:40"));
        lst.add(new horario("16:25"));
        lst.add(new horario("17:10"));
        lst.add(new horario("17:55"));
        lst.add(new horario("18:40"));
        lst.add(new horario("20:10"));
        lst.add(new horario("21:40"));
        lst.add(new horario("23:10"));
        return lst;
    }

    public List<horario> segSabadoO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("SOROCABA"));
        lst.add(new horario("05:20"));
        lst.add(new horario("06:00"));
        lst.add(new horario("06:40"));
        lst.add(new horario("07:25"));
        lst.add(new horario("08:10"));
        lst.add(new horario("08:55"));
        lst.add(new horario("09:40"));
        lst.add(new horario("10:25"));
        lst.add(new horario("11:10"));
        lst.add(new horario("11:55"));
        lst.add(new horario("12:40"));
        lst.add(new horario("13:25"));
        lst.add(new horario("14:10"));
        lst.add(new horario("14:55"));
        lst.add(new horario("15:40"));
        lst.add(new horario("16:25"));
        lst.add(new horario("17:10"));
        lst.add(new horario("17:55"));
        lst.add(new horario("18:40"));
        lst.add(new horario("19:25"));
        lst.add(new horario("20:55"));
        lst.add(new horario("22:25"));
        lst.add(new horario("00:00"));
        return lst;
    }

    public List<horario> domingoI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("VILA NOVA"));
        lst.add(new horario("05:00"));
        lst.add(new horario("06:45"));
        lst.add(new horario("08:15"));
        lst.add(new horario("09:45"));
        lst.add(new horario("11:15"));
        lst.add(new horario("12:45"));
        lst.add(new horario("14:15"));
        lst.add(new horario("15:45"));
        lst.add(new horario("17:15"));
        lst.add(new horario("18:45"));
        lst.add(new horario("20:15"));
        lst.add(new horario("21:45"));
        lst.add(new horario("23:10"));
        return lst;
    }

    public List<horario> domingoO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("SOROCABA"));
        lst.add(new horario("06:00"));
        lst.add(new horario("07:30"));
        lst.add(new horario("09:00"));
        lst.add(new horario("10:30"));
        lst.add(new horario("12:00"));
        lst.add(new horario("13:30"));
        lst.add(new horario("15:00"));
        lst.add(new horario("16:30"));
        lst.add(new horario("18:00"));
        lst.add(new horario("19:30"));
        lst.add(new horario("21:00"));
        lst.add(new horario("22:30"));
        lst.add(new horario("23:45"));
        return lst;
    }

    public List<horario> exSegSexI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("VILA NOVA"));
        lst.add(new horario("06:10"));
        return lst;
    }

    public List<horario> exSegSexO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("SOROCABA"));
        lst.add(new horario("18:15"));
        return lst;
    }
}
