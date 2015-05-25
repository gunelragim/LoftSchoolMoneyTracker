package ru.loftschool.loftschoolmoneytracker;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.melnykov.fab.FloatingActionButton;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
/**
 * Created by Гюнель on 11.05.2015.
 */
public class Transaction_Fragment extends Fragment {
    private RecyclerView recyclerView;
    List<Transaction> data = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View inflate = inflater.inflate(R.layout.fragment_tramsaction, container, false);
        List<Transaction> adapterData = getTransactions();
        recyclerView = (RecyclerView) inflate.findViewById(R.id.transactions_list);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new TransactionAdapter(adapterData));
        FloatingActionButton fab = (FloatingActionButton) inflate.findViewById(R.id.fab);
        fab.attachToRecyclerView(recyclerView);

        return inflate;
    }

    public List<Transaction> getTransactions() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date now_calendar = Calendar.getInstance().getTime();
        String dateToday = dateFormat.format(now_calendar);

        data.add(new Transaction("Phone", 200, dateToday));
        data.add(new Transaction("Meal", 300, dateToday));
        data.add(new Transaction("Bus", 300, dateToday));
        return data;
    }
}

