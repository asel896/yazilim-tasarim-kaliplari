public class ComputerFacade {
    private Cpu cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        System.out.println("=== BİLGİSAYAR AÇILIYOR ===");
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.freeze();
        memory.loadData();
        hardDrive.readBootSector();
        cpu.execute();
        System.out.println("=== SİSTEM HAZIR ===");
    }

}


