package org.academiadecodigo.splicegirls36.decoratedball;

import org.academiadecodigo.simplegraphics.graphics.*;

public class SimpleMovableBall extends Ball implements MovableBall {

    public static final int speed = 50;

    protected double dx;
    protected double dy;

    public SimpleMovableBall(int x, int y, int r) {
        super(x, y, r);
        this.dx = 50;
        this.dy = 50;
    }

    public double xMotion() {
        return dx;
    }

    public double yMotion() {
        return dy;
    }

    public void setMotion(double dx, double dy) {

        this.dx = dx;
        this.dy = dy;
    }

    public void move() {

        location.translate(dx, dy);
    }
}
