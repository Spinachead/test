package inittest.里氏替换.gun;

public class Rifle extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("步枪射击");
    }
}
