public class Main {
    public static void main(String[] args) {

        Company msi = new MsiManufacturer();
        Monitor msiMonitor = msi.createMonitor();
        GPU msiGPU = msi.createGpu();


        Company asus = new AsusManufacturer();
        Monitor asusMonitor = asus.createMonitor();
        GPU asusGPU = asus.createGpu();


    }
}