package com.example.kris.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by kris on 08/02/17.
 */
public class Second extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        TextView textView=(TextView)findViewById(R.id.tv2);

        Model model= getIntent().getParcelableExtra("key");
        textView.setText(model.name + model.id);
    }
}
