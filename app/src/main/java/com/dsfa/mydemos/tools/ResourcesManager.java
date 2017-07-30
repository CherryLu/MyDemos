package com.dsfa.mydemos.tools;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/**
 * Created by Android on 2017/7/14.
 */
public class ResourcesManager {
    private Resources resources;
    private String pkgName;

    public ResourcesManager(Resources resources, String pkgName) {
        this.resources = resources;
        this.pkgName = pkgName;
    }

    /**
     * 获取资源包中图片
     * @param name
     * @return
     */
    private Drawable getDrawable(String name){
        try {
            return resources.getDrawable(resources.getIdentifier(name,"drawable",pkgName));
        }catch (Exception e){
            return null;
        }
    }


    private ColorStateList getColorStateList(String name){
        try {
            return resources.getColorStateList(resources.getIdentifier(name,"drawable",pkgName));
        }catch (Exception e){
            return null;
        }
    }
}
