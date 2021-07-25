package com.example.notes_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DescriptionOfNotesFragment extends Fragment {

    public DescriptionOfNotesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_description_of_notes, container, false);
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initList(view);
    }



    private void initList(View view) {
        LinearLayout linearLayout = (LinearLayout)view;
        String[] list_of_notes = getResources().getStringArray(R.array.list_of_notes);
        for (int i = 0; i < list_of_notes.length; i++) {
            TextView textView = new TextView(getContext());
            textView.setText(list_of_notes[i]);
            textView.setTextSize(30);
            final int finalIndex = i;
            textView.setOnClickListener(v -> {
                showDescriptionOfNotes(finalIndex);
            });
            linearLayout.addView(textView);
        } {

        }


    }

    private void showDescriptionOfNotes(int index) {
        Intent intent = new Intent();
        intent.setClass(getActivity(),DescriptionActivity.class);
        intent.putExtra(DescriptionFragment.ARG_PARAM_INDEX,index);
        startActivity(intent);
    }


}