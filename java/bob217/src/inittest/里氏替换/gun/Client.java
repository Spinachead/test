package inittest.里氏替换.gun;

public class Client {
    public static void main(String[] args) {
        Solder sanmao = new Solder();
        sanmao.setGun(new Rifle());
        sanmao.KillEnemry();
    }

}
