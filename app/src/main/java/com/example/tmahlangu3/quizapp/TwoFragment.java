package com.example.tmahlangu3.quizapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by TMahlangu3 on 23/02/2018.
 */

public class TwoFragment extends Fragment {
    Button button;
    public TwoFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_two,container,false);
        button=(Button)view.findViewById(R.id.buttonOnTwo);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Testing",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
