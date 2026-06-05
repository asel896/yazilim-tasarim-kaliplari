class Cpu{
    public void freeze(){
        System.out.println("CPU donduruldu.");
    }
    public void execute(){
        System.out.println("CPU komutları çalıştırmaya başladı.");
    }
}

class Memory{
    public void loadData(){
        System.out.println("Belleğe boot verileri yüklendi.");
    }
}

class HardDrive{
    public void readBootSector(){
        System.out.println("Sabit diskten boot sektörü okundu.");
    }
}