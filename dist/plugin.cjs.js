'use strict';

var core = require('@capacitor/core');

const deviceInfo = core.registerPlugin('deviceInfo', {
    web: () => Promise.resolve().then(function () { return web; }).then((m) => new m.deviceInfoWeb()),
});

class deviceInfoWeb extends core.WebPlugin {
    async deviceInfoManufacture() {
        throw new Error("This plugin not compatible for web");
    }
    async deviceInfoBrand() {
        throw new Error("This plugin not compatible for web");
    }
    async deviceInfoModel() {
        throw new Error("This plugin not compatible for web");
    }
    async deviceInfoBoard() {
        throw new Error("This plugin not compatible for web");
    }
    async deviceInfoHardware() {
        throw new Error("This plugin not compatible for web");
    }
    async deviceInfoOSVersion() {
        throw new Error("This plugin not compatible for web");
    }
    async deviceWidth() {
        throw new Error("This plugin not compatible for web");
    }
    async deviceHeight() {
        throw new Error("This plugin not compatible for web");
    }
    async deviceDensity() {
        throw new Error("This plugin not compatible for web");
    }
    async deviceTotalRam() {
        throw new Error("This plugin not compatible for web");
    }
    async deviceAvailableRam() {
        throw new Error("This plugin not compatible for web");
    }
}

var web = /*#__PURE__*/Object.freeze({
    __proto__: null,
    deviceInfoWeb: deviceInfoWeb
});

exports.deviceInfo = deviceInfo;
//# sourceMappingURL=plugin.cjs.js.map
