package com.hanbit.user.myappwebview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

public class IntroActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        ((Button) findViewById(R.id.btImageView)).setOnClickListener(this);
        ((Button) findViewById(R.id.btWebView)).setOnClickListener(this);
        ((Button) findViewById(R.id.btImageViewConvert)).setOnClickListener(this);
        ((Button) findViewById(R.id.btImageList)).setOnClickListener(this);
        ((Button) findViewById(R.id.btImageGridView)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btWebView:
                startActivity(new Intent(this, MainActivity.class));
                break;

            case R.id.btImageView:startActivity(new Intent(this, ImageViewActivity.class));

                break;
            case R.id.btImageViewConvert:startActivity(new Intent(this, ImageConvertActivity.class));
                break;
            case R.id.btImageList:startActivity(new Intent(this, ImageListActivity.class));
                break;

            case R.id.btImageGridView :startActivity(new Intent(this, ImageGridActivity.class)); break;


        }
    }
}
