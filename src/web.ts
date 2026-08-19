import { WebPlugin } from '@capacitor/core';

import type { deviceInfoPlugin } from './definitions';

export class deviceInfoWeb extends WebPlugin implements deviceInfoPlugin {
  async deviceInfoManufacture():Promise<{manufacture:string}>{
    throw new Error("This plugin not compatible for web")
  }
  async deviceInfoBrand():Promise<{brand:string}>{
    throw new Error("This plugin not compatible for web")
  }
  async deviceInfoModel():Promise<{model:string}>{
    throw new Error("This plugin not compatible for web")
  }
  async deviceInfoBoard():Promise<{board:string}>{
    throw new Error("This plugin not compatible for web")
  }
  async deviceInfoHardware():Promise<{hardware:string}>{
    throw new Error("This plugin not compatible for web")
  }
  async deviceInfoOSVersion():Promise<{osVersion:string}>{
    throw new Error("This plugin not compatible for web")
  }
  async deviceWidth():Promise<{width:number}>{
    throw new Error("This plugin not compatible for web")
  }
  async deviceHeight():Promise<{height:number}>{
    throw new Error("This plugin not compatible for web")
  }
  async deviceDensity():Promise<{density:number}>{
    throw new Error("This plugin not compatible for web")
  }
  async deviceTotalRam():Promise<{totalRam:number}>{
    throw new Error("This plugin not compatible for web")
  }
  async deviceAvailableRam():Promise<{availableRam:number}>{
    throw new Error("This plugin not compatible for web")
  }
}
