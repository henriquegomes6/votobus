package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 23/01/2016.
 */
public class VilaNovaDireto {
    public String[] diasemanda = {"SEG/SAB", "DOMINGO", "Extra SEG/SEX"};
    public String vigencia = "10/05/2017";

    public List<horario> segSabadoI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("VILA NOVA"));
        lst.add(new horario("04:05"));
        lst.add(new horario("05:00"));
        lst.add(new horario("05:40"));
        lst.add(new horario("06:20"));
        lst.add(new horario("06:55"));
        lst.add(new horario("07:50"));
        lst.add(new horario("08:30"));
        lst.add(new horario("09:20"));
        lst.add(new horario("10:00"));
        lst.add(new horario("10:50"));
        lst.add(new horario("11:30"));
        lst.add(new horario("12:20"));
        lst.add(new horario("13:00"));
        lst.add(new horario("13:50"));
        lst.add(new horario("14:30"));
        lst.add(new horario("15:20"));
        lst.add(new horario("16:00"));
        lst.add(new horario("16:50"));
        lst.add(new horario("17:30"));
        lst.add(new horario("18:20"));
        lst.add(new horario("19:00"));
        lst.add(new horario("19:50"));
        lst.add(new horario("20:30"));
        lst.add(new horario("21:20"));
        lst.add(new horario("22:00"));
        lst.add(new horario("22:50"));
        return lst;
    }

    public List<horario> segSabadoO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("SOROCABA"));
        lst.add(new horario("04:50"));
        lst.add(new horario("05:40"));
        lst.add(new horario("06:25"));
        lst.add(new horario("07:05"));
        lst.add(new horario("07:45"));
        lst.add(new horario("08:35"));
        lst.add(new horario("09:15"));
        lst.add(new horario("10:05"));
        lst.add(new horario("10:45"));
        lst.add(new horario("11:35"));
        lst.add(new horario("12:15"));
        lst.add(new horario("13:05"));
        lst.add(new horario("13:45"));
        lst.add(new horario("14:35"));
        lst.add(new horario("15:15"));
        lst.add(new horario("16:05"));
        lst.add(new horario("16:45"));
        lst.add(new horario("17:35"));
        lst.add(new horario("18:15"));
        lst.add(new horario("19:05"));
        lst.add(new horario("19:45"));
        lst.add(new horario("20:35"));
        lst.add(new horario("21:15"));
        lst.add(new horario("22:05"));
        lst.add(new horario("22:45"));
        lst.add(new horario("23:35"));
        return lst;
    }

    public List<horario> domingoI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("VILA NOVA"));
        lst.add(new horario("04:15"));
        lst.add(new horario("05:45"));
        lst.add(new horario("07:15"));
        lst.add(new horario("08:45"));
        lst.add(new horario("10:15"));
        lst.add(new horario("11:45"));
        lst.add(new horario("13:15"));
        lst.add(new horario("14:45"));
        lst.add(new horario("16:15"));
        lst.add(new horario("17:45"));
        lst.add(new horario("19:15"));
        lst.add(new horario("20:45"));
        lst.add(new horario("22:15"));
        lst.add(new horario("23:30"));
        return lst;
    }

    public List<horario> domingoO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("SOROCABA"));
        lst.add(new horario("05:00"));
        lst.add(new horario("06:30"));
        lst.add(new horario("08:00"));
        lst.add(new horario("09:30"));
        lst.add(new horario("11:00"));
        lst.add(new horario("12:30"));
        lst.add(new horario("14:00"));
        lst.add(new horario("15:30"));
        lst.add(new horario("17:00"));
        lst.add(new horario("18:30"));
        lst.add(new horario("20:00"));
        lst.add(new horario("21:30"));
        lst.add(new horario("23:00"));
        lst.add(new horario("00:00"));
        return lst;
    }

    public List<horario> exSegSexI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("VILA NOVA"));
        lst.add(new horario("06:35"));
        lst.add(new horario("07:15"));
        return lst;
    }

    public List<horario> exSegSexO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("SOROCABA"));
        lst.add(new horario("17:45"));
        return lst;
    }
}
