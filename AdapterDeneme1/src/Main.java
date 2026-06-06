public class Main {
    public static void main(String[] args) {
        VlcPlayer vlcPlayer = new VlcPlayer();

            MediaAdapter mediaAdapter = new MediaAdapter(vlcPlayer);

            mediaAdapter.play("pdf");
    }
}