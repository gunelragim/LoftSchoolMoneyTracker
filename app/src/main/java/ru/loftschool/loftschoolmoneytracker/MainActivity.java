package ru.loftschool.loftschoolmoneytracker;

import android.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class MainActivity extends ActionBarActivity {

  //  private ListView listview;
   // private TransactionAdapter transactionAdapter;
    //private Date dateTime;
   // List<Transaction> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragmentManager().findFragmentById(R.id.fragment_tramsaction);
        final Transaction_Fragment fragmentById = (Transaction_Fragment)getFragmentManager().findFragmentById(R.id.fragment_tramsaction);


     //  List <Transaction> adapterData;
       //adapterData = getTransactions();
       //transactionAdapter = new TransactionAdapter(this,adapterData);
       //listview = (ListView)findViewById(R.id.list);
      // listview.setAdapter(transactionAdapter);



    }


   // private List<Transaction> getTransactions()
   // {


//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
  //      Date now_calendar = Calendar.getInstance().getTime();
    //    String dateToday = dateFormat.format(now_calendar);



      //  data.add(new Transaction("Phone",200, dateToday));
        //data.add(new Transaction("Meal",300, dateToday));
        //data.add(new Transaction("Bus",300,dateToday));
       // return data;
//    }
}
