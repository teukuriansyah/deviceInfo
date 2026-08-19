export interface deviceInfoPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
