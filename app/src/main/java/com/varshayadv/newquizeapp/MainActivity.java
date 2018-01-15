package com.varshayadv.newquizeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText) findViewById(R.id.edit_text);
        String hastext = text.getText().toString();

        

    }
    public void editanswer(View view){
        String hastext= String.valueOf(text.getText());
        String msg=checkans(hastext);
        editans(msg);
    }

    private String checkans(String addtext){
        String msg=" ";
        if(addtext== "abs"){
            msg ="right";}
        else{msg="wrong";}
        return msg;
    }

    private void editans(String ans){
        TextView text = (TextView) findViewById(R.id.edit_answer);
        text.setText(ans);
    }


}