package com.example.android.myapplicationdynamicfragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.myapplicationdynamicfragment.model.Flower;
import com.example.android.myapplicationdynamicfragment.model.FlowersData;

import java.util.List;

/**
 * Created by ASUS on 3/28/2018.
 */

public class MyFragment extends ListFragment {

    List<Flower> flowers = new FlowersData().getFlowers();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

FlowerDataAdapter adapter = new FlowerDataAdapter(getActivity(),R.layout.item_list,flowers);
setListAdapter(adapter);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View root =  inflater.inflate(R.layout.fragment_list,null);
       return root;
    }
}
