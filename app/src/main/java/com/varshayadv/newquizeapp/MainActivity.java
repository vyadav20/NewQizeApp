package com.varshayadv.newquizeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text;
    CheckBox optionOne, optionTwo, optionOneForSecond, optionTwoForSecond, radioone, radiotwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText) findViewById(R.id.edit_text);
        String hastext = text.getText().toString();

        optionOne = (CheckBox) findViewById(R.id.first_question_option1);
        optionTwo = (CheckBox) findViewById(R.id.first_question_option2);

        optionOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (optionOne.isChecked()) {
                    optionTwo.setChecked(false);
                }
            }
        });

        optionTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (optionTwo.isChecked()) {
                    optionOne.setChecked(false);
                }
            }
        });

        optionOneForSecond = (CheckBox) findViewById(R.id.second_question_option1);
        optionTwoForSecond = (CheckBox) findViewById(R.id.second_question_option2);

        optionOneForSecond.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (optionOneForSecond.isChecked()) {
                    optionTwoForSecond.setChecked(false);
                }
            }
        });

        optionTwoForSecond.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (optionTwoForSecond.isChecked()) {
                    optionOneForSecond.setChecked(false);
                }
            }
        });


    }

    public void editanswer(View view) {
        String hastext = String.valueOf(text.getText());
        String msg = checkans(hastext);
        editans(msg);
    }

    private String checkans(String addtext) {
        String msg = " ";
        if (addtext.equals("abc")) {
            msg = "right";
        } else {
            msg = "wrong";
        }
        return msg;
    }

    private void editans(String ans) {
        TextView text = (TextView) findViewById(R.id.edit_answer);
        text.setText(ans);
    }

    public void TheAnswer(View View) {

        boolean hasoptionOne = optionOne.isChecked();
        boolean hasoptionTwo = optionTwo.isChecked();

        String ansMsg = andAnswer(hasoptionOne, hasoptionTwo);
        firstQuestion(ansMsg);
    }

    private String andAnswer(boolean aoptionOne, boolean aoptionTwo) {
        String msg = "";
        if ((aoptionOne)) {
            msg = "wrong";
        }
        if ((aoptionTwo)) {
            msg = "Right";
        }
        return msg;
    }

    private void firstQuestion(String ans) {
        TextView firstQuestionTextView = (TextView) findViewById(R.id.first_question);
        firstQuestionTextView.setText(ans);
    }

    public void TheAnswerSecond(View view) {
        boolean hasoptionOneForSecond = optionOneForSecond.isChecked();
        boolean hasoptionTwoForSecond = optionTwoForSecond.isChecked();

        String ansMsgSecond = andAnswerTwo(hasoptionOneForSecond, hasoptionTwoForSecond);
        secondQuestion(ansMsgSecond);
    }

    private String andAnswerTwo(boolean aoptionOneForSecond, boolean aoptionTwoForSecond) {
        String msgSecond = "";
        if ((aoptionOneForSecond)) {
            msgSecond = "Right";
        }
        if ((aoptionTwoForSecond)) {
            msgSecond = "Wrong";
        }
        return msgSecond;
    }

    private void secondQuestion(String ansSecond) {
        TextView secondQuestionTextView = (TextView) findViewById(R.id.second_question);
        secondQuestionTextView.setText(ansSecond);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_one:
                if (checked)
                    break;
            case R.id.radio_two:
                if (checked)
                    break;
        }
    }

    public void RadioButton(View View) {

        boolean hasradioone = radioone.isChecked();
        boolean hasradiotwo = radiotwo.isChecked();

        String ansMsg = bAnswer(hasradioone, hasradiotwo);
        radioquestion(ansMsg);
    }

    private String bAnswer(boolean aradioone, boolean aradiotwo) {
        String msg = "";
        if ((aradioone)) {
            msg = "wrong";
        }
        if ((aradiotwo)) {
            msg = "Right";
        }
        return msg;
    }

    private void radioquestion(String ans) {
        TextView firstQuestionTextView = (TextView) findViewById(R.id.first_question);
        firstQuestionTextView.setText(ans);
    }


}