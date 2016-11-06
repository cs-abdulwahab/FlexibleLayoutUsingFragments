package com.example.abdulwahab.flexiblelayoutusingfragments.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.abdulwahab.flexiblelayoutusingfragments.model.Employee;

import java.util.List;

/**
 * Created by Abdul-Wahab on 11/3/2016.
 */
public class EmployeeAdapter extends ArrayAdapter<Employee> {
    public EmployeeAdapter(Context context, List<Employee> objects) {
        super(context, android.R.layout.simple_list_item_1, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);


        return view;
    }
}
