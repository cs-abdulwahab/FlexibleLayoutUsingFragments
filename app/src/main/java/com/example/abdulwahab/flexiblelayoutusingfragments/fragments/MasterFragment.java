package com.example.abdulwahab.flexiblelayoutusingfragments.fragments;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.abdulwahab.flexiblelayoutusingfragments.adapters.EmployeeAdapter;
import com.example.abdulwahab.flexiblelayoutusingfragments.R;
import com.example.abdulwahab.flexiblelayoutusingfragments.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class MasterFragment  extends Fragment {

    IMasterListListener iMasterListListener;

    ListView listFrag;
    private EmployeeAdapter employeeAdapter;

    public MasterFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, true);

        // String s[] = getResources().getStringArray(R.array.MobileSections);

        final List<Employee> empList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {

            empList.add(new Employee(i, "e" + i, "e" + i + "detail  detail"));
        }


        listFrag = (ListView) view.findViewById(R.id.listFrag);

        employeeAdapter = new EmployeeAdapter(getActivity(), empList);

        listFrag.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);

        listFrag.setAdapter(employeeAdapter);


        listFrag.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (iMasterListListener != null) {

                    employeeAdapter.getItem(position);
                    iMasterListListener.MasterClick(empList.get(position));
                }
            }
        });

        return view;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        iMasterListListener = (IMasterListListener) activity;

    }

    /**
     * Created by Abdul Wahab on 12/8/2015.
     */
    public interface IMasterListListener {

        public void MasterClick(Employee position);
    }
}
