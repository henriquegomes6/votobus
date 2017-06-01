package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 15/02/2016.
 */
public class SaoJoao {
    public String[] diasemanda = {"SEG/SAB"};
    public String vigencia = "29/08/2016";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:00"));
        lst.add(new horario("05:40"));
        lst.add(new horario("06:20"));
        lst.add(new horario("07:00"));
        lst.add(new horario("07:40"));
        lst.add(new horario("08:30"));
        lst.add(new horario("09:30"));
        lst.add(new horario("10:30"));
        lst.add(new horario("11:30"));
        lst.add(new horario("12:30"));
        lst.add(new horario("13:30"));
        lst.add(new horario("14:30"));
        lst.add(new horario("15:30"));
        lst.add(new horario("16:30"));
        lst.add(new horario("17:30"));
        lst.add(new horario("18:30"));
        lst.add(new horario("19:30"));
        lst.add(new horario("20:20"));
        lst.add(new horario("21:00","Atendimento ao bairro Votocel"));
        lst.add(new horario("21:40"));
        lst.add(new horario("22:20"));
        lst.add(new horario("23:10","Atendimento ao bairro Votocel"));
        lst.add(new horario("23:50"));
        return lst;
    }

    public List<horario> segSexO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("04:35"));
        lst.add(new horario("05:15"));
        lst.add(new horario("05:55"));
        lst.add(new horario("06:35"));
        lst.add(new horario("07:15"));
        lst.add(new horario("08:00"));
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
        lst.add(new horario("20:35"));
        lst.add(new horario("21:15"));
        lst.add(new horario("21:55"));
        lst.add(new horario("22:35"," Atendimento escola ETEC seg à sexta (período escolar)"));
        lst.add(new horario("23:25"));
        return lst;
    }


}
