package com.example.abdulwahab.flexiblelayoutusingfragments;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

import com.example.abdulwahab.flexiblelayoutusingfragments.fragments.DetailFragment;
import com.example.abdulwahab.flexiblelayoutusingfragments.fragments.MasterFragment;
import com.example.abdulwahab.flexiblelayoutusingfragments.model.Employee;

public class MainActivity extends AppCompatActivity implements MasterFragment.IMasterListListener {

    private String TAG = "MTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    // Proper function to get the orientation
    public Boolean isLandscape() {
        final int rotation = getResources().getConfiguration().orientation;
        switch (rotation) {
            case Configuration.ORIENTATION_LANDSCAPE:
                return true;
            case Configuration.ORIENTATION_PORTRAIT:
                return false;
            default:
                return false;
        }
    }


    @Override
    public void MasterClick(Employee employee) {


        if (isLandscape()) {

            DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragmentDetail);

            detailFragment.setEmployeeDetail(employee);
        } else {

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("emp", employee);

            startActivity(intent);


            Log.d(TAG, "POTRAIT   MasterClick() called with: employee = [" + employee + "]");
        }

    }
}
