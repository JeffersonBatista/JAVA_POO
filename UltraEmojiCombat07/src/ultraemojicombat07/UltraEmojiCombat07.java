
package ultraemojicombat07;

public class UltraEmojiCombat07 {

    public static void main(String[] args) {
        Lutador lut[] = new Lutador[6];
        lut[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        lut[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 68.8f, 14, 2, 3);
        lut[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        lut[3] = new Lutador("Dead Code", "Austrália", 29, 1.93f, 81.6f, 13, 0, 2);
        lut[4] = new Lutador("Python", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        lut[5] = new Lutador("JavaMan", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        /* lut[0].apresentar();
        lut[0].status();
        lut[1].apresentar();
        lut[1].status(); */
        Luta UEC[] = new Luta[3];
        UEC[0] = new Luta();
        UEC[0].marcarLuta(lut[0],lut[0]);
        UEC[0].lutar();
        /*Luta UEC01 = new Luta();
        UEC01.marcarLuta(lut[0],lut[1]);
        UEC01.lutar();*/
        lut[0].status();
        lut[1].status();
    }
}
