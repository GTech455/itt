package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends ListActivity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        String[] lt = {
        "4455",
        };
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lt));
    }
}
