package com.hanbit.user.myappwebview;

import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ImageGridActivity extends Activity {

    GridView gridView;
    static  final String[] movies =new String[]
            {
                    "mov01",  "mov02","mov03","mov04","mov05","mov06","mov07"
            };
     Integer[] posterID={
                R.drawable.mov01, R.drawable.mov02,R.drawable.mov03, R.drawable.mov04,
                        R.drawable.mov05, R.drawable.mov06,R.drawable.mov07
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_image_grid);
        gridView = (GridView) findViewById(R.id.gridView);

        gridView.setAdapter(new MovieAdpter(this,movies,posterID));
         TextView textView = (TextView) gridView.findViewById(R.id.grid_item_label);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
               // TextView textView = (TextView) gridView.findViewById(R.id.grid_item_label);
                View dialogView = (View) View.inflate(getApplicationContext(), R.layout.activity_image_view, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(ImageGridActivity.this);
                ImageView ivPoster =   (ImageView) dialogView.findViewById(R.id.image_view);
                ivPoster.setImageResource(posterID[position]);

              //  Log.i("이미지아이디", ((ImageView) view.findViewById(R.id.grid_item_image)).getResources()));
                dlg.setTitle(movies[position]);
                       //  dlg.setIcon(R.drawable.ic_launcher);
                                       dlg.setView(dialogView);
                              dlg.setNegativeButton("닫기", null);
                              dlg.show();
              /*  Toast.makeText(  getApplicationContext(),
                        ((TextView)view.findViewById(R.id.grid_item_label)).getText()
                        ,Toast.LENGTH_SHORT

                ).show();*/
            }
        });
    }
}
