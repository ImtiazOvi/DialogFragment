package com.imtiaz.dialogfragment.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.fragment.app.DialogFragment;

import com.imtiaz.dialogfragment.R;

import java.util.Objects;

public class ExampleDialog extends DialogFragment {

    // Fields ======================================================================================
    private View view;
    private Context mContext;
    private ImageView imgCloseButton;

    //  ============================================================================================

    public static ExampleDialog newInstance() {
        Bundle args = new Bundle();
        ExampleDialog dialog = new ExampleDialog();
        dialog.setArguments(args);
        return dialog;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE, android.R.style.Theme_Translucent);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // inflate the layout for this fragment
        view = inflater.inflate(R.layout.dialog_example, container, false);
        mContext = Objects.requireNonNull(getActivity()).getApplicationContext();
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        init();
        return view;
    }

    public void init() {
        imgCloseButton = view.findViewById(R.id.img_button_close);

        imgCloseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }
}
