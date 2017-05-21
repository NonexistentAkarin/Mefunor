package com.akari.mefunor.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.akari.mefunor.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ArchiveActivity extends AppCompatActivity {
    private static final String TAG = "ArchiveActivity";

    @Bind(R.id.input_name) EditText _nameText;
    @Bind(R.id.radioGroup) RadioGroup _sexRadio;
    @Bind(R.id.input_weight) EditText _weightText;
    @Bind(R.id.input_height) EditText _heightText;
    @Bind(R.id.input_birthday) EditText _birthdayText;
    @Bind(R.id.input_anamnesis) EditText _anamnesisText;
    @Bind(R.id.btn_save) Button _saveButton;
    @Bind(R.id.btn_cancel) Button _cancelButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archive);
        ButterKnife.bind(this);

        _saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }
        });

        _cancelButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Start the Signup activity
                cancel();
            }
        });
    }

    private void save(){
        String name = _nameText.getText().toString();
        int sexId = _sexRadio.getCheckedRadioButtonId();
        String weight=_weightText.getText().toString();
        String height=_heightText.getText().toString();
        String bithday=_birthdayText.getText().toString();
        String anamnesis=_anamnesisText.getText().toString();

        finish();
    }

    private void cancel(){
        finish();
    }
}
