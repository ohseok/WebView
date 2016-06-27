package com.hanbit.user.myappwebview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageConvertActivity extends Activity implements View.OnClickListener {
    ImageView imageView;
    Button btNextImage, btPreImage;

    Integer[]  posterID;
    //Integer[]  posterID ={
     //       R.drawable.

    //};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_convert);
        imageView= (ImageView) findViewById(R.id.imageView);
        btNextImage=(Button) findViewById(R.id.btPreImage);
        btPreImage=(Button) findViewById(R.id.btNextImage);
        btNextImage.setOnClickListener(this);
        btPreImage.setOnClickListener(this);
        btPreImage.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btPreImage :
                imageView.setImageResource(R.drawable.firefox);
                btPreImage.setVisibility(View.INVISIBLE);
                btNextImage.setVisibility(View.VISIBLE);
                break;
            case R.id.btNextImage :
                btPreImage.setVisibility(View.VISIBLE);
                btNextImage.setVisibility(View.INVISIBLE);
                imageView.setImageResource(R.drawable.dog);

                break;

        }
    }
}
