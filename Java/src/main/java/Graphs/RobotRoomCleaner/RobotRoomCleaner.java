package Graphs.RobotRoomCleaner;

import javafx.util.Pair;

import java.util.HashSet;
import java.util.Set;

public class RobotRoomCleaner {

    private int [][] directions = {{-1,0},{0,1},{1,0},{0,-1}};      // Traverse Up, Right, Down, Left
    private Set<Pair<Integer,Integer>> visited = new HashSet<>();
    private Robot robot;

    public void cleanRoom(Robot robot) {
        this.robot = robot;
        backtrack(0,0,0);
    }

    private void backtrack(int row, int col, int direction) {
        // Add to Set
        visited.add(new Pair<>(row, col));
        robot.clean();

        // Traverse Up, Right, Down, Left ... in that order
        // Why ? Because we turn right ALWAYS
        for (int i=0; i < 4; i++) {
            int newDirection = (direction + i) % 4;         // THIS IS THE TRICK... After 3, it goes BACK to zero
            int newRow = row + directions[newDirection][0];
            int newCol = col + directions[newDirection][1];

            // Move robot to the next Unvisited Node
            if (!visited.contains(new Pair<>(newRow, newCol)) && robot.move()) {
                backtrack(newRow, newCol, newDirection);
                goBack();
            }

            // Always turn to the Right Next. Always ClockWise
            robot.turnRight();
        }
    }

    private void goBack() {
        robot.turnRight();
        robot.turnRight();
        robot.move();
        robot.turnRight();
        robot.turnRight();
    }
}
