package com.example.listview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class mesajAdapter extends BaseAdapter  {
    List<mesajModel>list;
    Context context;


    public mesajAdapter(List<mesajModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View layout=LayoutInflater.from(context).inflate(R.layout.layout,parent,false);

        ImageView img= layout.findViewById(R.id.img_id);
        TextView txtkisi = layout.findViewById(R.id.kisi);
        TextView txtmesaj= layout.findViewById(R.id.mesaj);

        img.setImageResource(list.get(position).getImgId());
        txtkisi.setText(list.get(position).getKisi());
        txtmesaj.setText(list.get(position).getMesaj());

        return layout;
    }

    }

