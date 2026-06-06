public abstract class DataMiner {
    public final void mineData(){
        openFile();
        readData();

        // HOOK KULLANIMI: Eğer kanca true dönerse rapor çıkar
        if (customerWantsReport()) {
            exportReport();
        }

        closeFile();
    }

    private void openFile() {
        System.out.println("Dosya açıldı.");
    }
    private void closeFile() {
        System.out.println("Dosya kapatıldı.");
    }

    protected abstract void readData();
    protected abstract void exportReport();

    // HOOK (KANCA) METODU
    // Varsayılan olarak true döner. İsteyen alt sınıf bunu ezebilir
    protected boolean customerWantsReport() {
        return true;
    }
}

// Neden buna kanca diyoruz? Çünkü alt sınıf bu metodu ezerek araya bir "kanca" atar ve yukarıdaki ana algoritmanın akışını değiştirir
class PdfDataMiner extends DataMiner {
    @Override
    protected void readData() {
        System.out.println("PDF verisi okundu.");
    }

    @Override
    protected void exportReport() {
        System.out.println("PDF raporu çıkartıldı.");
    }

    // Alt sınıf isterse kancayı ezip akışı değiştirir
    @Override
    protected boolean customerWantsReport() {
        return false; // "Ben PDF raporu çıkartılmasını istemiyorum" dedik.
    }
}