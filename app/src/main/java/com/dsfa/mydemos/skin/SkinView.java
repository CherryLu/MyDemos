package com.dsfa.mydemos.skin;

import android.view.View;

import java.util.List;

/**
 * Created by Android on 2017/7/14.
 */
public class SkinView {
    private View view;
    private List<SkinAttr> skinAttrs;

    public void apply(){
        for (SkinAttr attr:skinAttrs){
            attr.apply(view);
        }
    }
}
