package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 15/02/2016.
 */
public class Taniana1 {
    public String[] diasemanda = {"SEG/SAB","SÁBADO"};
    public String vigencia = "10/04/2017";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("04:50"));
        lst.add(new horario("05:45"));
        lst.add(new horario("06:55"));
        lst.add(new horario("08:19"));
        lst.add(new horario("09:39"));
        lst.add(new horario("10:59"));
        lst.add(new horario("12:19"));
        lst.add(new horario("13:39"));
        lst.add(new horario("14:59"));
        lst.add(new horario("16:23"));
        lst.add(new horario("17:47"));
        lst.add(new horario("19:11"));
        lst.add(new horario("22:00","Vai até o shopping Iguatemi/Carrefour"));
        return lst;
    }

    public List<horario> segSexO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("05:10"));
        lst.add(new horario("06:10"));
        lst.add(new horario("07:20"));
        lst.add(new horario("08:49"));
        lst.add(new horario("10:09"));
        lst.add(new horario("11:29"));
        lst.add(new horario("12:49"));
        lst.add(new horario("14:09"));
        lst.add(new horario("15:29"));
        lst.add(new horario("16:53"));
        lst.add(new horario("18:17"));
        lst.add(new horario("19:41"));
        return lst;
    }
    public List<horario> sabI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("04:50"));
        lst.add(new horario("05:45"));
        lst.add(new horario("07:05"));
        lst.add(new horario("08:25"));
        lst.add(new horario("09:45"));
        lst.add(new horario("11:05"));
        lst.add(new horario("12:25"));
        lst.add(new horario("13:45"));
        lst.add(new horario("15:05"));
        lst.add(new horario("22:00","Vai até o shopping Iguatemi/Carrefour"));
        return lst;
    }
    public List<horario> sabO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("05:10"));
        lst.add(new horario("06:10"));
        lst.add(new horario("07:35"));
        lst.add(new horario("08:55"));
        lst.add(new horario("10:15"));
        lst.add(new horario("11:35"));
        lst.add(new horario("12:55"));
        lst.add(new horario("14:15"));
        lst.add(new horario("15:35"));
        return lst;
    }
}
