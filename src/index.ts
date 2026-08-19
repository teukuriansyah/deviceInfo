import { registerPlugin } from '@capacitor/core';

import type { deviceInfoPlugin } from './definitions';

const deviceInfo = registerPlugin<deviceInfoPlugin>('deviceInfo', {
  web: () => import('./web').then((m) => new m.deviceInfoWeb()),
});

export * from './definitions';
export { deviceInfo };
