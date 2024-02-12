package RefRobot;

public class Main {
    public static void main(String[] args) {
        int toX = 1;
        int toY = 2;
        Robot robot = new Robot();
        moveRobot(robot, toX, toY);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        turn(robot, robot.getY() > toY ? Direction.DOWN : Direction.UP);
        step(robot, Math.abs(robot.getY() - toY));
        turn(robot, robot.getX() > toX ? Direction.LEFT : Direction.RIGHT);
        step(robot, Math.abs(robot.getX() - toX));
    }

    public static void turn(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }

    public static void step(Robot robot, int countSteps) {
        while (countSteps != 0) {
            robot.stepForward();
            countSteps--;
        }
    }
}


