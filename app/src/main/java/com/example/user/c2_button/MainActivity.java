//20170114 劉彥廷
//practice Button 功能!
package com.example.user.c2_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sayHi(View v) {
        EditText name =(EditText)findViewById(R.id.name);
        TextView txv =(TextView)findViewById(R.id.txv);
        txv.setTextSize(30);
        txv.setText(name.getText().toString() + "你好,謝謝你幫我測試");
    }

    int size =30;
    public void bigger(View v){
        TextView txv = (TextView)findViewById(R.id.txv);
        txv.setTextSize(++size);
    }
}


