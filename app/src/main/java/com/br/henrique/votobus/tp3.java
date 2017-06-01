package com.br.henrique.votobus;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.br.henrique.votobus.Frags.Tp1Frag;
import com.br.henrique.votobus.Frags.Tp2Frag;
import com.br.henrique.votobus.TO.horario;

import java.util.ArrayList;
import java.util.List;

public class tp3 extends AppCompatActivity {

    private ArrayList<horario> tab1I;
    private ArrayList<horario> tab1O;
    private ArrayList<horario> tab2I;
    private ArrayList<horario> tab2O;
    private ArrayList<horario> tab3I;
    private ArrayList<horario> tab3O;
    private ArrayList<horario> tab4I;
    private ArrayList<horario> tab4O;
    private String[] diasemanda;
    private Boolean tp;

    /**
     * The {@link ViewPager} that will host the section contents.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("AQUI", "onCreate");
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
            Window window = this.getWindow();

            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryDark));
        }
        setContentView(R.layout.activity_tp1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        ViewPager mViewPager;
        tp = getIntent().getBooleanExtra("tp", true);
        diasemanda = getIntent().getStringArrayExtra("diasemanda");
        Log.i("AQUI","passo");
        if (tp) {
            if (diasemanda.length > 0) {
                tab1I = (ArrayList<horario>) getIntent().getSerializableExtra("tab1I");
                tab1O = (ArrayList<horario>) getIntent().getSerializableExtra("tab1O");
                Log.i("AQUI","pegou horario1");
            }
            if (diasemanda.length > 1) {
                tab2I = (ArrayList<horario>) getIntent().getSerializableExtra("tab2I");
                tab2O = (ArrayList<horario>) getIntent().getSerializableExtra("tab2O");
                Log.i("AQUI","pegou horario2");
            }
            if (diasemanda.length > 2) {
                tab3I = (ArrayList<horario>) getIntent().getSerializableExtra("tab3I");
                tab3O = (ArrayList<horario>) getIntent().getSerializableExtra("tab3O");
            }
            if (diasemanda.length > 3) {
                tab4I = (ArrayList<horario>) getIntent().getSerializableExtra("tab4I");
                tab4O = (ArrayList<horario>) getIntent().getSerializableExtra("tab4O");
            }

        } else {
            tab1I = (ArrayList<horario>) getIntent().getSerializableExtra("tab1I");
        }

        toolbar.setTitle(getIntent().getStringExtra("nome"));
        toolbar.setSubtitle(getIntent().getStringExtra("vigencia"));
        setSupportActionBar(toolbar);
        Log.i("AQUI", "passou 2");
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        /*
      The {@link android.support.v4.view.PagerAdapter} that will provide
      fragments for each of the sections. We use a
      {@link FragmentPagerAdapter} derivative, which will keep every
      loaded fragment in memory. If this becomes too memory intensive, it
      may be best to switch to a
      {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        Log.i("AQUI", "passou 3");

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
        Log.d("AQUIII", "onDestroy");
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment f = null;
            Bundle d = new Bundle();
            switch (position) {
                case 0:
                    if (tp) {
                        f = new Tp1Frag();
                        d.putSerializable("tab1I",tab1I);
                        d.putSerializable("tab1O",tab1O);
                        f.setArguments(d);
                        return f;
                    } else {
                        f = new Tp2Frag();
                        d.putSerializable("tab1I",tab1I);
                        f.setArguments(d);
                        return f;
                    }
                case 1:
                    f = new Tp1Frag();
                    d.putSerializable("tab1I",tab2I);
                    d.putSerializable("tab1O",tab2O);
                    f.setArguments(d);
                    return f;
                case 2:
                    f = new Tp1Frag();
                    d.putSerializable("tab1I",tab3I);
                    d.putSerializable("tab1O",tab3O);
                    f.setArguments(d);
                    return f;
                case 3:
                    f = new Tp1Frag();
                    d.putSerializable("tab1I",tab4I);
                    d.putSerializable("tab1O",tab4O);
                    f.setArguments(d);
                    return f;
            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return diasemanda.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return diasemanda[position].trim();
        }

    }

}
