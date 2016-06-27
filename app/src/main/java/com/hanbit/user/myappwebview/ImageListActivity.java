package com.hanbit.user.myappwebview;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class ImageListActivity extends ListActivity {
    static  final String[] arr=new String[]
            {"cupcake","dont","eclair","froyo","glngerbread","honeycomb"
                    ,"icecream","jellybean","lolleypop"

            };

    Integer[] posterID={
            R.drawable.cupcake, R.drawable.donut,R.drawable.eclair, R.drawable.froyo,
            R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.icecream,R.drawable.jellybean,R.drawable.lollipop
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.activity_list);
        setListAdapter(new ArrayAdapter(this,arr,posterID));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String selectedValue = (String) getListAdapter().getItem(position);
        View dialogView = (View) View.inflate(getApplicationContext(), R.layout.activity_image_view, null);
        AlertDialog.Builder dlg = new AlertDialog.Builder(ImageListActivity.this);
        ImageView ivPoster =   (ImageView) dialogView.findViewById(R.id.image_view);
        //  ImageView imageView=(ImageView) view.findViewById(R.id.grid_item_image);

        // ivPoster.setImageResource(); 삽입


        ivPoster.setImageResource(posterID[position]);
        dlg.setTitle(arr[position]);
        //  dlg.setIcon(R.drawable.ic_launcher);
        dlg.setView(dialogView);
        dlg.setNegativeButton("닫기", null);
        dlg.show();
     Toast.makeText(this,selectedValue,Toast.LENGTH_SHORT).show();
    }
}
