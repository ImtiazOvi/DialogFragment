package com.imtiaz.dialogfragment.base;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.LayoutRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.imtiaz.dialogfragment.R;

import butterknife.ButterKnife;


public abstract class BaseActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        init(savedInstanceState);
    }

    @LayoutRes
    protected abstract int getContentView();
    protected abstract void init(Bundle savedInstanceState);
    protected void addFragment(Fragment fragment, String tag){
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment, tag)
                    .addToBackStack(null)
                    .commit();
        }
    }

    @Override
    public void finish() {
        super.finish();
    }
}
