package com.example.acer.fragement;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class f2 extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_f2, container, false);
        ListView listView = view.findViewById(R.id.ls);
        final ArrayList<String> branch = new ArrayList<String>();
        branch.add("BerkeleyDB");
        branch.add("Couchbase Lite");
        branch.add("LevelDB");
        branch.add("SQLite");
        branch.add("UnQLite");

        final ArrayList<String> description = new ArrayList<String>();
        description.add("Berkeley DB is a family of embedded key-value database libraries providing scalable high-performance data management services to applications.");
        description.add("Couchbase Lite is a document-oriented database: data is stored as JSON documents.");
        description.add("LevelDB is an open-source library (written at Google) that implements a key-value store, where keys and values are byte arrays, and data is stored ordered by key (based on some, probably custom, comparison function).");
        description.add("SQLite is an open-source C library for managing relational databases that can be stored both on disk and in memory.");
        description.add("UnQLite is an open-source database that exposes both a key-value and a document store interface. It supports both in-memory and on-disk databases, transactions, multiple concurrent readers, and cursors for linear traversal.");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,branch);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected_item = branch.get(position);
                int index = branch.indexOf(selected_item);
                String selected_description = description.get(index);
//                Toast.makeText(getActivity(),"Clicked:"+selected_item,Toast.LENGTH_SHORT).show();
                f3 frag_description = new f3();
                Bundle bundle = new Bundle();
                bundle.putString("selected_item",selected_item);
                bundle.putString("selected_description",selected_description);
                frag_description.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.f3,frag_description).commit();
            }
        });
        return view;
    }

}
