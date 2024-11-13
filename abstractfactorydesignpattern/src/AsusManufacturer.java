public class AsusManufacturer extends Company {
    @Override
    public GPU createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
