package com.br.henrique.votobus.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.br.henrique.votobus.R;
import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;


/**
 * Created by Henrique on 20/01/2016.
 */
public class RVAdapterTp1 extends RecyclerView.Adapter<RVAdapterTp1.MyViewHolder> {
    private ArrayList<horario> horarioI;
    private ArrayList<horario> horarioO;
    private Context mContext;
    private AlertDialog alerta;

    public RVAdapterTp1(Context c, ArrayList<horario> i, ArrayList<horario> o) {
        this.horarioI = i;
        this.horarioO = o;
        mContext = c;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tp1_item, parent, false);
        MyViewHolder mvh = new MyViewHolder((v));
        return mvh;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.setIsRecyclable(false);

        if (position < horarioO.size()) {
            holder.cvO.setText(horarioO.get(position).getIo().trim());
            holder.cvO.setVisibility(View.VISIBLE);
            if (horarioO.get(position).getOb() == 0) {
                holder.cvO.setBackgroundColor(Color.parseColor("#FFC107"));
                holder.cvO.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
                        builder.setTitle("ATENÇÃO");
                        builder.setMessage(horarioO.get(position).getObs().trim());
                        builder.setPositiveButton("OK",null);
                        alerta = builder.create();
                        //Exibe
                        alerta.show();
                    }
                });
            }
        } else {
            holder.cvO.setText("");
            holder.cvO.setVisibility(View.INVISIBLE);
        }

        if (position < horarioI.size()) {
            holder.cvI.setText(horarioI.get(position).getIo().trim());
            holder.cvI.setVisibility(View.VISIBLE);

            if (horarioI.get(position).getOb() == 0) {
                holder.cvI.setBackgroundColor(Color.parseColor("#FFC107"));
                holder.cvI.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
                        builder.setTitle("ATENÇÃO");
                        builder.setMessage(horarioI.get(position).getObs().trim());
                        builder.setPositiveButton("OK",null);
                        alerta = builder.create();
                        //Exibe
                        alerta.show();
                    }
                });
            }
        } else {
            holder.cvI.setText("");
            holder.cvI.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        if (horarioO.size() > horarioI.size()) {
            return horarioO.size();
        } else {
            return horarioI.size();
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public Button cvI;
        public Button cvO;

        public MyViewHolder(View itemView) {
            super(itemView);
            cvI = (Button) itemView.findViewById(R.id.cvI);
            cvO = (Button) itemView.findViewById(R.id.cvO);
        }
    }
}
