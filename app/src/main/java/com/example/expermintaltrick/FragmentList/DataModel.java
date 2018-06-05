package com.example.expermintaltrick.FragmentList;

import android.widget.TextView;

/**
 * Created by KARIZsystem on 05/06/2018.
 */

public class DataModel {

    private String trickName,trickDescription;
    private int trickImage;


    public DataModel() {
    }

    public DataModel(String trickName, String trickDescription, int trickImage) {
        this.trickName = trickName;
        this.trickDescription = trickDescription;
        this.trickImage = trickImage;
    }

    public String getTrickName() {
        return trickName;
    }

    public String getTrickDescription() {
        return trickDescription;
    }

    public int getTrickImage() {
        return trickImage;
    }

    public void setTrickName(String trickName) {
        this.trickName = trickName;
    }

    public void setTrickDescription(String trickDescription) {
        this.trickDescription = trickDescription;
    }

    public void setTrickImage(int trickImage) {
        this.trickImage = trickImage;
    }
}
