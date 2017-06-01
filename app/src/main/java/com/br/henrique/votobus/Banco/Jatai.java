package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 15/02/2016.
 */
public class Jatai {
    public String[] diasemanda = {"SEG/SAB", "DOMINGO"};
    public String vigencia = "13/05/2016";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:20"));
        lst.add(new horario("06:00"));
        lst.add(new horario("06:40","Atendimento ETEC Votocel periodo escolar."));
        lst.add(new horario("07:20"));
        lst.add(new horario("08:00"));
        lst.add(new horario("08:40"));
        lst.add(new horario("09:20"));
        lst.add(new horario("10:00"));
        lst.add(new horario("10:40"));
        lst.add(new horario("11:20"));
        lst.add(new horario("12:00"));
        lst.add(new horario("12:40"));
        lst.add(new horario("13:20"));
        lst.add(new horario("14:00"));
        lst.add(new horario("14:40"));
        lst.add(new horario("15:20"));
        lst.add(new horario("16:00"));
        lst.add(new horario("16:40"));
        lst.add(new horario("17:20"));
        lst.add(new horario("18:00"));
        lst.add(new horario("18:40"));
        lst.add(new horario("19:20"));
        lst.add(new horario("20:00"));
        lst.add(new horario("20:40"));
        lst.add(new horario("22:18","Ao chegar no ponto final, vai vazio para o Carrefour realizar viagem até o bairro S. Lucas. Retorna Vazio até o Terminal."));
        lst.add(new horario("00:05","Passa pelo Votocel."));
        return lst;
    }

    public List<horario> segSexO() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("04:40"));
        lst.add(new horario("05:20"));
        lst.add(new horario("06:00","Passa pelo JD. Europa."));
        lst.add(new horario("06:40"));
        lst.add(new horario("07:20","Passa pelo JD. Europa."));
        lst.add(new horario("08:00","Passa pelo JD. Europa."));
        lst.add(new horario("08:40"));
        lst.add(new horario("09:20"));
        lst.add(new horario("10:00"));
        lst.add(new horario("10:40"));
        lst.add(new horario("11:20"));
        lst.add(new horario("12:00","Passa pelo JD. Europa."));
        lst.add(new horario("12:40"));
        lst.add(new horario("13:20"));
        lst.add(new horario("14:00"));
        lst.add(new horario("14:40"));
        lst.add(new horario("15:20"));
        lst.add(new horario("16:00"));
        lst.add(new horario("16:40"));
        lst.add(new horario("17:20","Passa pelo JD. Europa."));
        lst.add(new horario("18:00","Passa pelo JD. Europa."));
        lst.add(new horario("18:40","Passa pelo JD. Europa."));
        lst.add(new horario("19:20"));
        lst.add(new horario("20:00"));
        lst.add(new horario("21:20"));
        return lst;
    }

    public List<horario> sabadoI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("TERMINAL"));
        lst.add(new horario("05:45"));
        lst.add(new horario("06:45"));
        lst.add(new horario("07:50"));
        lst.add(new horario("09:05"));
        lst.add(new horario("10:10"));
        lst.add(new horario("11:20"));
        lst.add(new horario("12:30"));
        lst.add(new horario("13:40"));
        lst.add(new horario("14:55"));
        lst.add(new horario("16:00"));
        lst.add(new horario("17:10"));
        lst.add(new horario("18:20"));
        lst.add(new horario("19:35"));
        lst.add(new horario("20:50","Passa pelo Votocel."));
        lst.add(new horario("22:05","Passa pelo Votocel."));
        lst.add(new horario("23:15","Passa pelo Votocel."));
        lst.add(new horario("00:05","Passa pelo Votocel."));
        return lst;
    }

    public List<horario> sabadoO() {
        List<horario> lst = new ArrayList<>();
        lst.add(new horario("BAIRRO"));
        lst.add(new horario("05:15","Passa pelo Votocel."));
        lst.add(new horario("06:15"));
        lst.add(new horario("07:15"));
        lst.add(new horario("08:25"));
        lst.add(new horario("09:35"));
        lst.add(new horario("10:45"));
        lst.add(new horario("11:55"));
        lst.add(new horario("13:05"));
        lst.add(new horario("14:15"));
        lst.add(new horario("15:25"));
        lst.add(new horario("16:35"));
        lst.add(new horario("17:45"));
        lst.add(new horario("18:55"));
        lst.add(new horario("20:10"));
        lst.add(new horario("21:25","Passa pelo Votocel."));
        lst.add(new horario("22:40","Passa pelo Votocel."));
        return lst;
    }
}
