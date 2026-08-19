export interface deviceInfoPlugin {
    deviceInfoManufacture(): Promise<{
        manufacture: string;
    }>;
}
