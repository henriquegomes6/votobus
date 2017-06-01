package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 15/02/2016.
 */
public class VilaGarcia {
    public String[] diasemanda = {"SEG/SEX", "SABADO", "DOMINGO"};
    public String vigencia = "22/03/2015";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:15","Atendimento Bairro dos Morros."));
        lst.add(new horario("06:00"));
        lst.add(new horario("06:30"));
        lst.add(new horario("07:00"));
        lst.add(new horario("07:35"));
        lst.add(new horario("08:10"));
        lst.add(new horario("08:50"));
        lst.add(new horario("09:25"));
        lst.add(new horario("09:55"));
        lst.add(new horario("10:30"));
        lst.add(new horario("11:05"));
        lst.add(new horario("11:40"));
        lst.add(new horario("12:15"));
        lst.add(new horario("12:50"));
        lst.add(new horario("13:25"));
        lst.add(new horario("14:00"));
        lst.add(new horario("14:35"));
        lst.add(new horario("15:10"));
        lst.add(new horario("15:45"));
        lst.add(new horario("16:25"));
        lst.add(new horario("16:55"));
        lst.add(new horario("17:35"));
        lst.add(new horario("18:05"));
        lst.add(new horario("18:40"));
        lst.add(new horario("19:15"));
        lst.add(new horario("19:50"));
        lst.add(new horario("20:30"));
        lst.add(new horario("21:00"));
        lst.add(new horario("21:30"));
        lst.add(new horario("22:35"));
        lst.add(new horario("23:35"));
        return lst;
    }

    public List<horario> segSexO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("04:50"));
        lst.add(new horario("05:30"));
        lst.add(new horario("05:50","Atendimento Bairro dos Morros."));
        lst.add(new horario("06:30"));
        lst.add(new horario("07:00"));
        lst.add(new horario("07:35"));
        lst.add(new horario("08:10"));
        lst.add(new horario("08:45"));
        lst.add(new horario("09:20"));
        lst.add(new horario("09:55"));
        lst.add(new horario("10:30"));
        lst.add(new horario("11:05"));
        lst.add(new horario("11:40"));
        lst.add(new horario("12:15"));
        lst.add(new horario("12:50"));
        lst.add(new horario("13:25"));
        lst.add(new horario("14:00"));
        lst.add(new horario("14:35"));
        lst.add(new horario("15:10"));
        lst.add(new horario("15:45"));
        lst.add(new horario("16:20"));
        lst.add(new horario("16:55"));
        lst.add(new horario("17:30"));
        lst.add(new horario("18:05"));
        lst.add(new horario("18:40"));
        lst.add(new horario("19:15"));
        lst.add(new horario("19:50"));
        lst.add(new horario("20:25"));
        lst.add(new horario("21:00"));
        lst.add(new horario("22:00"));
        lst.add(new horario("23:00"));
        return lst;
    }

    public List<horario> sabadoI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:15","Atendimento Bairro dos Morros."));
        lst.add(new horario("06:00"));
        lst.add(new horario("06:30"));
        lst.add(new horario("07:00"));
        lst.add(new horario("07:35"));
        lst.add(new horario("08:10"));
        lst.add(new horario("08:50"));
        lst.add(new horario("09:20"));
        lst.add(new horario("09:55"));
        lst.add(new horario("10:35"));
        lst.add(new horario("11:05"));
        lst.add(new horario("11:40"));
        lst.add(new horario("12:15"));
        lst.add(new horario("12:50"));
        lst.add(new horario("13:25"));
        lst.add(new horario("14:00"));
        lst.add(new horario("14:40"));
        lst.add(new horario("15:45"));
        lst.add(new horario("16:55"));
        lst.add(new horario("18:05"));
        lst.add(new horario("19:15"));
        lst.add(new horario("20:30"));
        lst.add(new horario("21:30"));
        lst.add(new horario("22:35"));
        lst.add(new horario("23:35"));
        return lst;
    }

    public List<horario> sabadoO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("04:50"));
        lst.add(new horario("05:30"));
        lst.add(new horario("05:50","Atendimento Bairro dos Morros."));
        lst.add(new horario("06:30"));
        lst.add(new horario("07:00"));
        lst.add(new horario("07:35"));
        lst.add(new horario("08:10"));
        lst.add(new horario("08:45"));
        lst.add(new horario("09:20"));
        lst.add(new horario("09:55"));
        lst.add(new horario("10:30"));
        lst.add(new horario("11:05"));
        lst.add(new horario("11:40"));
        lst.add(new horario("12:15"));
        lst.add(new horario("12:50"));
        lst.add(new horario("13:25"));
        lst.add(new horario("14:00"));
        lst.add(new horario("15:10"));
        lst.add(new horario("16:20"));
        lst.add(new horario("17:30"));
        lst.add(new horario("18:40"));
        lst.add(new horario("19:50"));
        lst.add(new horario("21:00"));
        lst.add(new horario("22:00"));
        lst.add(new horario("23:00"));
        return lst;
    }

    public List<horario> domingoI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:15"));
        lst.add(new horario("06:30"));
        lst.add(new horario("07:35"));
        lst.add(new horario("08:50"));
        lst.add(new horario("09:55"));
        lst.add(new horario("11:05"));
        lst.add(new horario("12:15"));
        lst.add(new horario("13:25"));
        lst.add(new horario("14:40"));
        lst.add(new horario("15:45"));
        lst.add(new horario("16:55"));
        lst.add(new horario("18:05"));
        lst.add(new horario("19:15"));
        lst.add(new horario("20:30"));
        lst.add(new horario("21:30"));
        lst.add(new horario("22:30"));
        lst.add(new horario("23:45"));
        return lst;
    }

    public List<horario> domingoO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("06:00"));
        lst.add(new horario("07:00"));
        lst.add(new horario("08:10"));
        lst.add(new horario("09:20"));
        lst.add(new horario("10:30"));
        lst.add(new horario("11:40"));
        lst.add(new horario("12:50"));
        lst.add(new horario("14:00"));
        lst.add(new horario("15:10"));
        lst.add(new horario("16:20"));
        lst.add(new horario("17:30"));
        lst.add(new horario("18:40"));
        lst.add(new horario("19:50"));
        lst.add(new horario("21:00"));
        lst.add(new horario("22:00"));
        lst.add(new horario("23:00"));
        return lst;
    }
}
