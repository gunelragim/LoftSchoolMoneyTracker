package ru.loftschool.loftschoolmoneytracker;

/**
 * Created by Гюнель on 04.05.2015.
 */
public class Transaction {
    private String title;
    private int sum;
    private String date;

    public Transaction(String title, int sum, String date) {
        this.title = title;
        this.sum = sum;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getDateTime() {
        return date;
    }

    public void setDateTime(String date) {
        this.date = date;
    }


}
