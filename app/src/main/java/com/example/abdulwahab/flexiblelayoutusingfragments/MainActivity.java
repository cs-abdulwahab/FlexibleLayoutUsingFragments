package com.example.abdulwahab.flexiblelayoutusingfragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.abdulwahab.flexiblelayoutusingfragments.fragments.MainActivityFragment;
import com.example.abdulwahab.flexiblelayoutusingfragments.model.Employee;

public
class MainActivity extends AppCompatActivity implements MainActivityFragment.IMasterListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void MasterClick(Employee position) {
        Toast.makeText(MainActivity.this, "position "+ position  , Toast.LENGTH_SHORT).show();
    }
}
