package com.aserbao.aserbaosandroid.algorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aserbao.aserbaosandroid.algorithm.list.AboutListSortActivty;
import com.aserbao.aserbaosandroid.base.BaseActivity;
import com.aserbao.aserbaosandroid.base.beans.ClassBean;

public class AlgorithmActivity extends BaseActivity {

    @Override
    public void initGetData() {
        mClassBeen.add(new ClassBean("List排序算法", AboutListSortActivty.class));
    }
}
