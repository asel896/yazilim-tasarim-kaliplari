public interface Aggregate {
    Iterator creteateIterator();
}

class SongList implements Aggregate {
    private String[] songs=new String[3];
    private int index=0;

    public void addSong(String songName) {
        if(index < 3) {
            songs[index] = songName;
            index++;
        }
    }

    public String[] getSongs() {
        return songs;
    }
    @Override
    public Iterator creteateIterator() {
        return new SongIterator(this);

        }
    }
