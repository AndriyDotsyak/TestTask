package com.testtask.screen.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import com.testtask.R;

public class InfoDialog extends DialogFragment implements View.OnClickListener {
    private String KEY_NUMBER = "KEY_NUMBER";

    public static InfoDialog newInstance(String number) {
        InfoDialog frag = new InfoDialog();
        Bundle args = new Bundle();
        args.putString("KEY_NUMBER", number);
        frag.setArguments(args);
        return frag;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_info, null);
        v.findViewById(R.id.button_ok_DI).setOnClickListener(this);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView textInfo = view.findViewById(R.id.text_view_info_DI);
        textInfo.setText(getArguments().getString("KEY_NUMBER", "0"));
    }

    public void onClick(View v) {
        dismiss();
    }
}
