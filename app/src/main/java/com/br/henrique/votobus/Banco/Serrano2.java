package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 10/02/2016.
 */
public class Serrano2 {
    public String[] diasemanda = {"SEG/SEX", "SABADO", "DOMINGO"};
    public String vigencia = "27/08/2016";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:15"));
        lst.add(new horario("05:35"));
        lst.add(new horario("06:00"));
        lst.add(new horario("06:30"));
        lst.add(new horario("07:00"));
        lst.add(new horario("07:30"));
        lst.add(new horario("08:00"));
        lst.add(new horario("08:30"));
        lst.add(new horario("09:00"));
        lst.add(new horario("09:30"));
        lst.add(new horario("10:00"));
        lst.add(new horario("10:30"));
        lst.add(new horario("11:00"));
        lst.add(new horario("11:30"));
        lst.add(new horario("12:00"));
        lst.add(new horario("12:30"));
        lst.add(new horario("13:00"));
        lst.add(new horario("13:30"));
        lst.add(new horario("14:00"));
        lst.add(new horario("14:30"));
        lst.add(new horario("15:00"));
        lst.add(new horario("15:30"));
        lst.add(new horario("16:00"));
        lst.add(new horario("16:30"));
        lst.add(new horario("17:00"));
        lst.add(new horario("17:30"));
        lst.add(new horario("18:00"));
        lst.add(new horario("18:30"));
        lst.add(new horario("19:30"));
        lst.add(new horario("20:30"));
        lst.add(new horario("21:30"));
        lst.add(new horario("22:30","Atendimento ao bairro Votocel"));
        lst.add(new horario("23:30"));
        return lst;
    }

    public List<horario> segSexO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("04:05","Atendimento Alpina"));
        lst.add(new horario("04:50"));
        lst.add(new horario("05:10"));
        lst.add(new horario("05:35"));
        lst.add(new horario("06:00"));
        lst.add(new horario("06:30"));
        lst.add(new horario("07:00"));
        lst.add(new horario("07:30"));
        lst.add(new horario("08:00"));
        lst.add(new horario("08:30"));
        lst.add(new horario("09:00"));
        lst.add(new horario("09:30"));
        lst.add(new horario("10:00"));
        lst.add(new horario("10:30"));
        lst.add(new horario("11:00"));
        lst.add(new horario("11:30","Atendimento a ETEC (Votocel) no periodo escolar Seg a Sex"));
        lst.add(new horario("12:00"));
        lst.add(new horario("12:30"));
        lst.add(new horario("13:00"));
        lst.add(new horario("13:30"));
        lst.add(new horario("14:00"));
        lst.add(new horario("14:30","Atendimento a ETEC (Votocel) no periodo escolar Seg a Sex"));
        lst.add(new horario("15:00"));
        lst.add(new horario("15:30"));
        lst.add(new horario("16:00"));
        lst.add(new horario("16:30"));
        lst.add(new horario("17:00"));
        lst.add(new horario("17:30"));
        lst.add(new horario("18:00"));
        lst.add(new horario("19:00"));
        lst.add(new horario("20:00"));
        lst.add(new horario("21:00"));
        lst.add(new horario("22:00"));
        lst.add(new horario("23:00"));
        return lst;
    }

    public List<horario> sabadoI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:15"));
        lst.add(new horario("05:35"));
        lst.add(new horario("06:00"));
        lst.add(new horario("06:30"));
        lst.add(new horario("07:00"));
        lst.add(new horario("07:30"));
        lst.add(new horario("08:00"));
        lst.add(new horario("08:30"));
        lst.add(new horario("09:00"));
        lst.add(new horario("09:30"));
        lst.add(new horario("10:00"));
        lst.add(new horario("10:30"));
        lst.add(new horario("11:00"));
        lst.add(new horario("11:30"));
        lst.add(new horario("12:00"));
        lst.add(new horario("12:30"));
        lst.add(new horario("13:00"));
        lst.add(new horario("13:30"));
        lst.add(new horario("14:00"));
        lst.add(new horario("14:30"));
        lst.add(new horario("15:30"));
        lst.add(new horario("16:30"));
        lst.add(new horario("17:30"));
        lst.add(new horario("18:30"));
        lst.add(new horario("19:30"));
        lst.add(new horario("20:30"));
        lst.add(new horario("21:30"));
        lst.add(new horario("22:30"));
        lst.add(new horario("23:30"));
        return lst;
    }

    public List<horario> sabadoO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("04:05","Atendimento Alpina"));
        lst.add(new horario("04:50"));
        lst.add(new horario("05:10"));
        lst.add(new horario("05:35"));
        lst.add(new horario("06:00"));
        lst.add(new horario("06:30"));
        lst.add(new horario("07:00"));
        lst.add(new horario("07:30"));
        lst.add(new horario("08:00"));
        lst.add(new horario("08:30"));
        lst.add(new horario("09:00"));
        lst.add(new horario("09:30"));
        lst.add(new horario("10:00"));
        lst.add(new horario("10:30"));
        lst.add(new horario("11:00"));
        lst.add(new horario("11:30"));
        lst.add(new horario("12:00"));
        lst.add(new horario("12:30"));
        lst.add(new horario("13:00"));
        lst.add(new horario("13:30"));
        lst.add(new horario("14:00"));
        lst.add(new horario("15:00"));
        lst.add(new horario("16:00"));
        lst.add(new horario("17:00"));
        lst.add(new horario("18:00"));
        lst.add(new horario("19:00"));
        lst.add(new horario("20:00"));
        lst.add(new horario("21:00"));
        lst.add(new horario("22:00"));
        lst.add(new horario("23:00"));
        return lst;
    }

    public List<horario> domingoI() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:30"));
        lst.add(new horario("06:30"));
        lst.add(new horario("07:30"));
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
        lst.add(new horario("20:30"));
        lst.add(new horario("21:30"));
        lst.add(new horario("22:30"));
        lst.add(new horario("23:30"));
        return lst;
    }

    public List<horario> domingoO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("04:05","Atendimento Alpina"));
        lst.add(new horario("05:00"));
        lst.add(new horario("06:00"));
        lst.add(new horario("07:00"));
        lst.add(new horario("08:00","Atendimento ao Parque São João (Domingos e Feriados)"));
        lst.add(new horario("09:00","Atendimento ao Parque São João (Domingos e Feriados)"));
        lst.add(new horario("10:00","Atendimento ao Parque São João (Domingos e Feriados)"));
        lst.add(new horario("11:00","Atendimento ao Parque São João (Domingos e Feriados)"));
        lst.add(new horario("12:00","Atendimento ao Parque São João (Domingos e Feriados)"));
        lst.add(new horario("13:00","Atendimento ao Parque São João (Domingos e Feriados)"));
        lst.add(new horario("14:00"));
        lst.add(new horario("15:00"));
        lst.add(new horario("16:00"));
        lst.add(new horario("17:00"));
        lst.add(new horario("18:00"));
        lst.add(new horario("19:00"));
        lst.add(new horario("20:00"));
        lst.add(new horario("21:00"));
        lst.add(new horario("22:00"));
        lst.add(new horario("23:00"));
        return lst;
    }
}
