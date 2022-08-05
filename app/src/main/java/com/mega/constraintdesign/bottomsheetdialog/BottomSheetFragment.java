package com.mega.constraintdesign.bottomsheetdialog;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.mega.constraintdesign.R;

public class BottomSheetFragment extends BottomSheetDialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_bottom_sheet, container, false);

        Button algoButton = view.findViewById(R.id.algo_button);
        Button courseButton = view.findViewById(R.id.course_button);

        algoButton.setOnClickListener(v -> {
            Toast.makeText(getActivity(),
                    "Algorithm Shared", Toast.LENGTH_SHORT)
                    .show();
            dismiss();
        });

        courseButton.setOnClickListener(v -> {
            Toast.makeText(getActivity(),
                    "Course Shared", Toast.LENGTH_SHORT)
                    .show();
            dismiss();
        });

        return view;
    }
}