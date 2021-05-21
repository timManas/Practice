package Graphs.RobotRoomCleaner;


import java.util.HashSet;
import java.util.Set;

public class RobotRoomCleaner {
    // Directions                    Up    Right Down  Left
    private int [][] directions = {{-1,0},{0,1},{1,0},{0,-1}};      // Traverse Up, Right, Down, Left
//    private Set<Pair<Integer,Integer>> visited = new HashSet<>();
    private Robot robot;

    public void cleanRoom(Robot robot) {
        this.robot = robot;
        backtrack(0,0,0);
    }

    private void backtrack(int row, int col, int direction) {
        // Step1 - Add to Set
//        visited.add(new Pair<>(row, col));
        robot.clean();

        // Step2 - Traverse Up, Right, Down, Left ... in that order
        // Why ? Because we turn right ALWAYS
        for (int i=0; i < 4; i++) {

            // This is the hardest part. Finding the newDirection, row and column
            int newDirection = (direction + i) % 4;         // THIS IS THE TRICK... After 3, it goes BACK to zero
            int newRow = row + directions[newDirection][0];
            int newCol = col + directions[newDirection][1];

            // Step3 - Move robot to the next Unvisited Node
//            if (!visited.contains(new Pair<>(newRow, newCol)) && robot.move()) {
//                backtrack(newRow, newCol, newDirection);
//                goBack();
//            }

            // Step4 - Always turn to the Right Next. Always ClockWise
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

/**
 Notes
 - Very Hard indeed .... 10/10

 Solution
 1. Use a set to keep track of all the nodes visited
 2. For each node, we only turn right
 3. Once we reach a node, we move in this order:
    - Up
    - Right
    - Down
    - Left
 4. If the node, has been visited yet and no obstacles are present, we move to the next
 5. Once all four have direcitons have been exhausted, we move to the right


 */