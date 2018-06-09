
/**
 * Created by qiaorenjie on 2018/6/9.
 */
public class Evolution {

    public int[][] onceReplace(int[][] oldCells) {
        int[][] newCells = new int[8][8];
        int i,j;
        int length = oldCells.length;
        for(i = 0; i < length; i++) {
            for(j = 0; j < length; j++) {
                int count = 0;
                if(i-1 >= 0 && j-1 >=0)
                    count += oldCells[i-1][j-1];
                if(j-1 >= 0)
                    count += oldCells[i][j-1];
                if(i+1 <= length-1 && j-1 >= 0)
                    count += oldCells[i+1][j-1];
                if(i-1 >= 0)
                    count += oldCells[i-1][j];
                if(i+1 <= length-1 && j <= length-1)
                    count += oldCells[i+1][j];
                if(i-1 >= 0 && j+1 <= length-1)
                    count += oldCells[i-1][j+1];
                if(j+1 <= length-1)
                    count += oldCells[i][j+1];
                if(i+1 <= length-1 && j+1 <= length-1)
                    count += oldCells[i+1][j+1];

                newCells[i][j] = next_isAlive(oldCells[i][j], count);
                System.out.print(newCells[i][j]);
            }
            System.out.println();
        }
        return newCells;
    }

    private int next_isAlive(int oldStatus, int count) {
        if(count == 2) {
            return oldStatus;
        }if(count == 3) {
            return 1;
        }else {
            return 0;
        }
    }


}
