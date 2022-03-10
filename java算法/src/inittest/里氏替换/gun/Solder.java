package inittest.里氏替换.gun;

public class Solder {
    private AbstractGun gun;
    public void setGun(AbstractGun _gun){
        this.gun=_gun;
    }
    public void KillEnemry(){
        System.out.println("士兵开始杀人");
        gun.shoot();
    }
}
