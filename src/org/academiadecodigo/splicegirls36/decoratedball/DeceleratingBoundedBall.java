package org.academiadecodigo.splicegirls36.decoratedball;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class DeceleratingBoundedBall extends DeceleratingBall {

    private Rectangle frame;

    public DeceleratingBoundedBall(int x, int y, int r, MovableBall ball) {
        super(x, y, r, ball);
    }

    public void move() {

        super.move();
        setMotion(xMotion() * 0.95, yMotion() * 0.95 );
    }
}
