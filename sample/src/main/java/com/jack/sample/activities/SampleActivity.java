package com.jack.sample.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jack.sample.R;
import com.jack.sample.models.Sample;

public class SampleActivity extends AppCompatActivity {

    Sample sample = new Sample("sample");

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sample);

        setTitle();
    }

    private void setTitle() {
        TextView title = findViewById(R.id.title);
        title.setText(sample.getSample());
    }
}
