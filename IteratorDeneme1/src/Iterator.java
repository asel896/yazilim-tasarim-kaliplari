public interface Iterator {
    boolean hasNext();
    String next();
}


class SongIterator implements Iterator {
    private int position = 0;
    private SongList songList;

    public SongIterator(SongList songList) {
        this.songList = songList;
    }

    @Override
    public boolean hasNext() {
        return position < songList.getSongs().length && songList.getSongs()[position] != null;
    }
    @Override
    public String next() {
        if (this.hasNext()) {
            String song = songList.getSongs()[position];
            position++; // Bir sonraki şarkıya geçmek için sayacı artırıyoruz
            return song;
        }
        return null;
    }
}