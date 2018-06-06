package com.example.expermintaltrick.FragmentList;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.expermintaltrick.R;

import java.util.ArrayList;
import java.util.List;

public class Labaniiat extends Fragment{
    private View view;
    private List<DataModel> list;

    public Labaniiat() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate( R.layout.labaniiat,container,false );
        RecyclerView recyclerView = (RecyclerView) view.findViewById( R.id.recycler1 );
        list = new ArrayList <DataModel>(  );

        list.add( new DataModel( "۱ـ ترفند دوغ ترش و گازدار خانگی",getString( R.string.doogGazdar),R.drawable.ic_launcher_background ) );
        list.add( new DataModel( "۲ـ تولید کره نهره خانگی" ,getString( R.string.kareNehre ) ,R.drawable.ic_launcher_background ) );
        list.add( new DataModel( "۳ـ روغن حیوانی خانگی" , getString( R.string.roganeHeivani ),R.drawable.ic_launcher_background ) );
        list.add( new DataModel( "۴ـ ماست سرشیردار" , getString( R.string.Maast ),R.drawable.ic_launcher_background ) );
        list.add( new DataModel( "۵ـ جوشاندن شیر" , getString( R.string.Milk ),R.drawable.ic_launcher_background ) );


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( getActivity() );
        recyclerView.setLayoutManager( layoutManager );
        Adapter adapter = new Adapter( getContext(),list );
        recyclerView.setAdapter( adapter );

        return view;
    }
}