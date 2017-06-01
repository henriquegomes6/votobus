package com.br.henrique.votobus.Frags;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.br.henrique.votobus.Adapters.RVAdapterTp1;
import com.br.henrique.votobus.TO.horario;
import com.br.henrique.votobus.Adapters.RVAdapterTp1;
import com.br.henrique.votobus.R;
import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;

public class Tp1Frag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Bundle extras = getArguments();
        View view = inflater.inflate(R.layout.fragment_tp1, container, false);
        if (extras != null) {
            ArrayList<horario> horarioI = (ArrayList<horario>) extras.getSerializable("tab1I");
            ArrayList<horario> horarioO = (ArrayList<horario>) extras.getSerializable("tab1O");


            RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_list);

            mRecyclerView.setHasFixedSize(false);

            LinearLayoutManager llm = new LinearLayoutManager(getActivity());
            llm.setOrientation(LinearLayoutManager.VERTICAL);
            mRecyclerView.setLayoutManager(llm);

            RVAdapterTp1 adapterTp1 = new RVAdapterTp1(getActivity(), horarioI, horarioO);
            mRecyclerView.setAdapter(adapterTp1);

        }
        return view;

    }

}
