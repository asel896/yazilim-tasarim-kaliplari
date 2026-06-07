public interface Video {
    void play();
}

class RealVideo implements Video {
    private String videoName;
    public RealVideo(String videoName) {
        this.videoName = videoName;
        System.out.println("Diskten Devasa Video Dosyası Yükleniyor: " + videoName);
    }
    @Override
    public void play() {
        System.out.println("Video Oynatılıyor: " + videoName);
    }
}

class ProxyVideo implements Video {
    private RealVideo realVideo;
    private String videoName;

    public ProxyVideo(String videoName) {
        this.videoName = videoName;
    }
    @Override
    public void play() {
        if(realVideo==null){
            realVideo=new RealVideo(videoName);
        }
        realVideo.play();
    }
}