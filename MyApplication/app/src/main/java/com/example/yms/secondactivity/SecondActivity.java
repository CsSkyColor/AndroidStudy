package com.example.yms.secondactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    //Activity가 호출시
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(this, "Second Activity onCreate() 호출",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStart(){
        super.onStart();

        Toast.makeText(this, "Second Activity onStart() 호출",Toast.LENGTH_LONG).show();
    }

    //Background 상태에서 Foreground 상태로 전환될시에 호출
    @Override
    protected  void onRestart(){
        super.onRestart();

        Toast.makeText(this, "Second Activity onRestart() 호출",Toast.LENGTH_LONG).show();
    }

    @Override
    protected  void onResume(){
        super.onResume();

        Toast.makeText(this, "Second Activity onResume() 호출",Toast.LENGTH_LONG).show();
    }

    @Override
    protected  void onPause(){
        super.onPause();
        Toast.makeText(this, "Second Activity onPause() 호출",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "Second Activity onStop() 호출",Toast.LENGTH_LONG).show();
    }

    //Activity 종료시
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "Second Activity onDestroy() 호출",Toast.LENGTH_LONG).show();
    }

}
