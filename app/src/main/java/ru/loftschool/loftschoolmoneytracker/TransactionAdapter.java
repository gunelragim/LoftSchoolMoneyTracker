package ru.loftschool.loftschoolmoneytracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Гюнель on 04.05.2015.
 */
public class TransactionAdapter extends ArrayAdapter<Transaction> {
    public TransactionAdapter(Context context, List<Transaction> transactions) {
        super(context, 0, transactions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Transaction transaction = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView sum = (TextView) convertView.findViewById(R.id.sum);
        TextView date = (TextView) convertView.findViewById(R.id.date);

        title.setText(transaction.getTitle());
        sum.setText(Integer.toString(transaction.getSum()));
        date.setText(transaction.getDateTime());
        int color = position % 2 == 0 ? getContext().getResources().getColor(R.color.whiteColor) : getContext().getResources().getColor(R.color.backgroundGreen);
        convertView.setBackgroundColor(color);

        return convertView;
    }
}
