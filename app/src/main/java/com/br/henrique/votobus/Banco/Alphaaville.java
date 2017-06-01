package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 15/02/2016.
 */
public class Alphaaville {
    public String[] diasemanda = {"SEG/SEX"};
    public String vigencia = "22/01/2016";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("06:35"));
        lst.add(new horario("07:25"));

        return lst;
    }

    public List<horario> segSexO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("07:05"));
        lst.add(new horario("07:55"));
        lst.add(new horario("16:25"));
        lst.add(new horario("17:10"));
        return lst;
    }
}
