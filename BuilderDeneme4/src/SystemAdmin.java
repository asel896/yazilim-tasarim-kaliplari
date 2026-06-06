public class SystemAdmin {

    private ServerBuilder serverBuilder;

    public SystemAdmin(ServerBuilder serverBuilder) {
        this.serverBuilder = serverBuilder;
    }

    public void deployServer(){
        serverBuilder.buildCPU();
        serverBuilder.buildRAM();
        serverBuilder.buildStorage();
    }

}
