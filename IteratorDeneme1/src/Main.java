public class Main {
    public static void main(String[] args) {

        SongList playlist = new SongList();
        playlist.addSong("Şarkı A");
        playlist.addSong("Şarkı B");
        playlist.addSong("Şarkı C");


        Iterator iterator = playlist.creteateIterator();

        System.out.println("--- Çalma Listesi Oynatılıyor ---");
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}