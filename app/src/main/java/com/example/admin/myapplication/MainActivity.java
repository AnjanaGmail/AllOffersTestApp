package com.example.admin.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.bindview.BindView;


public class MainActivity extends AppCompatActivity {

    Typeface fontIcons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //toolbar.setTitle(R.string.);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);
        fontIcons = Typeface.createFromAsset(this.getAssets(), "HelveticaNeueLTPro-Bd.ttf");

        TextView leftIcon = (TextView) findViewById(R.id.tvLeft);
        leftIcon.setTypeface(fontIcons);
        TextView rightIcon = (TextView) findViewById(R.id.tvRightOne);
        rightIcon.setTypeface(fontIcons);
        TextView title = (TextView) findViewById(R.id.tvToolbarTitle);
        title.setText("Title");
    }
}
