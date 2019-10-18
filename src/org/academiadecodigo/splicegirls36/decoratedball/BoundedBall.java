package org.academiadecodigo.splicegirls36.decoratedball;

import org.academiadecodigo.simplegraphics.graphics.*;

public class BoundedBall extends SimpleMovableBall {

    private int maxHeight;
    private int maxWidth;
    private Rectangle frame;

    public BoundedBall(int x, int y, int r, int maxWidth, int maxHeight) {
        super(x, y, r);
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
        frame = new Rectangle(x, y, maxWidth, maxHeight);
        frame.draw();
    }

    public void move() {

        super.move();
        frame.translate(dx, dy);
    }
}
