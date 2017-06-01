package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 27/01/2016.
 */
public class IguatemiRodo {
    public String[] diasemanda = {"SEG/SEX"};
    public String vigencia = "  06/05/2015";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("06:45"));
        lst.add(new horario("07:35"));
        lst.add(new horario("17:10"));
        lst.add(new horario("18:10"));
        return lst;
    }
}

