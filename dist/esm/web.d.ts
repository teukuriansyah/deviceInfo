import { WebPlugin } from '@capacitor/core';
import type { deviceInfoPlugin } from './definitions';
export declare class deviceInfoWeb extends WebPlugin implements deviceInfoPlugin {
    deviceInfoManufacture(): Promise<{
        manufacture: string;
    }>;
}
