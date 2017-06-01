package com.br.henrique.votobus.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.br.henrique.votobus.R;
import com.br.henrique.votobus.TO.horario;

import java.util.List;

/**
 * Created by Henrique on 20/01/2016.
 */
public class RVAdapterTp2 extends RecyclerView.Adapter<RVAdapterTp2.MyViewHolder> {
    private List<horario> horarioI;
    private LayoutInflater mLayoutInflater;

    public RVAdapterTp2(Context c, List<horario> i) {
        this.horarioI = i;
        mLayoutInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = mLayoutInflater.inflate(R.layout.tp2_item, parent, false);
        MyViewHolder mvh = new MyViewHolder((v));
        return mvh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvI.setText(horarioI.get(position).getIo());
    }

    @Override
    public int getItemCount() {
        return horarioI.size();
    }

    public class MyViewHolder extends ViewHolder {
        public Button tvI;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvI = (Button) itemView.findViewById(R.id.cvI);
        }
    }
}
