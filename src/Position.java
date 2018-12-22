public class Position
{

    int row; int column;

    public Position(int r, int c)
    {
        this.row = r;
        this.column = c;
    }

    public static Position findPosition(int num, int[][] intArray)
    {
        for (int i = 0; i < intArray.length; i++)
        {
            for (int j = 0; j < intArray[i].length; j++)
            {
                if (intArray[i][j] == num)
                {
                    return new Position(i, j);
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] intArray)
    {
        Position[][] newArray = new Position[intArray.length][intArray[0].length];
        for (int row = 0; row < intArray.length; row++)
        {
            for (int column = 0; column < intArray[0].length; column++)
            {
                newArray[row][column] = findPosition(intArray[row][column]+1, intArray);
            }
        }
        return newArray;
    }
}