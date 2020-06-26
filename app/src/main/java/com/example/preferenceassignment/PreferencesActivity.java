package com.example.preferenceassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.example.preferenceassignment.R;

public class PreferencesActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private Button appPref, matchPrefBtn;
    private LinearLayout agegenderPreferences;
    private ScrollView scrollView_preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);
        toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        appPref = findViewById(R.id.AppPrefBtn);
        matchPrefBtn = findViewById(R.id.MatchPrefBtn);
        agegenderPreferences = findViewById(R.id.agegenderPreferences);
        scrollView_preferences = findViewById(R.id.scrollView_preferences);
        appPref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agegenderPreferences.setVisibility(View.GONE);
                scrollView_preferences.setVisibility(View.VISIBLE);
                appPref.setBackground(getResources().getDrawable(R.drawable.tablike_button_border));
                matchPrefBtn.setBackground(getResources().getDrawable(R.drawable.tablike_buttton_border_white));
            }
        });
        matchPrefBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agegenderPreferences.setVisibility(View.VISIBLE);
                scrollView_preferences.setVisibility(View.GONE);
                appPref.setBackground(getResources().getDrawable(R.drawable.tablike_buttton_border_white));
                matchPrefBtn.setBackground(getResources().getDrawable(R.drawable.tablike_button_border));

            }
        });

    }
}