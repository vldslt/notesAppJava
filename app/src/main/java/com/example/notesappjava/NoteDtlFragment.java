package com.example.notesappjava;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NoteDtlFragment extends Fragment {
    static final String ARG_INDEX = "index";

    public NoteDtlFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null)
            requireActivity().getSupportFragmentManager().popBackStack();
        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note_dtl, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle saveInstanceState) {
        super.onViewCreated(view, saveInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int index = arguments.getInt(ARG_INDEX);

            TextView tvTitle = view.findViewById(R.id.tvTitle);
            tvTitle.setText(Note.getNotes()[index].getTitle());
            tvTitle.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }
                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Note.getNotes()[index].setTitle(charSequence.toString());
                }
                @Override
                public void afterTextChanged(Editable editable) {}
            });

            TextView tvDescription = view.findViewById(R.id.tvDescription);
            tvDescription.setText(Note.getNotes()[index].getDescription());
        }
    }

    public static NoteDtlFragment newInstance (int index) {
        NoteDtlFragment fragment = new NoteDtlFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_INDEX, index);
        fragment.setArguments(args);
        return fragment;
    }
}