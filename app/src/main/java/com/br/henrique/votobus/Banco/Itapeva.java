package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 02/02/2016.
 */
public class Itapeva {
    public String[] diasemanda = {"SEG/SEX", "SABADO", "DOMINGO", "EXTRA SEG/SEX"};
    public String vigencia = "04/02/2016";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:00"));
        lst.add(new horario("05:40"));
        lst.add(new horario("06:20"));
        lst.add(new horario("07:00"));
        lst.add(new horario("07:40"));
        lst.add(new horario("08:20"));
        lst.add(new horario("09:00"));
        lst.add(new horario("09:40"));
        lst.add(new horario("10:20"));
        lst.add(new horario("11:00"));
        lst.add(new horario("11:40"));
        lst.add(new horario("12:20"));
        lst.add(new horario("13:00"));
        lst.add(new horario("13:40"));
        lst.add(new horario("14:20"));
        lst.add(new horario("15:00"));
        lst.add(new horario("15:40"));
        lst.add(new horario("16:20"));
        lst.add(new horario("17:00", "Não passa no Votocel"));
        lst.add(new horario("17:40", "Não passa no Votocel"));
        lst.add(new horario("18:20", "Não passa no Votocel"));
        lst.add(new horario("19:00", "Não passa no Votocel"));
        lst.add(new horario("19:40"));
        lst.add(new horario("20:20"));
        lst.add(new horario("21:30", "Passa pelo Jd. Europa"));
        lst.add(new horario("22:40", "Passa pelo Jd. Europa"));
        lst.add(new horario("23:45", "Passa pelo Jd. Europa"));
        return lst;
    }

    public List<horario> segSexO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("04:13", "Passa pelo Jardim Europa, Votocel e vai até Fiação Alpina."));
        lst.add(new horario("05:00", "Passa pelo Jd. Europa"));
        lst.add(new horario("05:40", "Passa pelo Jd. Europa"));
        lst.add(new horario("06:20"));
        lst.add(new horario("07:00", "Passa pelo Jd. Europa e não passa pelo Votocel"));
        lst.add(new horario("07:40", "Passa pelo Jd. Europa"));
        lst.add(new horario("08:20", "Passa pelo Jd. Europa"));
        lst.add(new horario("09:00"));
        lst.add(new horario("09:40"));
        lst.add(new horario("10:20", "Passa pelo Jd. Europa"));
        lst.add(new horario("11:00"));
        lst.add(new horario("11:40", "Passa pelo Jd. Europa"));
        lst.add(new horario("12:20", "Passa pelo Jd. Europa"));
        lst.add(new horario("13:00", "Passa pelo Jd. Europa"));
        lst.add(new horario("13:40"));
        lst.add(new horario("14:20"));
        lst.add(new horario("15:00"));
        lst.add(new horario("15:40"));
        lst.add(new horario("16:20", "Passa pelo Jd. Europa"));
        lst.add(new horario("17:00", "Passa pelo Jd. Europa"));
        lst.add(new horario("17:40", "Passa pelo Jd. Europa"));
        lst.add(new horario("18:20", "Passa pelo Jd. Europa"));
        lst.add(new horario("19:00"));
        lst.add(new horario("19:40"));
        lst.add(new horario("20:55", "Passa pelo Jd. Europa"));
        lst.add(new horario("22:05"));
        lst.add(new horario("23:15"));
        return lst;
    }

    public List<horario> sabadoI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:00"));
        lst.add(new horario("05:40"));
        lst.add(new horario("06:20"));
        lst.add(new horario("07:00"));
        lst.add(new horario("07:40"));
        lst.add(new horario("08:20"));
        lst.add(new horario("09:00"));
        lst.add(new horario("09:40"));
        lst.add(new horario("10:20"));
        lst.add(new horario("11:00"));
        lst.add(new horario("11:40"));
        lst.add(new horario("12:20"));
        lst.add(new horario("13:00"));
        lst.add(new horario("13:40"));
        lst.add(new horario("14:20"));
        lst.add(new horario("15:00"));
        lst.add(new horario("15:40"));
        lst.add(new horario("16:20"));
        lst.add(new horario("17:00"));
        lst.add(new horario("17:40"));
        lst.add(new horario("18:20"));
        lst.add(new horario("19:00"));
        lst.add(new horario("19:40"));
        lst.add(new horario("20:20"));
        lst.add(new horario("21:30", "Passa pelo Jd. Europa"));
        lst.add(new horario("22:40", "Passa pelo Jd. Europa"));
        lst.add(new horario("23:45", "Passa pelo Jd. Europa"));
        return lst;
    }

    public List<horario> sabadoO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("04:13", "Passa pelo Jardim Europa, Votocel e vai até Fiação Alpina."));
        lst.add(new horario("05:00", "Passa pelo Jd. Europa"));
        lst.add(new horario("05:40", "Passa pelo Jd. Europa"));
        lst.add(new horario("06:20"));
        lst.add(new horario("07:00", "Passa pelo Jd. Europa e não passa pelo Votocel"));
        lst.add(new horario("07:40", "Passa pelo Jd. Europa"));
        lst.add(new horario("08:20", "Passa pelo Jd. Europa"));
        lst.add(new horario("09:00"));
        lst.add(new horario("09:40"));
        lst.add(new horario("10:20", "Passa pelo Jd. Europa"));
        lst.add(new horario("11:00"));
        lst.add(new horario("11:40", "Passa pelo Jd. Europa"));
        lst.add(new horario("12:20", "Passa pelo Jd. Europa"));
        lst.add(new horario("13:00", "Passa pelo Jd. Europa"));
        lst.add(new horario("13:40"));
        lst.add(new horario("14:20"));
        lst.add(new horario("15:00"));
        lst.add(new horario("15:40"));
        lst.add(new horario("16:20", "Passa pelo Jd. Europa"));
        lst.add(new horario("17:00", "Passa pelo Jd. Europa"));
        lst.add(new horario("17:40", "Passa pelo Jd. Europa"));
        lst.add(new horario("18:20", "Passa pelo Jd. Europa"));
        lst.add(new horario("19:00"));
        lst.add(new horario("19:40"));
        lst.add(new horario("20:55", "Passa pelo Jd. Europa"));
        lst.add(new horario("22:05"));
        lst.add(new horario("23:15"));
        return lst;
    }

    public List<horario> domingoI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:15"));
        lst.add(new horario("06:15"));
        lst.add(new horario("07:15"));
        lst.add(new horario("08:30"));
        lst.add(new horario("09:35"));
        lst.add(new horario("10:45"));
        lst.add(new horario("11:55"));
        lst.add(new horario("13:05"));
        lst.add(new horario("14:15"));
        lst.add(new horario("15:30"));
        lst.add(new horario("16:35"));
        lst.add(new horario("17:45"));
        lst.add(new horario("19:00"));
        lst.add(new horario("20:15"));
        return lst;
    }

    public List<horario> domingoO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("04:13", "Passa pelo Jardim Europa, Votocel e vai até Fiação Alpina."));
        lst.add(new horario("05:45"));
        lst.add(new horario("06:45"));
        lst.add(new horario("07:50"));
        lst.add(new horario("09:00"));
        lst.add(new horario("10:10"));
        lst.add(new horario("11:20"));
        lst.add(new horario("12:30"));
        lst.add(new horario("13:40"));
        lst.add(new horario("14:50"));
        lst.add(new horario("16:00"));
        lst.add(new horario("17:10"));
        lst.add(new horario("18:20", "Passa pelo Jd. Europa"));
        lst.add(new horario("19:40"));
        lst.add(new horario("20:40"));
        return lst;
    }

    public List<horario> extraO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("05:45"));
        return lst;
    }

    public List<horario> extraI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        return lst;
    }
}
