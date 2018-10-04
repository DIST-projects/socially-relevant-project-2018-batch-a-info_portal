package com.journaldev.navigationdrawer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by K.YUVARANI on 29-08-2018.
 */

public class CustomListview extends ArrayAdapter<String>{
    private String[] symponame;
    private String[] sympodept;
    private Integer[] sympoimg;
    private Activity context;
    public CustomListview(Activity context,String[] symponame,String[] sympodept,Integer[] sympoimg)
    {
        super(context,R.layout.layout_symposiums,symponame);
        this.context=context;
        this.symponame=symponame;
        this.sympodept=sympodept;
        this.sympoimg=sympoimg;
    }
    public View getView(int position, @Nullable View convertView,
                        @NonNull ViewGroup parent)
    {
        View r=convertView;
        ViewHolder viewHolder=null;
        if(r==null)
        {
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.layout_symposiums,null,true);
            viewHolder=new ViewHolder(r);
            r.setTag(viewHolder);

        }
        else
        {
           viewHolder=(ViewHolder)r.getTag();
        }
        viewHolder.t3.setImageResource(sympoimg[position]);
        viewHolder.t1.setText(symponame[position]);
        viewHolder.t2.setText(sympodept[position]);
        return r  ;
    }
    class ViewHolder
    {
        TextView t1;
        TextView t2;
        ImageView t3;
        ViewHolder(View v)
        {
            t1=(TextView)v.findViewById(R.id.listtext1);
            t2=(TextView)v.findViewById(R.id.listtext2);
            t3=(ImageView)v.findViewById(R.id.listimage);
        }

    }
}
