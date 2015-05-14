package ru.loftschool.loftschoolmoneytracker;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Гюнель on 11.05.2015.
 */
public class Transaction_Fragment extends Fragment {
      private ListView listview;
     private TransactionAdapter transactionAdapter;
    private Date dateTime;
     List<Transaction> data = new ArrayList<>();



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

     final View inflate = inflater.inflate(R.layout.fragment_tramsaction, container,false);


        List <Transaction> adapterData = getTransactions();
        TransactionAdapter transactionAdapter = new TransactionAdapter(getActivity(), adapterData);
        ListView listview = (ListView) inflate.findViewById(R.id.list);
        listview.setAdapter(transactionAdapter);


        return inflate;


       // return super.onCreateView(inflater, container, savedInstanceState);
    }

    public List<Transaction> getTransactions() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date now_calendar = Calendar.getInstance().getTime();
        String dateToday = dateFormat.format(now_calendar);

        data.add(new Transaction("Phone",200, dateToday));
        data.add(new Transaction("Meal",300, dateToday));
        data.add(new Transaction("Bus",300,dateToday));
        return data;
    }
}

