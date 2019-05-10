package com.example.framelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img1.setOnClickListener((View.OnClickListener) this);
        img2.setOnClickListener((View.OnClickListener) this);





    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id){
            case R.id.img1:
            img1.setVisibility(View.GONE);
            img2.setVisibility(View.VISIBLE);
            break;
            case R.id.img2:
                img2.setVisibility(View.GONE);
                img1.setVisibility(View.VISIBLE);
                break;
        }

    }
}


