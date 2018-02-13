package com.example.android.historyquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Radio Group for each box
    RadioGroup rg1;
    RadioGroup rg2;
    RadioGroup rg3;
    RadioGroup rg4;
    RadioGroup rg5;

    // Value for correct questions
    int quantityCorrect = 0;

    // Correct Radio Buttons
    RadioButton correctButton1;
    RadioButton correctButton2;
    RadioButton correctButton3;
    RadioButton correctButton4;
    RadioButton correctButton5;

    //Correct Checkbox Items
    CheckBox virginia;
    CheckBox massachusetts;
    CheckBox georgia;
    CheckBox michigan;
    CheckBox idaho;
    CheckBox texas;
    CheckBox california;

    // EditText box for question 7
    EditText questionSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * What to do when a correct radio button is clicked
     **/
    public void onRadioButtonClicked(View view) {

        // Correct RadioButton Answers
        correctButton1 = (RadioButton) findViewById(R.id.correctAnswer_1);
        if (correctButton1.isChecked()) {
            quantityCorrect = quantityCorrect + 1;
            return;
        }
        correctButton2 = (RadioButton) findViewById(R.id.correctAnswer_2);
        if (correctButton2.isChecked()) {
            quantityCorrect += 1;
            return;
        }
        correctButton3 = (RadioButton) findViewById(R.id.correctAnswer_3);
        if (correctButton3.isChecked()) {
            quantityCorrect += 1;
            return;
        }
        correctButton4 = (RadioButton) findViewById(R.id.correctAnswer_4);
        if (correctButton4.isChecked()) {
            quantityCorrect += 1;
            return;
        }
        correctButton5 = (RadioButton) findViewById(R.id.correctAnswer_5);
        if (correctButton5.isChecked()) {
            quantityCorrect += 1;
        }
    }

    /**
     * How to retrieve a HINT for each question
     **/

    // Applies a toast to each hint button
    public void toastHintOne(View view) {
        Toast hintOneToast = Toast.makeText(MainActivity.this,
                "\"He is on the $50 dollar bill\"", Toast.LENGTH_LONG);
        hintOneToast.show();
    }

    public void toastHintTwo(View view) {
        Toast hintTwoToast = Toast.makeText(MainActivity.this,
                "\"Napoleon Bonaparte\"", Toast.LENGTH_LONG);
        hintTwoToast.show();
    }

    public void toastHintThree(View view) {
        Toast hintThreeToast = Toast.makeText(MainActivity.this,
                "\"Can I get your signature please?\"", Toast.LENGTH_LONG);
        hintThreeToast.show();
    }

    public void toastHintFour(View view) {
        Toast hintFourToast = Toast.makeText(MainActivity.this,
                "\"The Golden Dollar Coin\"", Toast.LENGTH_LONG);
        hintFourToast.show();
    }

    public void toastHintFive(View view) {
        Toast hintFiveToast = Toast.makeText(MainActivity.this,
                "\"The day after the \'Day of Infamy\'\"", Toast.LENGTH_LONG);
        hintFiveToast.show();
    }

    public void toastHintSix(View view) {
        Toast hintSixToast = Toast.makeText(MainActivity.this,
                "\"GA, MA, VA\"", Toast.LENGTH_LONG);
        hintSixToast.show();
    }

    public void toastHintSeven(View view) {
        Toast hintSevenToast = Toast.makeText(MainActivity.this,
                "\"The 16th President of the United States\"", Toast.LENGTH_LONG);
        hintSevenToast.show();
    }

    /**
     * What to do when correct checkbox is checked for question 7
     */
    public void onCheckBoxSelection(View view) {
        virginia = (CheckBox) findViewById(R.id.virginia);
        massachusetts = (CheckBox) findViewById(R.id.massachusetts);
        georgia = (CheckBox) findViewById(R.id.georgia);
        if (virginia.isChecked() && massachusetts.isChecked() && georgia.isChecked()) {
            quantityCorrect += 1;
        }
    }

    /**
     * Checking the result using the submit button
     **/
    public void checkResult(View view) {

        Button submitButton = (Button) findViewById(R.id.submit_button);

        // Checks if "Abraham Lincoln" is the correct answer
        String correctAnswer = "Abraham Lincoln";
        questionSeven = (EditText) findViewById(R.id.questionSeven);
        if (questionSeven.getText().toString().trim().equalsIgnoreCase(correctAnswer)) {
            quantityCorrect += 1;
        }

        Toast.makeText(MainActivity.this, "Quiz Complete! \nYou answered " + quantityCorrect +
                "/7 questions correct!", Toast.LENGTH_LONG)
                .show();

        // Make submit button disabled until quiz is reset
        submitButton.setEnabled(false);

    }

    /**
     * Reset All Questions
     */
    public void resetAll(View view) {

        Button submitButton = (Button) findViewById(R.id.submit_button);

        // Reset submit button to start quiz over
        submitButton.setEnabled(true);

        virginia = (CheckBox) findViewById(R.id.virginia);
        massachusetts = (CheckBox) findViewById(R.id.massachusetts);
        georgia = (CheckBox) findViewById(R.id.georgia);
        michigan = (CheckBox) findViewById(R.id.michigan);
        idaho = (CheckBox) findViewById(R.id.idaho);
        california = (CheckBox) findViewById(R.id.california);
        texas = (CheckBox) findViewById(R.id.texas);

        // EditText field to be cleared
        questionSeven = (EditText) findViewById(R.id.questionSeven);
        questionSeven.setText("");

        // All Checkboxes cleared
        if (massachusetts.isChecked() || !massachusetts.isChecked()) {
            massachusetts.setChecked(false);
        }
        if (virginia.isChecked() || !virginia.isChecked()) {
            virginia.setChecked(false);
        }
        if (georgia.isChecked() || !georgia.isChecked()) {
            georgia.setChecked(false);
        }
        if (michigan.isChecked() || !michigan.isChecked()) {
            michigan.setChecked(false);
        }
        if (idaho.isChecked() || !idaho.isChecked()) {
            idaho.setChecked(false);
        }
        if (california.isChecked() || !california.isChecked()) {
            california.setChecked(false);
        }
        if (texas.isChecked() || !texas.isChecked()) {
            texas.setChecked(false);
        }

        // Each RadioGroup will be reset
        rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
        rg1.clearCheck();

        rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
        rg2.clearCheck();

        rg3 = (RadioGroup) findViewById(R.id.radioGroup3);
        rg3.clearCheck();

        rg4 = (RadioGroup) findViewById(R.id.radioGroup4);
        rg4.clearCheck();

        rg5 = (RadioGroup) findViewById(R.id.radioGroup5);
        rg5.clearCheck();

        // Quantity value cleared
        quantityCorrect = 0;
    }
}


