package ru.loftschool.loftschoolmoneytracker;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragmentManager().findFragmentById(R.id.fragment_tramsaction);
        final Transaction_Fragment fragmentById = (Transaction_Fragment)getFragmentManager().findFragmentById(R.id.fragment_tramsaction);
    }

}
