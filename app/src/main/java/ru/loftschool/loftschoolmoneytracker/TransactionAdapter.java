package ru.loftschool.loftschoolmoneytracker;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.CardViewHolder> {
    private final List<Transaction> transactions;

    public TransactionAdapter(List<Transaction> transactions) {
        this.transactions = transactions;
    }


    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        Transaction transaction = transactions.get(position);
        holder.title.setText(transaction.getTitle());
        holder.sum.setText(String.valueOf(transaction.getSum()));
        holder.date.setText(transaction.getDateTime());

    }

    @Override
    public int getItemCount() {
        return transactions.size();
    }


    public static class CardViewHolder extends RecyclerView.ViewHolder {
        protected TextView title;
        protected TextView sum;
        protected TextView date;

        public CardViewHolder(View itemView) {
            super(itemView);
            title = (TextView) this.itemView.findViewById(R.id.title);
            sum = (TextView) this.itemView.findViewById(R.id.sum);
            date = (TextView) this.itemView.findViewById(R.id.date);
        }
    }
}
