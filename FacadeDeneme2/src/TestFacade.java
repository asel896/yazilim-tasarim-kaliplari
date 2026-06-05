class TestFacade {
    private Lights lights;
    private Projector projector;
    private SoundSystem soundSystem;
    private DvdPlayer dvdPlayer;

    public TestFacade() {
        this.lights = new Lights();
        this.projector = new Projector();
        this.soundSystem = new SoundSystem();
        this.dvdPlayer = new DvdPlayer();
    }

    public void watchMovie(String movie) {
        System.out.println("--- SİNEMA MODU BAŞLATILIYOR ---");
        lights.dim();
        projector.on();
        soundSystem.on();
        dvdPlayer.play(movie);
        System.out.println("--- KEYİFLİ SEYİRLER ---");

    }
}
