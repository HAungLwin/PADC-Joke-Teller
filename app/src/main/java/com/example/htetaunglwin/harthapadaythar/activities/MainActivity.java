package com.example.htetaunglwin.harthapadaythar.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.htetaunglwin.harthapadaythar.R;
import com.example.htetaunglwin.harthapadaythar.fragments.EqualFragment;
import com.example.htetaunglwin.harthapadaythar.fragments.FastFragment;
import com.example.htetaunglwin.harthapadaythar.fragments.SaveFragment;

public class MainActivity extends AppCompatActivity {

    public int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        EqualFragment eFragment = new EqualFragment();
        final FastFragment fFragment = new FastFragment();
        final SaveFragment sFragment = new SaveFragment();
        final Fragment fragment[] = {eFragment, fFragment, sFragment};

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container, fragment[0])
                .commit();

        Button btnNext = (Button) findViewById(R.id.btn_next);
        final Button btnPrevious = (Button) findViewById(R.id.btn_previous);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i == 0) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fl_container, fragment[i = 1])
                            .commit();
                }else if(i == 1){
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fl_container, fragment[i = 2])
                            .commit();
                }else if(i == 2){
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fl_container, fragment[i = 0])
                            .commit();
                }

            }
        });

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (i == 0) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fl_container, fragment[i = 2])
                            .commit();
                }else if(i == 1){
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fl_container, fragment[i = 0 ])
                            .commit();
                }else if(i == 2){
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fl_container, fragment[i = 1 ])
                            .commit();
                }

            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
