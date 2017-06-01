package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 09/02/2016.
 */
public class Serrano1 {
    public String[] diasemanda = {"SEG/SEX", "SABADO", "DOMINGO"};
    public String vigencia = "01/06/2017";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:15"));
        lst.add(new horario("05:45"));
        lst.add(new horario("06:05"));
        lst.add(new horario("06:25"));
        lst.add(new horario("06:45"));
        lst.add(new horario("07:05"));
        lst.add(new horario("07:25"));
        lst.add(new horario("07:45"));
        lst.add(new horario("08:05"));
        lst.add(new horario("08:45"));
        lst.add(new horario("09:15"));
        lst.add(new horario("09:45"));
        lst.add(new horario("10:15"));
        lst.add(new horario("10:45"));
        lst.add(new horario("11:15"));
        lst.add(new horario("11:45"));
        lst.add(new horario("12:15"));
        lst.add(new horario("12:45"));
        lst.add(new horario("13:15"));
        lst.add(new horario("13:45"));
        lst.add(new horario("14:15"));
        lst.add(new horario("14:45"));
        lst.add(new horario("15:15"));
        lst.add(new horario("15:45", "Via Vila Guilherme"));
        lst.add(new horario("16:15", "Via Vila Guilherme"));
        lst.add(new horario("16:35", "Via Vila Guilherme"));
        lst.add(new horario("16:55", "Via Vila Guilherme"));
        lst.add(new horario("17:15", "Via Vila Guilherme"));
        lst.add(new horario("17:35", "Via Vila Guilherme"));
        lst.add(new horario("17:55"));
        lst.add(new horario("18:15"));
        lst.add(new horario("18:35"));
        lst.add(new horario("19:00"));
        lst.add(new horario("19:25"));
        lst.add(new horario("20:00"));
        lst.add(new horario("21:00"));
        lst.add(new horario("22:00"));
        lst.add(new horario("23:00"));
        lst.add(new horario("00:05"));
        return lst;
    }

    public List<horario> segSexO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("04:15"));
        lst.add(new horario("04:50"));
        lst.add(new horario("05:15"));
        lst.add(new horario("05:35", "Via Vila Guilherme"));
        lst.add(new horario("05:55", "Via Vila Guilherme"));
        lst.add(new horario("06:15", "Via Vila Guilherme"));
        lst.add(new horario("06:35"));
        lst.add(new horario("06:55", "Via Vila Guilherme"));
        lst.add(new horario("07:15", "Via Vila Guilherme"));
        lst.add(new horario("07:35"));
        lst.add(new horario("07:55", "Via Vila Guilherme"));
        lst.add(new horario("08:15", "Via Vila Guilherme"));
        lst.add(new horario("08:45"));
        lst.add(new horario("09:15"));
        lst.add(new horario("09:45"));
        lst.add(new horario("10:15"));
        lst.add(new horario("10:45"));
        lst.add(new horario("11:15", "Via Vila Guilherme"));
        lst.add(new horario("11:45", "Via Vila Guilherme"));
        lst.add(new horario("12:15", "Via Vila Guilherme"));
        lst.add(new horario("12:45", "Via Vila Guilherme"));
        lst.add(new horario("13:15", "Via Vila Guilherme"));
        lst.add(new horario("13:45"));
        lst.add(new horario("14:15"));
        lst.add(new horario("14:45"));
        lst.add(new horario("15:15"));
        lst.add(new horario("15:45"));
        lst.add(new horario("16:25"));
        lst.add(new horario("16:45"));
        lst.add(new horario("17:05"));
        lst.add(new horario("17:25"));
        lst.add(new horario("17:45"));
        lst.add(new horario("18:05"));
        lst.add(new horario("18:25"));
        lst.add(new horario("18:45"));
        lst.add(new horario("19:05"));
        lst.add(new horario("19:30"));
        lst.add(new horario("20:30"));
        lst.add(new horario("21:30"));
        lst.add(new horario("22:30"));
        lst.add(new horario("23:30"));
        return lst;
    }

    public List<horario> sabadoI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:20"));
        lst.add(new horario("05:45"));
        lst.add(new horario("06:15"));
        lst.add(new horario("06:45"));
        lst.add(new horario("07:15"));
        lst.add(new horario("07:45"));
        lst.add(new horario("08:15"));
        lst.add(new horario("08:55"));
        lst.add(new horario("09:25"));
        lst.add(new horario("09:55"));
        lst.add(new horario("10:25"));
        lst.add(new horario("10:55"));
        lst.add(new horario("11:25", "Via Vila Guilherme"));
        lst.add(new horario("11:55", "Via Vila Guilherme"));
        lst.add(new horario("12:25"));
        lst.add(new horario("12:55"));
        lst.add(new horario("13:25"));
        lst.add(new horario("14:05"));
        lst.add(new horario("14:35"));
        lst.add(new horario("15:05"));
        lst.add(new horario("15:35"));
        lst.add(new horario("16:05"));
        lst.add(new horario("16:35"));
        lst.add(new horario("17:05"));
        lst.add(new horario("17:35"));
        lst.add(new horario("18:00"));
        lst.add(new horario("18:30"));
        lst.add(new horario("18:55"));
        lst.add(new horario("19:45"));
        lst.add(new horario("20:55"));
        lst.add(new horario("21:50"));
        lst.add(new horario("22:45"));
        lst.add(new horario("00:05"));
        return lst;
    }

    public List<horario> sabadoO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("04:20"));
        lst.add(new horario("04:55"));
        lst.add(new horario("05:15"));
        lst.add(new horario("05:45", "Via Vila Guilherme"));
        lst.add(new horario("06:15", "Via Vila Guilherme"));
        lst.add(new horario("06:45", "Via Vila Guilherme"));
        lst.add(new horario("07:15", "Via Vila Guilherme"));
        lst.add(new horario("07:45", "Via Vila Guilherme"));
        lst.add(new horario("08:15", "Via Vila Guilherme"));
        lst.add(new horario("08:45"));
        lst.add(new horario("09:25"));
        lst.add(new horario("09:55"));
        lst.add(new horario("10:25"));
        lst.add(new horario("10:55"));
        lst.add(new horario("11:25"));
        lst.add(new horario("11:55"));
        lst.add(new horario("12:25"));
        lst.add(new horario("12:55"));
        lst.add(new horario("13:25"));
        lst.add(new horario("13:55"));
        lst.add(new horario("14:35"));
        lst.add(new horario("15:05"));
        lst.add(new horario("15:35"));
        lst.add(new horario("16:05"));
        lst.add(new horario("16:35"));
        lst.add(new horario("17:05"));
        lst.add(new horario("17:35"));
        lst.add(new horario("18:00"));
        lst.add(new horario("18:25"));
        lst.add(new horario("18:55"));
        lst.add(new horario("19:20"));
        lst.add(new horario("20:15"));
        lst.add(new horario("21:20"));
        lst.add(new horario("22:15"));
        lst.add(new horario("23:15"));
        return lst;
    }

    public List<horario> domingoI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:45"));
        lst.add(new horario("06:45"));
        lst.add(new horario("07:45"));
        lst.add(new horario("08:45"));
        lst.add(new horario("09:45"));
        lst.add(new horario("10:45"));
        lst.add(new horario("11:45"));
        lst.add(new horario("12:45"));
        lst.add(new horario("13:45"));
        lst.add(new horario("14:45"));
        lst.add(new horario("15:45"));
        lst.add(new horario("16:45"));
        lst.add(new horario("17:45"));
        lst.add(new horario("18:45"));
        lst.add(new horario("19:45"));
        lst.add(new horario("20:45"));
        lst.add(new horario("21:45"));
        lst.add(new horario("22:45"));
        lst.add(new horario("00:05"));
        return lst;
    }

    public List<horario> domingoO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("05:15"));
        lst.add(new horario("06:15"));
        lst.add(new horario("07:15"));
        lst.add(new horario("08:15"));
        lst.add(new horario("09:15"));
        lst.add(new horario("10:15"));
        lst.add(new horario("11:15"));
        lst.add(new horario("12:15"));
        lst.add(new horario("13:15"));
        lst.add(new horario("14:15"));
        lst.add(new horario("15:15"));
        lst.add(new horario("16:15"));
        lst.add(new horario("17:15"));
        lst.add(new horario("18:15"));
        lst.add(new horario("19:15"));
        lst.add(new horario("20:15"));
        lst.add(new horario("21:15"));
        lst.add(new horario("22:15"));
        lst.add(new horario("23:15"));
        return lst;
    }
}
