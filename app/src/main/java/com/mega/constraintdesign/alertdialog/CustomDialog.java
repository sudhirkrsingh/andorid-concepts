package com.mega.constraintdesign.alertdialog;

import android.app.Activity;
import android.app.Dialog;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.mega.constraintdesign.R;

public class CustomDialog extends Dialog implements android.view.View.OnClickListener {
    Activity activity;
    Button btnYes;
    Button btnNo;

    public CustomDialog(Activity activity) {
        super(activity);
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
        btnYes = (Button) findViewById(R.id.btn_yes);
        btnNo = (Button) findViewById(R.id.btn_no);
        btnYes.setOnClickListener(this);
        btnNo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_yes:
                activity.finish();
                break;
            case R.id.btn_no:
                dismiss();
                break;
            default:
                break;
        }
        dismiss();
    }
}


