package RefRobot;

public class Main {
    public static void main(String[] args) {
        int toX = 1;
        int toY = 2;
        Robot robot = new Robot();
        moveRobot(robot, toX, toY);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        turn(robot, searchDirectionsY(robot, toY));
        step(robot, Math.abs(robot.getY() - toY));
        turn(robot, searchDirectionsX(robot, toX));
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

    private static Direction searchDirectionsY(Robot robot, int toY) {
        if (robot.getY() > toY) {
            return Direction.DOWN;
        } else {
            return Direction.UP;
        }
    }

    private static Direction searchDirectionsX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            return Direction.LEFT;
        } else {
            return Direction.RIGHT;
        }
    }
}


