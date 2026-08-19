package com.testing.plugins.deviceinfo;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import android.util.DisplayMetrics;
import android.app.ActivityManager;
import android.view.WindowManager;
import com.getcapacitor.annotation.CapacitorPlugin;
import android.os.Build;

@CapacitorPlugin(name = "deviceInfo")
public class deviceInfoPlugin extends Plugin {

  //Manufacture
  @PluginMethod
  public void deviceInfoManufacture(PluginCall call) {
    String manufacturer = Build.MANUFACTURER;

    JSObject ret = new JSObject();
    ret.put("manufacture",manufacturer);
    call.resolve(ret);
  }

  //Brand
  @PluginMethod
  public void deviceInfoBrand(PluginCall call) {
    String brand = Build.BRAND;

    JSObject ret = new JSObject();
    ret.put("brand",brand);
    call.resolve(ret);
  }
  
  //Model
  @PluginMethod
  public void deviceInfoModel(PluginCall call) {
    String model = Build.Model;

    JSObject ret = new JSObject();
    ret.put("model",model);
    call.resolve(ret);
  }
  
  //Board
  @PluginMethod
  public void deviceInfoBoard(PluginCall call) {
    String board = Build.BOARD;

    JSObject ret = new JSObject();
    ret.put("board",board);
    call.resolve(ret);
  }
  
  //Hardware
  @PluginMethod
  public void deviceInfoHardware(PluginCall call) {
    String hardware = Build.HARDWARE;

    JSObject ret = new JSObject();
    ret.put("hardware",hardware);
    call.resolve(ret);
  }
  
  //OS Version
  @PluginMethod
  public void deviceInfoOSVersion(PluginCall call) {
    String width = Build.VERSION.RELEASE;

    JSObject ret = new JSObject();
    ret.put("osVersion",osVersion);
    call.resolve(ret);
  }
  
  //Width
  @PluginMethod
  public void deviceWidth(PluginCall call) {
    DisplayMetrics metrics = new DisplayMetrics();
getWindowManager().getDefaultDisplay().getMetrics(metrics);

    int width = metrics.widthPixels;

    JSObject ret = new JSObject();
    ret.put("width",width);
    call.resolve(ret);
  }
  
  //Height
  @PluginMethod
  public void deviceHeight(PluginCall call) {
    DisplayMetrics metrics = new DisplayMetrics();
getWindowManager().getDefaultDisplay().getMetrics(metrics);

    int height = metrics.heightPixels;

    JSObject ret = new JSObject();
    ret.put("height",height);
    call.resolve(ret);
  }
  
  //Density DPI
  @PluginMethod
  public void deviceDensity(PluginCall call) {
    DisplayMetrics metrics = new DisplayMetrics();
getWindowManager().getDefaultDisplay().getMetrics(metrics);

    int density = metrics.densityDpi;

    JSObject ret = new JSObject();
    ret.put("density",density);
    call.resolve(ret);
  }
  
  //Total RAM
  @PluginMethod
  public void deviceTotalRam(PluginCall call) {
     ActivityManager actManager = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
ActivityManager.MemoryInfo memInfo = new ActivityManager.MemoryInfo();
actManager.getMemoryInfo(memInfo);

     long totalRAM = memInfo.totalMem;  // Total RAM in bytes
    
    JSObject ret = new JSObject();
    ret.put("totalRam",totalRam);
    call.resolve(ret);
  }
  
  //Free RAM
  @PluginMethod
  public void deviceAvailableRam(PluginCall call) {
     ActivityManager actManager = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
ActivityManager.MemoryInfo memInfo = new ActivityManager.MemoryInfo();
actManager.getMemoryInfo(memInfo);

    long availableRam = memInfo.availMem;
    
    JSObject ret = new JSObject();
    ret.put("availableRam",availableRam);
    call.resolve(ret);
  }
}
