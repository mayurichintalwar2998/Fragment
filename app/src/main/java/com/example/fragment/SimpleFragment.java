package com.example.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SimpleFragment extends Fragment {
    View view;
    Button firstButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_simple,container,false);

        firstButton =view.findViewById(R.id.firstbutton);

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Fragment's Button", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(view.getContext(),Main2activity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
