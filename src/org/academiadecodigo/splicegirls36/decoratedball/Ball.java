package org.academiadecodigo.splicegirls36.decoratedball;

import org.academiadecodigo.simplegraphics.graphics.*;

public class Ball {

    protected Ellipse location;
    private Color color;
    private int radius;
    private int x;
    private int y;

    public Ball(int x, int y, int r) {

        this.x = x;
        this.y = y;
        this.radius = radius;
        this.location = new Ellipse(x, y, r, r);
        this.color = Color.RED;
        this.location.setColor(color);
        this.location.fill();
    }

    public void setColor(Color color) {

        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

}
