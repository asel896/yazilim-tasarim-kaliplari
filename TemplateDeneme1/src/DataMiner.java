public abstract class DataMiner {
    public final void mineData(){
        openFile();
        readData();
        exportReport();
        closeFile();
    }

    private void openFile(){
        System.out.println("Open file");
    }

    private void closeFile(){
        System.out.println("Close file");
    }
    protected abstract void readData();
    protected abstract void exportReport();
}


class PdfDataMiner extends DataMiner {
    @Override
    protected void readData() {
        System.out.println("Read pdf data");
    }
    @Override
    protected void exportReport() {
        System.out.println("Export pdf data");
    }
}
