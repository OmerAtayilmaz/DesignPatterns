public class MsiManufacturer extends Company {
    @Override
    public GPU createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
