package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 20/06/2016.
 */
public class Morros {
    public String[] diasemanda = {"SEG/SEX","SABADO"};
    public String vigencia = "10/04/2017";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:15","Atendimento ao Bairro Morros sem passar no Vale do Sol "));
        lst.add(new horario("11:25"));
        lst.add(new horario("16:50"));
        lst.add(new horario("18:10"));
        lst.add(new horario("23:35", "Atendimento ao Bairro Morros pela linha Vila Nova/Promorar"));
        return lst;
    }

    public List<horario> segSexO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("05:50","Atendimento ao Bairro Morros sem passar no Vale do Sol"));
        lst.add(new horario("06:20"));
        lst.add(new horario("07:05"));
        lst.add(new horario("12:05"));
        lst.add(new horario("17:30"));
        lst.add(new horario("18:50"));
        return lst;
    }
    public List<horario> sabadoI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:15","Atendimento ao Bairro Morros sem passar no Vale do Sol"));
        lst.add(new horario("12:00"));
        lst.add(new horario("17:30"));
        return lst;
    }

    public List<horario> sabadoO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("05:50","Atendimento ao Bairro Morros sem passar no Vale do Sol"));
        lst.add(new horario("07:05"));
        lst.add(new horario("12:40"));
        lst.add(new horario("18:00"));
        return lst;
    }
}
