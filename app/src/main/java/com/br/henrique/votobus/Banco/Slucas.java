package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 06/02/2016.
 */
public class Slucas {
    public String[] diasemanda = {"SEG/DOMINGO", "EXTRA SEG/SEX", "EXTRA SEG/SABADO", "EXTRA SABADO"};
    public String vigencia = "13/05/2016";

    public List<horario> segDomI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("SÃO LUCAS"));
        lst.add(new horario("05:20"));
        lst.add(new horario("06:40"));
        lst.add(new horario("08:00"));
        lst.add(new horario("09:15"));
        lst.add(new horario("10:35"));
        lst.add(new horario("11:50"));
        lst.add(new horario("13:05"));
        lst.add(new horario("14:20"));
        lst.add(new horario("15:35"));
        lst.add(new horario("16:50"));
        lst.add(new horario("18:10"));
        lst.add(new horario("19:20"));
        lst.add(new horario("20:35"));
        lst.add(new horario("21:50"));
        lst.add(new horario("23:00"));
        return lst;
    }

    public List<horario> segDomO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("CARREFOUR"));
        lst.add(new horario("05:55"));
        lst.add(new horario("07:15"));
        lst.add(new horario("08:35"));
        lst.add(new horario("09:55"));
        lst.add(new horario("11:10"));
        lst.add(new horario("12:25"));
        lst.add(new horario("13:40"));
        lst.add(new horario("14:55"));
        lst.add(new horario("16:10"));
        lst.add(new horario("17:30"));
        lst.add(new horario("18:45"));
        lst.add(new horario("19:55"));
        lst.add(new horario("21:10"));
        lst.add(new horario("22:30"));
        lst.add(new horario("23:35"));
        return lst;
    }

    public List<horario> extraSegSexI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("SÃO LUCAS"));
        lst.add(new horario("05:50"));
        lst.add(new horario("06:50"));
        return lst;
    }

    public List<horario> extraSegSexO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("CARREFOUR"));
        lst.add(new horario("15:50"));
        lst.add(new horario("17:10"));
        return lst;
    }

    public List<horario> extraSegSabI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("SÃO LUCAS"));
        lst.add(new horario("12:55"));
        return lst;
    }

    public List<horario> extraSegSabO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("CARREFOUR"));
        lst.add(new horario("22:20"));
        lst.add(new horario("23:05"));
        return lst;
    }

    public List<horario> extraSabI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("SÃO LUCAS"));
        lst.add(new horario("06:00"));
        return lst;
    }

    public List<horario> extraSabO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("CARREFOUR"));
        return lst;
    }
}
