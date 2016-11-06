package com.example.abdulwahab.flexiblelayoutusingfragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.abdulwahab.flexiblelayoutusingfragments.fragments.DetailFragment;
import com.example.abdulwahab.flexiblelayoutusingfragments.model.Employee;

public class DetailActivity extends AppCompatActivity {

    private String TAG = "MTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent detailIntent = getIntent();

        Employee emp = (Employee) detailIntent.getSerializableExtra("emp");

        DetailFragment detailFrag = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragmentDetail);


        detailFrag.setEmployeeDetail(emp);
        Log.d(TAG, "onCreate: emp = " + emp);

    }
}
