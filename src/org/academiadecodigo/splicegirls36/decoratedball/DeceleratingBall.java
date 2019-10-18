package org.academiadecodigo.splicegirls36.decoratedball;


public abstract class DeceleratingBall implements MovableBall {

    private MovableBall workerBall;

    public DeceleratingBall(int x, int y, int r, MovableBall ball) {
        this.workerBall = ball;
    }

    // *** MESSAGES DELEGATED ENTIRELY TO THE WORKER

    /**public int radius() {
        return workerBall.getRadius();
    }

    public Color getColor() {
        return workerBall.getColor();
    }

    public void setColor(Color color) {
        workerBall.setColor(color);
    }*/

    public void setMotion(double dx, double dy) {
        workerBall.setMotion(dx, dy);
    }

    public double xMotion() {

        return workerBall.xMotion();
    }

    public double yMotion() {

        return workerBall.yMotion();
    }

    public void move() {

        workerBall.move();
        workerBall.setMotion(workerBall.xMotion() * 0.95, workerBall.yMotion() * 0.95);
    }
}
