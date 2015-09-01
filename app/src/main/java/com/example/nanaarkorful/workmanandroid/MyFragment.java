package com.example.nanaarkorful.workmanandroid;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Nana.Arkorful on 8/31/2015.
 */
public class MyFragment extends android.support.v4.app.Fragment {

    private TextView tView;

    public static MyFragment getInstance(int position){
        MyFragment myFragment = new MyFragment();
        Bundle args = new Bundle();
        args.putInt("Position", position);
        myFragment.setArguments(args);
        return myFragment;
    }
}
