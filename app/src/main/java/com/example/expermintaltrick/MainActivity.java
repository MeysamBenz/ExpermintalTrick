package com.example.expermintaltrick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.expermintaltrick.FragmentList.Araggijat;
import com.example.expermintaltrick.FragmentList.Cooking;
import com.example.expermintaltrick.FragmentList.DoshabMorabba;
import com.example.expermintaltrick.FragmentList.Golkhaneh;
import com.example.expermintaltrick.FragmentList.Labaniiat;
import com.example.expermintaltrick.FragmentList.Torshijat;

public class MainActivity extends AppCompatActivity  {

    private Button btn1,btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        init();

        //click Action defin
        clicListener();


    }

    public void init(){

        btn1 = (Button) findViewById( R.id.btn1 );
        btn2 = (Button) findViewById( R.id.btn2 );
        btn3 = (Button) findViewById( R.id.btn3 );
        btn4 = (Button) findViewById( R.id.btn4 );
        btn5 = (Button) findViewById( R.id.btn5 );
        btn6 = (Button) findViewById( R.id.btn6 );

    }


    public void clicListener(){

        btn1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( MainActivity.this, Cooking.class );
                startActivity( intent );

            }
        } );

        btn2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( MainActivity.this, Labaniiat.class );
                startActivity( intent );

            }
        } );

        btn3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( MainActivity.this, Araggijat.class );
                startActivity( intent );

            }
        } );

        btn4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( MainActivity.this, Torshijat.class );
                startActivity( intent );

            }
        } );

        btn5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( MainActivity.this, Golkhaneh.class );
                startActivity( intent );

            }
        } );

        btn6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, DoshabMorabba.class );
                startActivity( intent );
            }
        } );


    }
}
