package com.example.abdulwahab.flexiblelayoutusingfragments.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.abdulwahab.flexiblelayoutusingfragments.R;
import com.example.abdulwahab.flexiblelayoutusingfragments.model.Employee;

import java.util.List;

/**
 * Created by Abdul-Wahab on 11/3/2016.
 */
public class EmployeeAdapter extends ArrayAdapter<Employee> {
    public EmployeeAdapter(Context context, List<Employee> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (convertView == null)
            view = LayoutInflater.from(getContext()).inflate(R.layout.row_custom_list, parent, false);


        // ViewHolder Design Pattern Not Implemented here

        Employee emp = getItem(position);
        TextView txtEmpID = (TextView) view.findViewById(R.id.txtEmpID);
        TextView txtEmpName = (TextView) view.findViewById(R.id.txtEmpName);

        txtEmpID.setText(""+emp.id);
        txtEmpID.setText(""+emp.getName());

        return view;
    }
}
