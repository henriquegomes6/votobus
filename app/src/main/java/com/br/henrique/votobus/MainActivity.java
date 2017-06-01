package com.br.henrique.votobus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.br.henrique.votobus.Adapters.ListBusAdapter;
import com.br.henrique.votobus.Banco.BancoNome;
import com.br.henrique.votobus.TO.BusNome;

import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private ListBusAdapter busAdapter;
    private List<BusNome> lst;
    private Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mContext = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                lst = new BancoNome().lst();
                lv = (ListView) findViewById(R.id.lvBus);
                busAdapter = new ListBusAdapter(mContext, lst);
                lv.setAdapter(busAdapter);
            }
        }).run();

    }

   /*
        Uri uri = Uri.parse("market://details?id=" + getPackageName());
        Intent myAppLinkToMarket = new Intent(Intent.ACTION_VIEW, uri);
        try {
            startActivity(myAppLinkToMarket);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, " unable to find market app", Toast.LENGTH_LONG).show();
        }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            if (item.getTitle().equals("#")) {
                item.setTitle("AZ");
                lst = new BancoNome().lst();
                busAdapter.setLst(lst);
                busAdapter.notifyDataSetChanged();
            } else {
                item.setTitle("#");
                Collections.sort(lst);
                busAdapter.setLst(lst);
                busAdapter.notifyDataSetChanged();
            }
            return true;
        } else if (id == R.id.action_sobre) {
            startActivity(new Intent(getApplicationContext(), Sobre.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
