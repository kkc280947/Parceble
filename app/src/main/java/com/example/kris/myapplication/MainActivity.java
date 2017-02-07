package com.example.kris.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.tvtext);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,Second.class);
        Model model=new Model("krishna",78);
       // Bundle bundle=new Bundle();
        Bundle mBundle = new Bundle();
        mBundle.putParcelable("key", model);
        intent.putExtras(mBundle);
        //intent.putExtra("key",model);
        startActivity(intent);
    }
}
