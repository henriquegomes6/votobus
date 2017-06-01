package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 14/02/2016.
 */
public class Green {
    public String[] diasemanda = {"SEG/SAB"};
    public String vigencia = "22/01/2014";

    public List<horario> segSabI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("06:00","Não entra no Jardim Tatiana."));
        lst.add(new horario("07:05"));
        lst.add(new horario("08:25"));
        lst.add(new horario("09:45"));
        lst.add(new horario("11:05"));
        lst.add(new horario("12:35"));
        lst.add(new horario("13:55"));
        lst.add(new horario("15:15"));
        lst.add(new horario("16:25"));
        lst.add(new horario("17:35"));
        return lst;
    }
    public List<horario> segSabO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("06:25"));
        lst.add(new horario("07:45"));
        lst.add(new horario("09:05"));
        lst.add(new horario("10:25"));
        lst.add(new horario("11:45"));
        lst.add(new horario("13:15"));
        lst.add(new horario("14:35"));
        lst.add(new horario("15:50"));
        lst.add(new horario("17:00"));
        lst.add(new horario("18:15"));
        return lst;
    }
}
