package com.zjgsu.fragmentdemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.zjgsu.fragmentdemo.R;

/*
 *  项目名:    FragmentDemo
 *  包名:      com.zjgsu.fragmentdemo.fragment
 *  文件名:    CenterFragment
 *  创建者:    Geely
 *  创建时间:  2020/10/3 20:45
 *  描述:      Desp
 */
public class CenterFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_center, container, false);
        return view;
    }
}
