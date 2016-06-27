package com.hanbit.user.myappwebview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by user on 2016-06-25.
 */
public class MovieAdpter extends BaseAdapter {
    private  Context context;
    private   String[] movieValues;
    private  Integer[] movieID;

    public MovieAdpter(Context context, String[] movieValues, Integer[] movieID) {

        this.context=context;
        this.movieValues=movieValues;
        this.movieID=movieID;
    }


    public String[] getMovieValues() {
        return movieValues;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if(view==null){
            gridView=new View(context);
            gridView= inflater.inflate (R.layout.movie,null);
            TextView textView = (TextView) gridView.findViewById(R.id.grid_item_label);
            textView.setText( movieValues[position]);
            String movie=movieValues [position];
            ImageView imageView = (ImageView) gridView.findViewById(R.id.grid_item_image);

           /* switch (movie) {
                case "mov01" : imageView.setImageResource(R.drawable.mov01);break;
                case "mov02" : imageView.setImageResource(R.drawable.mov02);break;
                case "mov03" : imageView.setImageResource(R.drawable.mov03);break;
                case "mov04" : imageView.setImageResource(R.drawable.mov04);break;
                case "mov05" : imageView.setImageResource(R.drawable.mov05);break;
                case "mov06" : imageView.setImageResource(R.drawable.mov06);break;
                case "mov07" : imageView.setImageResource(R.drawable.mov07);break;
            } 위에 문장을 아래로 치환*/
            imageView.setImageResource(movieID[position]);
        } else {
            gridView=(View) view;

        };
        return gridView;
    }

    @Override
    public int getCount() {
        return movieValues.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }



}
