package com.example.expermintaltrick.FragmentList;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.expermintaltrick.R;

public class Golkhaneh extends Fragment{
    private View view;

    public Golkhaneh() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate( R.layout.golkhaneh,container,false );
        RecyclerView recyclerView = (RecyclerView) view.findViewById( R.id.recycler1 );

        return view;
    }
}
