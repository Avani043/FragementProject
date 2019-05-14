package com.example.acer.fragement;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class f3 extends Fragment {
    TextView text;
    TextView description;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_f3, container, false);
        text = view.findViewById(R.id.t);
        description = view.findViewById(R.id.des);
        Bundle bundle = getArguments();
        if(bundle!=null){
            if(bundle.getString("selected_item")!=null){
                text.setText(bundle.getString("selected_item"));
            }
            if(bundle.getString("selected_description")!=null){
                description.setText(bundle.getString("selected_description"));
            }
        }
        return view;
    }
}
