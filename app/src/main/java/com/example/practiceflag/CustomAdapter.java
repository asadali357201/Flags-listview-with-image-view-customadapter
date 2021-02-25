package com.example.practiceflag;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {
    Context thiscontext;
    int[] thiscountryimage;
    String[] thiscountryname;
    LayoutInflater xmlninflater=null;
    public CustomAdapter(Context applicationContext, int[] countryimage, String[] countryNmaes) {
        this.thiscontext=applicationContext;
        this.thiscountryname=countryNmaes;
        this.thiscountryimage=countryimage;
        xmlninflater=(LayoutInflater) thiscontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return thiscountryname.length;
    }

    @Override
    public Object getItem(int i) {
        return 0;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View thisbox=xmlninflater.inflate(R.layout.viewlayout,null);
        ImageView initializedimg=thisbox.findViewById(R.id.boximage);
        TextView initializedtv=thisbox.findViewById(R.id.boxname);
        initializedimg.setImageResource(thiscountryimage[position]);
        initializedtv.setText(thiscountryname[position]);
        return thisbox;
    }
}
