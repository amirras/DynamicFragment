package com.example.android.myapplicationdynamicfragment.model;

import com.example.android.myapplicationdynamicfragment.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 3/28/2018.
 */

public class FlowersData {

    public List<Flower> flowers = new  ArrayList<Flower>();

    public List<Flower> getFlowers(){
        return flowers;
    }

    public FlowersData(){
      flowers.add(new Flower("narges","1000","narges Flower", R.drawable.ic_launcher_background ));
      flowers.add(new Flower("rose","2000","Rose Flower", R.drawable.ic_launcher_background ));
      flowers.add(new Flower("mohammadi","3000","mohammadi Flower", R.drawable.ic_launcher_background ));
    }
}
