package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henrique on 27/01/2016.
 */
public class IguatemiRodo2 {
    public String[] diasemanda = {"SEG/SEX"};
    public String vigencia = "  06/05/2015";

    public List<horario> segSexI() {
        List<horario> lst = new ArrayList<horario>();
        lst.add(new horario("AV. ADOLPHO MASSAGLIA"));
        lst.add(new horario("04:35"));
        lst.add(new horario("05:35"));
        lst.add(new horario("15:00"));
        lst.add(new horario("16:00"));
        return lst;
    }
}
