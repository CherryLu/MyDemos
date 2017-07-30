package com.dsfa.mydemos.tools;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Android on 2017/7/14.
 */
public class SkinChangeUtil {

    private static void getResourceFromAPK(String path, String packName, Context context){
        try {
            AssetManager manager = AssetManager.class.newInstance();
            Method addAssetPath = manager.getClass().getMethod("addAssetPath",String.class);
            addAssetPath.invoke(manager,path);
            Resources currentResources = context.getResources();
            Resources newResources = new Resources(manager,currentResources.getDisplayMetrics(),currentResources.getConfiguration());

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
