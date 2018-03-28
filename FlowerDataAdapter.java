package com.example.android.myapplicationdynamicfragment;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.myapplicationdynamicfragment.model.Flower;

import java.util.List;

/**
 * Created by ASUS on 3/28/2018.
 */

public class FlowerDataAdapter extends ArrayAdapter<Flower> {

    private Context context;
    private List<Flower> objects;

    public FlowerDataAdapter(@NonNull Context context, int resource, List<Flower> objects) {
        super(context, resource, objects);
        this.context = context;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Flower flower = objects.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_list,null);

        ImageView ivFlower = view.findViewById(R.id.idFlower);
        TextView tvName = view.findViewById(R.id.textName);
        TextView tvPrice = view.findViewById(R.id.textPrice);

        ivFlower.setImageResource(flower.getPic());
        tvName.setText(flower.getName());
        tvPrice.setText(flower.getPrice());

        return view;
    }
}
