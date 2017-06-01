package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 22/01/2016.
 */
public class RioAcimaGarcia {
    public String[] diasemanda = {"SEG/SEX", "SABADO", "DOMINGO"};
    public String vigencia = " 20/04/2015";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("07:50"));
        lst.add(new horario("08:35"));
        lst.add(new horario("09:20"));
        lst.add(new horario("10:05"));
        lst.add(new horario("10:50"));
        lst.add(new horario("11:35"));
        lst.add(new horario("13:05"));
        lst.add(new horario("13:50"));
        lst.add(new horario("14:35"));
        lst.add(new horario("15:20"));
        lst.add(new horario("16:05"));
        lst.add(new horario("16:50"));
        lst.add(new horario("17:35"));
        lst.add(new horario("19:05"));
        lst.add(new horario("19:50"));
        lst.add(new horario("20:35"));
        lst.add(new horario("21:20"));
        lst.add(new horario("22:05"));
        lst.add(new horario("22:50"));
        lst.add(new horario("23:35"));
        return lst;
    }

    public List<horario> segSexO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("SOROCABA"));
        lst.add(new horario("05:30"));
        lst.add(new horario("07:05"));
        lst.add(new horario("08:00", "Viagens realizadas sem entrar na Vila Garcia"));
        lst.add(new horario("08:35"));
        lst.add(new horario("09:20"));
        lst.add(new horario("10:05"));
        lst.add(new horario("10:50"));
        lst.add(new horario("13:05"));
        lst.add(new horario("14:35"));
        lst.add(new horario("15:20"));
        lst.add(new horario("16:05"));
        lst.add(new horario("16:50"));
        lst.add(new horario("17:35"));
        lst.add(new horario("19:05"));
        lst.add(new horario("19:50"));
        lst.add(new horario("20:35"));
        lst.add(new horario("21:20"));
        lst.add(new horario("22:05"));
        lst.add(new horario("23:35"));
        return lst;
    }

    public List<horario> sabadoI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("04:50"));
        lst.add(new horario("05:50"));
        lst.add(new horario("06:20"));
        lst.add(new horario("07:15"));
        lst.add(new horario("07:50"));
        lst.add(new horario("08:35"));
        lst.add(new horario("09:20"));
        lst.add(new horario("10:05"));
        lst.add(new horario("10:50"));
        lst.add(new horario("11:25"));
        lst.add(new horario("12:20"));
        lst.add(new horario("13:50"));
        lst.add(new horario("14:35"));
        lst.add(new horario("16:05"));
        lst.add(new horario("16:50"));
        lst.add(new horario("18:20"));
        lst.add(new horario("19:05"));
        lst.add(new horario("19:50"));
        lst.add(new horario("20:35"));
        lst.add(new horario("21:20"));
        lst.add(new horario("22:05"));
        lst.add(new horario("22:50"));
        lst.add(new horario("23:35"));
        return lst;
    }

    public List<horario> sabadoO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("SOROCABA"));
        lst.add(new horario("05:30"));
        lst.add(new horario("06:30"));
        lst.add(new horario("07:05"));
        lst.add(new horario("08:00", "Viagens realizadas sem entrar na Vila Garcia"));
        lst.add(new horario("08:35"));
        lst.add(new horario("09:20"));
        lst.add(new horario("10:05"));
        lst.add(new horario("10:50"));
        lst.add(new horario("11:35"));
        lst.add(new horario("12:20"));
        lst.add(new horario("13:05"));
        lst.add(new horario("13:50"));
        lst.add(new horario("14:35"));
        lst.add(new horario("15:20"));
        lst.add(new horario("16:05"));
        lst.add(new horario("16:50"));
        lst.add(new horario("17:35"));
        lst.add(new horario("18:20"));
        lst.add(new horario("19:05"));
        lst.add(new horario("19:50"));
        lst.add(new horario("20:35"));
        lst.add(new horario("21:20"));
        lst.add(new horario("22:05"));
        lst.add(new horario("22:50"));
        lst.add(new horario("23:35"));
        return lst;
    }

    public List<horario> domingoI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("04:50"));
        lst.add(new horario("06:20"));
        lst.add(new horario("07:50"));
        lst.add(new horario("09:20"));
        lst.add(new horario("10:50"));
        lst.add(new horario("12:20"));
        lst.add(new horario("13:50"));
        lst.add(new horario("15:20"));
        lst.add(new horario("16:50"));
        lst.add(new horario("18:20"));
        lst.add(new horario("19:50"));
        lst.add(new horario("21:20"));
        lst.add(new horario("22:50"));
        return lst;
    }

    public List<horario> domingoO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("SOROCABA"));
        lst.add(new horario("05:25"));
        lst.add(new horario("07:05"));
        lst.add(new horario("08:35"));
        lst.add(new horario("10:05"));
        lst.add(new horario("11:35"));
        lst.add(new horario("13:05"));
        lst.add(new horario("14:35"));
        lst.add(new horario("16:05"));
        lst.add(new horario("17:35"));
        lst.add(new horario("19:05"));
        lst.add(new horario("20:35"));
        lst.add(new horario("22:05"));
        lst.add(new horario("23:35"));
        return lst;
    }

}
