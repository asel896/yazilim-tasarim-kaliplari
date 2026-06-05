// 1. ortak sozlesme(soyut urun)
// once her dusmanin ortak yapacagi isi tanimlayan bir arayuz yaziyoruz

public interface Enemy {
    void attack();
}

// 2. gercek dusmanlar (somut urunler)
// bu arayuzden tureyen gercek canavarlari olusturuyoruz

class Zombie implements Enemy {
    @Override
    public void attack(){
        System.out.println("Zombi yaklaştı ve ısırdı! -20 HP");
    }
}

class Robot implements Enemy{
    @Override
    public void attack() {
        System.out.println("Robot lazer fırlattı! -40 HP");
    }
  }
