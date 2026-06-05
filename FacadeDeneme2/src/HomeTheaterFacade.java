class Lights{
    public void dim(){
        System.out.println("Işıklar loşlaştırıldı.");
    }
}

class Projector{
    public void on(){
        System.out.println("Projeksiyon cihazı açıldı.");
    }
}

class SoundSystem{
    public void on(){
        System.out.println("Ses sistemi açıldı ve ses seviyesi ayarlandı.");
    }
}

class DvdPlayer{
    public void play(String movie){
        System.out.println("DVD Oynatıcı oynatıyor: " + movie);
    }
}