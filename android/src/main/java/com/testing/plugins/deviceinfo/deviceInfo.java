package com.testing.plugins.deviceinfo;

import com.getcapacitor.Logger;

public class deviceInfo {

    public String echo(String value) {
        Logger.info("Echo", value);
        return value;
    }
}
