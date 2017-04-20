package com.example.databindinglistview;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.databindinglistview.databinding.ViewRowDateTimeListBinding;

/**
 * Adapter
 */

public class DateTimeAdapter extends ArrayAdapter<DateTime>{

    public DateTimeAdapter(Context context, ObservableArrayList<DateTime> dateTimeList) {
        super(context, 0, dateTimeList);
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, @NonNull ViewGroup parent) {
        ViewRowDateTimeListBinding binding;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            binding = DataBindingUtil.inflate(inflater, R.layout.view_row_date_time_list, parent, false);

            convertView = binding.getRoot();
            convertView.setTag(binding);
        } else {
            binding = (ViewRowDateTimeListBinding) convertView.getTag();
        }

        binding.setDateTime(getItem(position));

        return binding.getRoot();
    }
}
