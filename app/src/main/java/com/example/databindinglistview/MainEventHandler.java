package com.example.databindinglistview;

import android.view.View;
import android.widget.AdapterView;

/**
 * ListViewからのイベント
 */

public interface MainEventHandler {
    void onAdd(View view);
    void onDelete(View view);
    void onItemClick(AdapterView<?> parent, View view, int position, long id);
}
