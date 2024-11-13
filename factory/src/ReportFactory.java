public class ReportFactory {

    public Report createReport(String type){
        if(type.equals("Finance"))
        {
            return new FinancialReport();
        }
        else if(type.equals("Inventory")) {
            return new InventoryReport();
        }
        else {
            throw new IllegalArgumentException("Unknown report type");
        }
    }
}
