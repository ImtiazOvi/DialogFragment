package com.imtiaz.dialogfragment.ui.fragments;

import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.imtiaz.dialogfragment.dialog.ExampleDialog;
import com.imtiaz.dialogfragment.R;
import com.imtiaz.dialogfragment.base.BaseFragment;

import butterknife.OnClick;

public class ExampleFragment extends BaseFragment {

    private Button btnShowDialog;

    public static ExampleFragment newInstance() {
        Bundle args = new Bundle();
        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getContentView() {
        return R.layout.fragment_example;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        btnShowDialog = (Button) findViewById(R.id.btn_show_dialog);
        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDummyDialog();

            }
        });
    }

    // show dummy dialog
    public void showDummyDialog() {
        // show popup and next button
        assert getFragmentManager() != null;
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        final ExampleDialog dialog = ExampleDialog.newInstance();
        // optionally pass arguments to the dialog fragment
        Bundle args = new Bundle();
        dialog.setArguments(args);
        // setup link back to use and display
        dialog.setTargetFragment(this, 1);
        dialog.show(fragmentTransaction, "dialog_dummy");

    }
}
