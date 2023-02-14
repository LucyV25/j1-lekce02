package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();
        for (int i = 0; i < 4; i++) {
            nakresliCtverec();
            //dostane se na vychozi bod pro kresleni strechy
            vychoziBodProStrechu();
            nakresliStrechu();
            posunSeNaDalsiDomek();
        }

        //nakresli prasatko
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(800);
        zofka.penDown();
        nakresliCtverec();
        zofka.penUp();
        zofka.move(100);
        nakresliStrechu();
        zofka.turnRight(135);
        zofka.move(100);
        nakresliNozicky();
        zofka.turnRight(135);
        zofka.move(100);
        zofka.turnRight(90);
        nakresliNozicky();

    }

    private void nakresliNozicky() {
        zofka.turnRight(45);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
    }

    private void vychoziBodProStrechu() {
        zofka.penUp();
        zofka.turnRight(0);
        zofka.move(100);
    }

    private void posunSeNaDalsiDomek() {
        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(180);
        zofka.penDown();
    }

    private void nakresliStrechu() {
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
    }

    private void nakresliCtverec() {
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
    }


    public static void main(String[] args) {
        new HlavniProgram().start();

    }

}
