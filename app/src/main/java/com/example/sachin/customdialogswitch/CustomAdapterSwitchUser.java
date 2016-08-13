package com.example.sachin.customdialogswitch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Administrator on 8/11/2016.
 */
public class CustomAdapterSwitchUser extends BaseAdapter {
    ArrayList<String> name,mobile;
    Context context;
    ArrayList<Integer> images;
    private static LayoutInflater inflater=null;
    public CustomAdapterSwitchUser(Context context, ArrayList<String> name ,ArrayList<String> mobile,  ArrayList<Integer> images) {
        // TODO Auto-generated constructor stub
        this.name = name;
        this.context = context;
        this.images = images;
        this.mobile = mobile;

        if(context!=null)
            inflater = ( LayoutInflater )context.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return name.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv_name,tv_mobile;
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.users_list, null);
        holder.tv_name=(TextView) rowView.findViewById(R.id.name);
        holder.tv_mobile=(TextView) rowView.findViewById(R.id.number);
        holder.img=(ImageView) rowView.findViewById(R.id.icon);
        holder.tv_mobile.setText(mobile.get(position));
        holder.tv_name.setText(name.get(position));
        holder.img.setImageResource(images.get(position));
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+name.get(position), Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }

}