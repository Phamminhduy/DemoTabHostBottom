package com.example.phamm.demobottomtabhost;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by phamm on 7/30/2017.
 */

public class Tab1 extends ListFragment {
    String[] arr = {"Android","Java","Nodejs","JS","UNITY"};
    ArrayAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        adapter = new ArrayAdapter(getActivity(),R.layout.support_simple_spinner_dropdown_item,arr);
        setListAdapter(adapter);
        return inflater.inflate(R.layout.tab1,container,false);
    }
}
