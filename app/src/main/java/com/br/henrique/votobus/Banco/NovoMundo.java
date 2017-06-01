package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 13/02/2016.
 */
public class NovoMundo {
    public String[] diasemanda = {"SEG/SEX", "SABADO/DOMINGO","EXTRA SEG/SEX"};
    public String vigencia = "10/04/2017";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:15"));
        lst.add(new horario("06:00"));
        lst.add(new horario("06:25"));
        lst.add(new horario("07:40"));
        lst.add(new horario("09:01"));
        lst.add(new horario("10:19"));
        lst.add(new horario("11:39"));
        lst.add(new horario("12:59"));
        lst.add(new horario("13:25"));
        lst.add(new horario("14:19"));
        lst.add(new horario("15:41"));
        lst.add(new horario("17:05"));
        lst.add(new horario("18:34"));
        lst.add(new horario("19:53"));
        lst.add(new horario("21:04"));
        lst.add(new horario("22:20","Atende primeiro o Jd Tatiana, chega na escola 22:55/23:00 aguarda a saida dos alunos, e em seguida segue para o Jd. Novo Mundo, retornando ao itinerario normal via Pq. Bela Vista."));
        return lst;
    }

    public List<horario> segSexO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("04:40"));
        lst.add(new horario("05:43"));
        lst.add(new horario("06:30"));
        lst.add(new horario("06:57"));
        lst.add(new horario("08:17"));
        lst.add(new horario("09:35"));
        lst.add(new horario("10:55"));
        lst.add(new horario("12:15"));
        lst.add(new horario("13:35"));
        lst.add(new horario("13:55"));
        lst.add(new horario("14:55"));
        lst.add(new horario("16:18"));
        lst.add(new horario("17:43"));
        lst.add(new horario("19:08"));
        lst.add(new horario("20:18"));
        lst.add(new horario("21:31"));
        lst.add(new horario("23:00","Atende primeiro o Jd Tatiana, chega na escola 22:55/23:00 aguarda a saida dos alunos, e em seguida segue para o Jd. Novo Mundo, retornando ao itinerario normal via Pq. Bela Vista."));
        return lst;
    }
    public List<horario> sabDomI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:15"));
        lst.add(new horario("06:25"));
        lst.add(new horario("07:45"));
        lst.add(new horario("09:05"));
        lst.add(new horario("10:25"));
        lst.add(new horario("11:45"));
        lst.add(new horario("13:05"));
        lst.add(new horario("14:25"));
        lst.add(new horario("15:45"));
        lst.add(new horario("17:05"));
        lst.add(new horario("18:25"));
        lst.add(new horario("19:45"));
        lst.add(new horario("21:05"));
        lst.add(new horario("22:25"));
        return lst;
    }

    public List<horario> sabDomO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("04:40"));
        lst.add(new horario("05:40"));
        lst.add(new horario("06:55"));
        lst.add(new horario("08:15"));
        lst.add(new horario("09:35"));
        lst.add(new horario("10:55"));
        lst.add(new horario("12:15"));
        lst.add(new horario("13:35"));
        lst.add(new horario("14:55"));
        lst.add(new horario("16:15"));
        lst.add(new horario("17:35"));
        lst.add(new horario("18:55"));
        lst.add(new horario("20:15"));
        lst.add(new horario("21:35"));
        lst.add(new horario("22:55"));
        return lst;
    }
    public List<horario> extraSegSexI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("06:00"));
        lst.add(new horario("13:25"));
        return lst;
    }

    public List<horario> extraSegSexO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("06:30"));
        lst.add(new horario("13:55"));
        return lst;
    }

}
