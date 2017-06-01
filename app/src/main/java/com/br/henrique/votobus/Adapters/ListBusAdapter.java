package com.br.henrique.votobus.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.br.henrique.votobus.R;

import com.br.henrique.votobus.TO.BusNome;
import com.br.henrique.votobus.Banco.Alphaaville;
import com.br.henrique.votobus.Banco.Clarice;
import com.br.henrique.votobus.Banco.Fornazari;
import com.br.henrique.votobus.Banco.Fortaleza;
import com.br.henrique.votobus.Banco.Green;
import com.br.henrique.votobus.Banco.Helena;
import com.br.henrique.votobus.Banco.IguatemiRodo;
import com.br.henrique.votobus.Banco.IguatemiRodo2;
import com.br.henrique.votobus.Banco.Itapeva;
import com.br.henrique.votobus.Banco.Jatai;
import com.br.henrique.votobus.Banco.Kafara;
import com.br.henrique.votobus.Banco.Lageado;
import com.br.henrique.votobus.Banco.Morros;
import com.br.henrique.votobus.Banco.NovoMundo;
import com.br.henrique.votobus.Banco.Paraiso;
import com.br.henrique.votobus.Banco.Pinheiros;
import com.br.henrique.votobus.Banco.Primavera;
import com.br.henrique.votobus.Banco.RioAcimaGarcia;
import com.br.henrique.votobus.Banco.RioAcimaIrineu;
import com.br.henrique.votobus.Banco.SaoJoao;
import com.br.henrique.votobus.Banco.Serrano1;
import com.br.henrique.votobus.Banco.Serrano2;
import com.br.henrique.votobus.Banco.Slucas;
import com.br.henrique.votobus.Banco.Taniana1;
import com.br.henrique.votobus.Banco.VilaGarcia;
import com.br.henrique.votobus.Banco.VilaGarciaNova;
import com.br.henrique.votobus.Banco.VilaNovaDireto;
import com.br.henrique.votobus.Banco.VilaNovaIrineu;
import com.br.henrique.votobus.Banco.Votocel;
import com.br.henrique.votobus.tp3;


import java.io.Serializable;
import java.util.List;

/**
 * Created by Henrique on 12/01/2016.
 */
public class ListBusAdapter extends BaseAdapter {

    private Context cont;
    private List<BusNome> lst;
    public ListBusAdapter (Context c, List<BusNome> l){
        this.setLst(l);
        this.cont = c;
    }
    @Override
    public int getCount() {
        return getLst().size();
    }

    @Override
    public Object getItem(int position) {
        return getLst().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(cont);
        View v = (View) inflater.inflate(R.layout.buslist, parent, false);

        final TextView tvNome = (TextView) v.findViewById(R.id.TVnome);
        TextView tvIo = (TextView) v.findViewById(R.id.TVio);
        TextView tvNumero = (TextView) v.findViewById(R.id.TVnumero);
        final TextView tvId = (TextView) v.findViewById(R.id.TVid);
        BusNome bn = getLst().get(position);
        tvNome.setText(bn.getNome());
        tvIo.setText(bn.getIo());
        tvNumero.setText(bn.getNumero()+"");
        tvId.setText(bn.getCod()+"");

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position2 = Integer.valueOf(tvId.getText().toString()) - 1;
                //Toast.makeText(cont, position2+"", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(cont, tp3.class);
                if (position2 == 0) {
                    Lageado l = new Lageado();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("tab2I", (Serializable) l.sabadoI());
                    i.putExtra("tab2O", (Serializable) l.sabadoO());
                    i.putExtra("tab3I", (Serializable) l.domingoI());
                    i.putExtra("tab3O", (Serializable) l.domingoO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                    cont.startActivity(i);
                } else if (position2 == 1) {
                    RioAcimaIrineu l = new RioAcimaIrineu();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("tab2I", (Serializable) l.sabadoI());
                    i.putExtra("tab2O", (Serializable) l.sabadoO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 2) {
                    RioAcimaGarcia l = new RioAcimaGarcia();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("tab2I", (Serializable) l.sabadoI());
                    i.putExtra("tab2O", (Serializable) l.sabadoO());
                    i.putExtra("tab3I", (Serializable) l.domingoI());
                    i.putExtra("tab3O", (Serializable) l.domingoO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 3) {
                    VilaNovaDireto vln = new VilaNovaDireto();
                    i.putExtra("diasemanda", vln.diasemanda);
                    i.putExtra("tab1I", (Serializable) vln.segSabadoI());
                    i.putExtra("tab1O", (Serializable) vln.segSabadoO());
                    i.putExtra("tab2I", (Serializable) vln.domingoI());
                    i.putExtra("tab2O", (Serializable) vln.domingoO());
                    i.putExtra("tab3I", (Serializable) vln.exSegSexI());
                    i.putExtra("tab3O", (Serializable) vln.exSegSexO());
                    i.putExtra("vigencia", vln.vigencia);
                    i.putExtra("nome",tvNome.getText());
                    i.putExtra("tp", true);
                   cont.startActivity(i);
                } else if (position2 == 4) {
                    Pinheiros p = new Pinheiros();
                    i.putExtra("diasemanda", p.diasemanda);
                    i.putExtra("tab1I", (Serializable) p.segSexI());
                    i.putExtra("tab1O", (Serializable) p.segSexO());
                    i.putExtra("vigencia", p.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                    i.putExtra("tp", true);
                   cont.startActivity(i);
                } else if (position2 == 5) {
                    VilaGarciaNova vln = new VilaGarciaNova();
                    i.putExtra("diasemanda", vln.diasemanda);
                    i.putExtra("tab1I", (Serializable) vln.segSabadoI());
                    i.putExtra("tab1O", (Serializable) vln.segSabadoO());
                    i.putExtra("tab2I", (Serializable) vln.domingoI());
                    i.putExtra("tab2O", (Serializable) vln.domingoO());
                    i.putExtra("tab3I", (Serializable) vln.exSegSexI());
                    i.putExtra("tab3O", (Serializable) vln.exSegSexO());
                    i.putExtra("vigencia", vln.vigencia);
                    i.putExtra("nome",tvNome.getText());
                    i.putExtra("tp", true);
                   cont.startActivity(i);
                } else if (position2 == 6) {
                    IguatemiRodo igu = new IguatemiRodo();
                    i.putExtra("diasemanda", igu.diasemanda);
                    i.putExtra("tab1I", (Serializable) igu.segSexI());
                    i.putExtra("vigencia", igu.vigencia);
                    i.putExtra("tp", false);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);

                } else if (position2 == 7) {
                    IguatemiRodo2 igu = new IguatemiRodo2();
                    i.putExtra("diasemanda", igu.diasemanda);
                    i.putExtra("tab1I", (Serializable) igu.segSexI());
                    i.putExtra("vigencia", igu.vigencia);
                    i.putExtra("tp", false);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 8) {
                    Helena h = new Helena();
                    i.putExtra("diasemanda", h.diasemanda);
                    i.putExtra("tab1I", (Serializable) h.segSexI());
                    i.putExtra("tab1O", (Serializable) h.segSexO());
                    i.putExtra("vigencia", h.vigencia);
                    i.putExtra("nome",tvNome.getText());
                    i.putExtra("tp", true);
                   cont.startActivity(i);
                } else if (position2 == 9) {
                    Itapeva l = new Itapeva();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("tab2I", (Serializable) l.sabadoI());
                    i.putExtra("tab2O", (Serializable) l.sabadoO());
                    i.putExtra("tab3I", (Serializable) l.domingoI());
                    i.putExtra("tab3O", (Serializable) l.domingoO());
                    i.putExtra("tab4I", (Serializable) l.extraI());
                    i.putExtra("tab4O", (Serializable) l.extraO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 10) {
                    Slucas l = new Slucas();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segDomI());
                    i.putExtra("tab1O", (Serializable) l.segDomO());
                    i.putExtra("tab2I", (Serializable) l.extraSegSexI());
                    i.putExtra("tab2O", (Serializable) l.extraSegSexO());
                    i.putExtra("tab3I", (Serializable) l.extraSegSabI());
                    i.putExtra("tab3O", (Serializable) l.extraSegSabO());
                    i.putExtra("tab4I", (Serializable) l.extraSabI());
                    i.putExtra("tab4O", (Serializable) l.extraSegSabO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 11) {
                    //vossoroca
                    Serrano1 l = new Serrano1();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("tab2I", (Serializable) l.sabadoI());
                    i.putExtra("tab2O", (Serializable) l.sabadoO());
                    i.putExtra("tab3I", (Serializable) l.domingoI());
                    i.putExtra("tab3O", (Serializable) l.domingoO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 12) {
                    //gali
                    Serrano2 l = new Serrano2();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("tab2I", (Serializable) l.sabadoI());
                    i.putExtra("tab2O", (Serializable) l.sabadoO());
                    i.putExtra("tab3I", (Serializable) l.domingoI());
                    i.putExtra("tab3O", (Serializable) l.domingoO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 13) {
                    Paraiso l = new Paraiso();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSabI());
                    i.putExtra("tab1O", (Serializable) l.segSabO());
                    i.putExtra("tab2I", (Serializable) l.domingoI());
                    i.putExtra("tab2O", (Serializable) l.domingoO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 14) {
                    Clarice l = new Clarice();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSabI());
                    i.putExtra("tab1O", (Serializable) l.segSabO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 15) {
                    Primavera l = new Primavera();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("tab2I", (Serializable) l.sabI());
                    i.putExtra("tab2O", (Serializable) l.sabO());
                    i.putExtra("tab3I", (Serializable) l.domI());
                    i.putExtra("tab3O", (Serializable) l.domO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 16) {
                    NovoMundo l = new NovoMundo();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("tab2I", (Serializable) l.sabDomI());
                    i.putExtra("tab2O", (Serializable) l.sabDomO());
                    i.putExtra("tab3I", (Serializable) l.extraSegSexI());
                    i.putExtra("tab3O", (Serializable) l.extraSegSexO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 17) {
                    Green l = new Green();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSabI());
                    i.putExtra("tab1O", (Serializable) l.segSabO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 18) {
                    VilaNovaIrineu l = new VilaNovaIrineu();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("tab2I", (Serializable) l.sabadoI());
                    i.putExtra("tab2O", (Serializable) l.sabadoO());
                    i.putExtra("tab3I", (Serializable) l.domingoI());
                    i.putExtra("tab3O", (Serializable) l.domingoO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 20) {
                    VilaGarcia l = new VilaGarcia();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("tab2I", (Serializable) l.sabadoI());
                    i.putExtra("tab2O", (Serializable) l.sabadoO());
                    i.putExtra("tab3I", (Serializable) l.domingoI());
                    i.putExtra("tab3O", (Serializable) l.domingoO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 21) {
                    Kafara l = new Kafara();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("tab2I", (Serializable) l.sabadoI());
                    i.putExtra("tab2O", (Serializable) l.sabadoO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 22) {
                    Fornazari l = new Fornazari();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("tab2I", (Serializable) l.sabadoI());
                    i.putExtra("tab2O", (Serializable) l.sabadoO());
                    i.putExtra("tab3I", (Serializable) l.domingoI());
                    i.putExtra("tab3O", (Serializable) l.domingoO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 23) {
                    Jatai l = new Jatai();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("tab2I", (Serializable) l.sabadoI());
                    i.putExtra("tab2O", (Serializable) l.sabadoO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 24) {
                    SaoJoao l = new SaoJoao();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                }else if (position2 == 26) {
                    Fortaleza l = new Fortaleza();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("tab2I", (Serializable) l.sabI());
                    i.putExtra("tab2O", (Serializable) l.sabO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 27) {
                    Votocel l = new Votocel();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 28) {
                    Taniana1 l = new Taniana1();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("tab2I", (Serializable) l.sabI());
                    i.putExtra("tab2O", (Serializable) l.sabO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 29) {
                    Alphaaville l = new Alphaaville();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else if (position2 == 30) {
                    Morros l = new Morros();
                    i.putExtra("diasemanda", l.diasemanda);
                    i.putExtra("tab1I", (Serializable) l.segSexI());
                    i.putExtra("tab1O", (Serializable) l.segSexO());
                    i.putExtra("tab2I", (Serializable) l.sabadoI());
                    i.putExtra("tab2O", (Serializable) l.sabadoO());
                    i.putExtra("vigencia", l.vigencia);
                    i.putExtra("tp", true);
                    i.putExtra("nome",tvNome.getText());
                   cont.startActivity(i);
                } else{

                    Toast.makeText(cont, "ERROOO!!!!", Toast.LENGTH_SHORT).show();
            }
            }
        });
        return v;
    }

    public List<BusNome> getLst() {
        return lst;
    }

    public void setLst(List<BusNome> lst) {
        this.lst = lst;
    }
}
