package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 13/02/2016.
 */
public class Clarice {
    public String[] diasemanda = {"SEG/SAB"};
    public String vigencia = "10/04/2017";

    public List<horario> segSabI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("06:15"));
        lst.add(new horario("07:15"));
        lst.add(new horario("08:15"));
        lst.add(new horario("09:20"));
        lst.add(new horario("10:15"));
        lst.add(new horario("11:20"));
        lst.add(new horario("12:20"));
        lst.add(new horario("13:15"));
        lst.add(new horario("14:15"));
        lst.add(new horario("15:20"));
        lst.add(new horario("16:20"));
        lst.add(new horario("17:20"));
        lst.add(new horario("18:15"));
        lst.add(new horario("19:20"));
        lst.add(new horario("20:20"));
        lst.add(new horario("21:15"));
        lst.add(new horario("22:00"));
        lst.add(new horario("22:40"));
        lst.add(new horario("23:20"));
        return lst;
    }

    public List<horario> segSabO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("06:40"));
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
        lst.add(new horario("21:35"));
        lst.add(new horario("22:20"));
        lst.add(new horario("23:00"));
        lst.add(new horario("23:40"));
        return lst;
    }
}
