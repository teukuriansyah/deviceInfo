import { WebPlugin } from '@capacitor/core';

import type { deviceInfoPlugin } from './definitions';

export class deviceInfoWeb extends WebPlugin implements deviceInfoPlugin {
  async deviceInfoManufacture():Promise<{manufacture:string}>{
    throw new Error("This plugin not compatible for web")
  }
}
