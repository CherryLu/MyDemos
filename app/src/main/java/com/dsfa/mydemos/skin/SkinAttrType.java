package com.dsfa.mydemos.skin;

import android.view.View;

/**
 * Created by Android on 2017/7/14.
 */
public enum  SkinAttrType {
    BACKGROUND("background"){
        @Override
        public  void apply(View view, String resName) {

        }

    },SRC("src"){
        @Override
        public  void apply(View view, String resName) {

        }
    },TEXT_COLOR("textcolor"){
        @Override
        public  void apply(View view, String resName) {

        }
    };
    String resType;
    SkinAttrType(String type) {
        resType = type;
    }

    public abstract void apply(View view,String resName);

}
