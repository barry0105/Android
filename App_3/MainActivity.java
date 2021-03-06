package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView, scrollView2;
    ImageView imageView, imageView2;
    BitmapDrawable bitmap;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.ScrollView);
        scrollView.setHorizontalScrollBarEnabled(true);

        scrollView2 = findViewById(R.id.ScrollView2);
        scrollView2.setHorizontalScrollBarEnabled(true);

        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.one);

        int bitmapwidth = bitmap.getIntrinsicWidth();
        int bitmapheight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapwidth;
        imageView.getLayoutParams().height = bitmapheight;

        imageView2.setImageDrawable(bitmap);
        imageView2.getLayoutParams().width = bitmapwidth;
        imageView2.getLayoutParams().height = bitmapheight;

        imageView2.setVisibility(View.INVISIBLE);
    }
    public void onClickup(View v){
        changeImageup();
    }
    public void onClickdown(View v){
        changeImagedown();
    }
    public void changeImageup(){
        imageView2.setVisibility(View.INVISIBLE);
        imageView.setVisibility(View.VISIBLE);
    }
    public void changeImagedown(){
        imageView.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.VISIBLE);
    }

}
