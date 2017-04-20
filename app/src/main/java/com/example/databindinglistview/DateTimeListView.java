package com.example.databindinglistview;

import android.content.Context;
import android.databinding.ObservableArrayList;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ListView;

/**
 * BindingListView
 */

public class DateTimeListView extends ListView{

    DateTimeAdapter adapter;

    public DateTimeListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setList(ObservableArrayList<DateTime> dateTimeList){
        Log.d("DEBUG", "setList is called");

        if (getAdapter() == null) {
            adapter = new DateTimeAdapter(getContext(), dateTimeList);
            setAdapter(adapter);
        }

        adapter.notifyDataSetChanged();
    }
}
