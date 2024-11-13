public class Main {
    public static void main(String[] args) {


        ReportFactory factory = new ReportFactory();
        Report financeReport = factory.createReport("Finance");
        financeReport.generate();
        Report inventoryReport = factory.createReport("Inventory");
        inventoryReport.generate();
    }
}