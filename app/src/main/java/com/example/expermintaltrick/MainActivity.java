package com.example.expermintaltrick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.expermintaltrick.FragmentList.Frames.Frame1;
import com.example.expermintaltrick.FragmentList.Frames.Frame2;
import com.example.expermintaltrick.FragmentList.Frames.Frame3;
import com.example.expermintaltrick.FragmentList.Frames.Frame4;
import com.example.expermintaltrick.FragmentList.Frames.Frame5;
import com.example.expermintaltrick.FragmentList.Frames.Frame6;

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

                Intent intent = new Intent( MainActivity.this, Frame1.class );
                startActivity( intent );


            }
        } );

        btn2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( MainActivity.this, Frame5.class );
                startActivity( intent );

            }
        } );

        btn3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( MainActivity.this, Frame3.class );
                startActivity( intent );

            }
        } );

        btn4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( MainActivity.this, Frame4.class );
                startActivity( intent );

            }
        } );

        btn5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( MainActivity.this, Frame2.class );
                startActivity( intent );

            }
        } );

        btn6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, Frame6.class );
                startActivity( intent );
            }
        } );


    }
}
