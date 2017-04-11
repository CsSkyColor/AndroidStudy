package com.example.yms.serviceexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button)this.findViewById(R.id.btn1);
        btn1.setOnClickListener(MainActivity.this);

        Button btn2 = (Button)this.findViewById(R.id.btn2);
        btn2.setOnClickListener(this);





    }

    public void onClick(View v){

        Intent i = null;

        switch (v.getId()){
            case R.id.btn1:
                i = new Intent(this, DemonService.class);
                startService(i);
                break;
            case R.id.btn2:
                i = new Intent(this, DemonService.class);
                this.stopService(i);
                break;
            default:
                break;
        }
    }
}
