package com.example.expermintaltrick.FragmentList;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.expermintaltrick.MainActivity;
import com.example.expermintaltrick.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KARIZsystem on 05/06/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.myHolder> {

    private Context context;
    private List<DataModel> list;


    public Adapter(Context context, List <DataModel> list) {
        this.context = context;
        this.list = list;
    }


    public Adapter(MainActivity mainActivity) {
    }

    public Adapter() {
    }



    @Override
    public myHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( context ).inflate( R.layout.page2_design,parent,false);
        return new myHolder( view );
    }

    @Override
    public void onBindViewHolder(myHolder holder, int position) {
        DataModel dataModel = list.get( position );
        Glide.with( context ).load( dataModel.getTrickImage() ).into( holder.trickImage );
        holder.trickName.setText( dataModel.getTrickName() );
        holder.trickDescription.setText( dataModel.getTrickDescription() );
        holder.cardView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        } );
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }


    public class myHolder extends RecyclerView.ViewHolder{

        public TextView trickName,trickDescription;
        public ImageView trickImage;
        public CardView cardView;

        public myHolder(View itemView) {
            super( itemView );

            trickDescription = (TextView) itemView.findViewById( R.id.description );
            trickName = (TextView) itemView.findViewById( R.id.name );
            trickImage = (ImageView) itemView.findViewById( R.id.image1 );
            cardView = (CardView) itemView.findViewById( R.id.card1 );

        }
    }

}
