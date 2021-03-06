package com.example.expermintaltrick.FragmentList.Frames;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.expermintaltrick.FragmentList.Torshijat;
import com.example.expermintaltrick.R;

public class Frame6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_frame6 );

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add( R.id.frame1,new Torshijat() );
        transaction.addToBackStack( null );
        transaction.commit();

    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount()>0){
            getSupportFragmentManager().popBackStack();
            finish();
        }else{
            super.onBackPressed();
        }
    }
}
