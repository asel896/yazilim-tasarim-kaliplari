public class Main {
    public static void main(String[] args) {

        GameServerBuilder gameServerBuilder=new GameServerBuilder();

        SystemAdmin admin=new SystemAdmin(gameServerBuilder);

        admin.deployServer();

        gameServerBuilder.getServer();
    }
}