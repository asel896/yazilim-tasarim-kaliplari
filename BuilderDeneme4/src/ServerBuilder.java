public interface ServerBuilder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    Server getServer();
}

class GameServerBuilder implements ServerBuilder {
    Server server=new Server();

    @Override
    public void buildCPU() {
        server.cpu="16 Cores AMD EPYC";
    }
    @Override
    public void buildRAM() {
        server.ram="64 GB DDR5 RAM";
    }
    @Override
    public void buildStorage() {
        server.storage="2 TB NVMe SSD";
    }
    @Override
    public Server getServer() {
        return server;
    }
}
