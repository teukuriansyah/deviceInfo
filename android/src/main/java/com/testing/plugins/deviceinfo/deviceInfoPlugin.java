package com.testing.plugins.deviceinfo;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowMetrics;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "deviceInfo")
public class deviceInfoPlugin extends Plugin {

    // Manufacturer
    @PluginMethod
    public void deviceInfoManufacture(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("manufacture", Build.MANUFACTURER);
        call.resolve(ret);
    }

    // Brand
    @PluginMethod
    public void deviceInfoBrand(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("brand", Build.BRAND);
        call.resolve(ret);
    }

    // Model
    @PluginMethod
    public void deviceInfoModel(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("model", Build.MODEL);
        call.resolve(ret);
    }

    // Board
    @PluginMethod
    public void deviceInfoBoard(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("board", Build.BOARD);
        call.resolve(ret);
    }

    // Hardware
    @PluginMethod
    public void deviceInfoHardware(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("hardware", Build.HARDWARE);
        call.resolve(ret);
    }

    // OS Version
    @PluginMethod
    public void deviceInfoOSVersion(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("osVersion", Build.VERSION.RELEASE);
        call.resolve(ret);
    }

    // Width
    @PluginMethod
    public void deviceWidth(PluginCall call) {
        int width;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            WindowMetrics windowMetrics = getActivity().getWindowManager().getCurrentWindowMetrics();
            width = windowMetrics.getBounds().width();
        } else {
            DisplayMetrics metrics = new DisplayMetrics();
            getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);
            width = metrics.widthPixels;
        }

        JSObject ret = new JSObject();
        ret.put("width", width);
        call.resolve(ret);
    }

    // Height
    @PluginMethod
    public void deviceHeight(PluginCall call) {
        int height;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            WindowMetrics windowMetrics = getActivity().getWindowManager().getCurrentWindowMetrics();
            height = windowMetrics.getBounds().height();
        } else {
            DisplayMetrics metrics = new DisplayMetrics();
            getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);
            height = metrics.heightPixels;
        }

        JSObject ret = new JSObject();
        ret.put("height", height);
        call.resolve(ret);
    }

    // Density DPI
    @PluginMethod
    public void deviceDensity(PluginCall call) {
        DisplayMetrics metrics = getContext().getResources().getDisplayMetrics();

        JSObject ret = new JSObject();
        ret.put("density", metrics.densityDpi);
        call.resolve(ret);
    }

    // Total RAM
    @PluginMethod
    public void deviceTotalRam(PluginCall call) {
        ActivityManager actManager = (ActivityManager) getContext().getSystemService(Context.ACTIVITY_SERVICE);
        ActivityManager.MemoryInfo memInfo = new ActivityManager.MemoryInfo();
        
        if (actManager != null) {
            actManager.getMemoryInfo(memInfo);
        }

        JSObject ret = new JSObject();
        ret.put("totalRam", memInfo.totalMem);
        call.resolve(ret);
    }

    // Free RAM
    @PluginMethod
    public void deviceAvailableRam(PluginCall call) {
        ActivityManager actManager = (ActivityManager) getContext().getSystemService(Context.ACTIVITY_SERVICE);
        ActivityManager.MemoryInfo memInfo = new ActivityManager.MemoryInfo();

        if (actManager != null) {
            actManager.getMemoryInfo(memInfo);
        }

        JSObject ret = new JSObject();
        ret.put("availableRam", memInfo.availMem);
        call.resolve(ret);
    }
}
