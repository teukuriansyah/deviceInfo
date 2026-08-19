package com.testing.plugins.deviceinfo;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
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
}
