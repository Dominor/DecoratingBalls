package org.academiadecodigo.splicegirls36.decoratedball;

public class BallBouncer {

    public static void main(String[] args) throws InterruptedException {

        SimpleMovableBall ball1 = new SimpleMovableBall(10, 10, 50);
        DeceleratingBall ball2 = new SimpleDeceleratingBall(100, 10, 50, new BoundedBall(100, 10, 50, 50, 50));

        for (int i = 1; i <= 5; i++) {
            Thread.sleep(500);
            ball1.move();
            ball2.move();
        }
    }
}
