import { registerPlugin } from '@capacitor/core';
const deviceInfo = registerPlugin('deviceInfo', {
    web: () => import('./web').then((m) => new m.deviceInfoWeb()),
});
export * from './definitions';
export { deviceInfo };
//# sourceMappingURL=index.js.map