package RefRobot;

public class Robot {
    int x = 4;
    int y = 6;
    Direction direction = Direction.UP;

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        System.out.println("Поворот против часовой стрелки");
        if (direction == Direction.DOWN) {
            this.direction = Direction.RIGHT;
            return;
        }

        if (direction == Direction.UP) {
            this.direction = Direction.LEFT;
            return;
        }

        if (direction == Direction.LEFT) {
            this.direction = Direction.DOWN;
            return;
        }

        if (direction == Direction.RIGHT) {
            this.direction = Direction.UP;
            return;
        }
    }

    public void turnRight() {
        System.out.println("поворот по часовой стрелке");
        if (this.direction == Direction.DOWN) {
            this.direction = Direction.LEFT;
            return;
        }

        if (this.direction == Direction.UP) {
            this.direction = Direction.RIGHT;
            return;
        }

        if (this.direction == Direction.LEFT) {
            this.direction = Direction.UP;
            return;
        }

        if (this.direction == Direction.RIGHT) {
            this.direction = Direction.DOWN;
            return;
        }
    }

    public void stepForward() {
        if (direction == Direction.DOWN) {
            System.out.println("Движение вниз");
            this.y--;
        }

        if (direction == Direction.UP) {
            System.out.println("Движение вверх");
            this.y++;
        }

        if (direction == Direction.LEFT) {
            System.out.println("Движение налево");
            this.x--;
        }

        if (direction == Direction.RIGHT) {
            System.out.println("Движение направо");
            this.x++;
        }
    }
}