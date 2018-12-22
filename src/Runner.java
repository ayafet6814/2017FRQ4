//Aaron Yafet

public class Runner
{

    public static void main(String[] args)
    {
        int[][] newArray = {
                {1, 1, 2, 1},
                {1, 1, 3, 1},
                {1, 1, 4, 1}
        };

        Position partA = Position.findPosition(2, newArray);
        System.out.println("Row of 2: " + partA.row);
        System.out.println("Column of 2: " + partA.column);

        Position[][] partB = Position.getSuccessorArray(newArray);
        for (int i = 0; i < partB.length; i++)
        {
            for (int j = 0; j < partB[i].length; j++)
            {
                if (partB[i][j] != null)
                {
                    System.out.println(("(" + partB[i][j].row + ", " + partB[i][j].column + ")") + "; ");
                }
                else
                {
                    System.out.println("Null.");
                }
            }
            System.out.println();
        }
    }
}
