import { WebPlugin } from '@capacitor/core';

import type { deviceInfoPlugin } from './definitions';

export class deviceInfoWeb extends WebPlugin implements deviceInfoPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
