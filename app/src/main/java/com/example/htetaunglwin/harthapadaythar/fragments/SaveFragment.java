package com.example.htetaunglwin.harthapadaythar.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.htetaunglwin.harthapadaythar.R;

/**
 * Created by Htet Aung Lwin on 24-Jun-16.
 */
public class SaveFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_save,container,false);
        return view;
    }
}
