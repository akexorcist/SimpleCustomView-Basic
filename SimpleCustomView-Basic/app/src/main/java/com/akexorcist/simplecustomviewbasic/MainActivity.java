package com.akexorcist.simplecustomviewbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements InfoCardView.InfoClickListener {
    private InfoCardView icvAndroidNougat;
    private InfoCardView icvAndroidMarshmallow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        setupView();
    }

    private void bindView() {
        icvAndroidNougat = (InfoCardView) findViewById(R.id.icv_android_nougat);
        icvAndroidMarshmallow = (InfoCardView) findViewById(R.id.icv_android_marshmallow);
    }

    private void setupView() {
        icvAndroidNougat.setInfoClickListener(this);
    }

    @Override
    public void onTitleClick() {
        // Do something when title was clicked
    }

    @Override
    public void onContentClick() {
        // Do something when content was clicked
    }
}
