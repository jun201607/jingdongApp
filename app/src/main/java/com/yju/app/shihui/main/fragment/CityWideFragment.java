package com.yju.app.shihui.main.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yju.app.R;
import com.yju.app.base.BaseFragment;

/**
 * Created by user on 2016/8/23.
 * 同城
 */
public class CityWideFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_citywide, null);
        init();
        return view;
    }

    private void init() {
    }


}
