package com.example.databindinglistview;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

import com.example.databindinglistview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements MainEventHandler {

    ObservableArrayList<DateTime> dateTimeList = new ObservableArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setDateTimeList(dateTimeList);
        binding.setHandlers(this);
    }

    @Override
    public void onAdd(View view) {
        dateTimeList.add(new DateTime());
    }

    @Override
    public void onDelete(View view) {
        if (dateTimeList.size() > 0) {
            dateTimeList.remove(dateTimeList.size() - 1);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.d("DEBUG", "onItemClicked : " + position);
    }

}
