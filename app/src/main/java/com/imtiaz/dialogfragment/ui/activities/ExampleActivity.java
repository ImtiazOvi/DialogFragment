package com.imtiaz.dialogfragment.ui.activities;

import android.os.Bundle;

import com.imtiaz.dialogfragment.R;
import com.imtiaz.dialogfragment.base.BaseActivity;
import com.imtiaz.dialogfragment.ui.fragments.ExampleFragment;

public class ExampleActivity extends BaseActivity {

    @Override
    protected int getContentView() {
        return R.layout.activity_example;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        addFragment(ExampleFragment.newInstance(), "TAG");
    }
}