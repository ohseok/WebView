package com.hanbit.user.myappwebview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user on 2016-06-25.
 */
public class ArrayAdapter extends  android.widget.ArrayAdapter<String> {
    private  Context context;
    private   String[] values;
    private  Integer[] postID;

    public ArrayAdapter(Context context, String[] values,Integer[] postID ) {
        super(context,R.layout.activity_list,values);
        this.context=context;
        this.values=values;
        this.postID=postID;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(R.layout.activity_list,parent,false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView= (ImageView) rowView.findViewById(R.id.logo);
        textView.setText(values[position]);
        String s=values[position];
        imageView.setImageResource(postID[position]);
    /*
       switch (s)
       {
           case  "cupcake" :imageView.setImageResource(R.drawable.cupcake); break;
           case "dont":imageView.setImageResource(R.drawable.donut); break;
           case "eclair":imageView.setImageResource(R.drawable.eclair); break;
           case"froyo" :imageView.setImageResource(R.drawable.froyo); break;
           case "honeycomb":imageView.setImageResource(R.drawable.honeycomb); break;
           case "icecream":imageView.setImageResource(R.drawable.icecream); break;
           case "jellybean" :imageView.setImageResource(R.drawable.jellybean); break;
           case "lolleypop":imageView.setImageResource(R.drawable.lollipop); break;


       }
       */
        return rowView;
    }
}
