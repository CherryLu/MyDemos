package com.dsfa.mydemos.skin;

import android.view.View;

/**
 * Created by Android on 2017/7/14.
 */
public class SkinAttr {
    private String resName;
    private SkinAttrType attrType;

    public void apply(View view) {
    attrType.apply(view,resName);
    }
}
