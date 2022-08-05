package com.mega.constraintdesign;

import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class PurchaseConfirmationDialogFragment extends DialogFragment {

    private static final String TAG = "PurchaseConfirmationDialog";

    public static String getTAG() {
        return TAG;
    }

    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder(requireContext())
                .setMessage(getString(R.string.order_confirmation))
                .setPositiveButton(getString(R.string.ok), (dialog, which) -> {} )
                .create();
    }


}