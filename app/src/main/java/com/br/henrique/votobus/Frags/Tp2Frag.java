package com.br.henrique.votobus.Frags;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.br.henrique.votobus.Adapters.RVAdapterTp2;
import com.br.henrique.votobus.R;
import com.br.henrique.votobus.TO.horario;

import java.util.List;

public class Tp2Frag extends Fragment {
    private RecyclerView mRecyclerView;
    private List<horario> horarioI;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Bundle extras = getArguments();
        if (extras != null) {
            horarioI = (List<horario>) extras.getSerializable("tab1I");
        }
        View view = inflater.inflate(R.layout.fragment_tp1, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_list);

        mRecyclerView.setHasFixedSize(false);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(llm);

        RVAdapterTp2 adapterTp1 = new RVAdapterTp2(getActivity(), horarioI);
        mRecyclerView.setAdapter(adapterTp1);
        return view;

    }
}
