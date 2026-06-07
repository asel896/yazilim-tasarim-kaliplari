public interface Report {
    void display();
}

class RealReport implements Report{
    private String reportName;

    public RealReport(String reportName) {
        this.reportName = reportName;
        System.out.println("Veritabanından Ağır Veriler Yükleniyor: " + reportName);
    }
    @Override
    public void display() {
        System.out.println("Rapor İçeriği Gösteriliyor: " + reportName);
    }
}

class ProxyReport implements Report{
    private RealReport realReport;
    private String reportName;

    public ProxyReport(RealReport realReport, String reportName) {
        this.realReport = realReport;
        this.reportName = reportName;
    }
    @Override
    public void display() {
        if(realReport == null) {
            realReport = new RealReport(reportName);
        }else{
            realReport.display();
        }
    }
}