// adapter
public interface MediaPlayer {
    void play(String file);
}


class MediaAdapter implements MediaPlayer {
    private VlcPlayer vlcPlayer;

    public MediaAdapter(VlcPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }
    @Override
    public void play(String file) {
        vlcPlayer.playVlcFile(file);
    }
}