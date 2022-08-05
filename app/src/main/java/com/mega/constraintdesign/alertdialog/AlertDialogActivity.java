package com.mega.constraintdesign.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;

import com.mega.constraintdesign.R;

public class AlertDialogActivity extends AppCompatActivity {

    Button exit;
    Button fragDialog;
    Button extendDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        exit=findViewById(R.id.exit);
        fragDialog=findViewById(R.id.frag_dialog);
        extendDialog=findViewById(R.id.extend);

        extendDialog.setOnClickListener(view -> {
            CustomDialog customDialog = new CustomDialog(AlertDialogActivity.this);
            customDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            customDialog.show();
        });

        fragDialog.setOnClickListener(view -> {
            DialogFragment dialogFragment=new DialogFragment();
            dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
        });
        exit.setOnClickListener(view -> new AlertDialog.Builder(AlertDialogActivity.this)
                .setIcon(R.drawable.crisis_alert)
                .setTitle("Exit")
                .setMessage("are you sure do you want exit to the app")
                .setPositiveButton("Yes", (dialogInterface, i) -> finish()).setNeutralButton("Help", (dialogInterface, i) -> new AlertDialog.Builder(AlertDialogActivity.this)
                        .setTitle("This for exit")
                        .setMessage("Either You can use this app or you can exit from app")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }).show()).setNegativeButton("No", (dialogInterface, i) -> dialogInterface.dismiss()).show());
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(AlertDialogActivity.this)
                .setIcon(R.drawable.crisis_alert)
                .setTitle("Exit")
                .setMessage("are you sure do you want exit to the app")
                .setPositiveButton("Yes", (dialogInterface, i) -> finish()).setNeutralButton("Help", (dialogInterface, i) -> new AlertDialog.Builder(AlertDialogActivity.this)
                .setTitle("This for exit")
                .setMessage("Either You can use this app or you can exit from app")
                .setPositiveButton("OK", (dialogInterface1, i1) -> dialogInterface1.dismiss()).show()).setNegativeButton("No", (dialogInterface, i) -> dialogInterface.dismiss()).show();
    }
}