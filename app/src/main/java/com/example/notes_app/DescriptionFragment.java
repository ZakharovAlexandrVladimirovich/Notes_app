package com.example.notes_app;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class DescriptionFragment extends Fragment {

    public static final String ARG_PARAM_INDEX = "index";

    private int index;

    public DescriptionFragment() {

    }


    public static DescriptionFragment newInstance(int index) {
        DescriptionFragment fragment = new DescriptionFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM_INDEX, index);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_PARAM_INDEX);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_description, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initDescription(view);


    }

    private void initDescription(View view) {
        TextView textView = view.findViewById(R.id.description);
        String[] description_of_notes = getResources().getStringArray(R.array.description_of_notes);
        for (String description_of_note : description_of_notes) {
            textView.setText(description_of_note);

        }




    }
}