package com.mega.constraintdesign.bottomsheetdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.mega.constraintdesign.R;

public class BottomSheetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet);


        Button extendedBottomSheet = findViewById(R.id.extended_bottom_sheet);
        Button openBottomSheet = findViewById(R.id.open_bottom_sheet);
        Button bottomSheetBtn = findViewById(R.id.bottom_sheet_class);


        extendedBottomSheet.setOnClickListener(view -> {
            CustomBottomSheet customBottomSheet = new CustomBottomSheet(BottomSheetActivity.this);
            customBottomSheet.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            customBottomSheet.show();


        });

        openBottomSheet.setOnClickListener(
                v -> {
                    BottomSheetFragment bottomSheet = new BottomSheetFragment();
                    bottomSheet.show(getSupportFragmentManager(),
                            "ModalBottomSheet");
                });
        bottomSheetBtn.setOnClickListener(view -> {
            final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(BottomSheetActivity.this);
            bottomSheetDialog.setContentView(R.layout.bottom_sheet_via_class);
            bottomSheetDialog.show();
        });
    }
}