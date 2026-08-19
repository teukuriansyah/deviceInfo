export interface deviceInfoPlugin {
  deviceInfoManufacture():Promise<{manufacture:string}>
deviceInfoBrand():Promise<{brand:string}>
deviceInfoModel():Promise<{model:string}>
deviceInfoBoard():Promise<{board:string}>
deviceInfoHardware():Promise<{hardware:string}>
deviceInfoOSVersion():Promise<{osVersion:string}>
deviceWidth():Promise<{width:number}>
deviceHeight():Promise<{height:number}>
deviceDensity():Promise<{density:number}>
deviceTotalRam():Promise<{totalRam:number}>
deviceAvailableRam():Promise<{availableRam:number}>
}
