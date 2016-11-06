package com.example.abdulwahab.flexiblelayoutusingfragments.fragments;


import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.abdulwahab.flexiblelayoutusingfragments.R;
import com.example.abdulwahab.flexiblelayoutusingfragments.model.Employee;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {


    public DetailFragment() {
        // Required empty public constructor
    }

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return view = inflater.inflate(R.layout.fragment_detail, container, false);
    }

    public void setEmployeeDetail(Employee employee) {

        TextView txtFragDetail = (TextView) view.findViewById(R.id.txtdetFragText);

        txtFragDetail.setText(employee.toString());
    }
}
