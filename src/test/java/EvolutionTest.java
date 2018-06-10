import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by qiaorenjie on 2018/6/9.
 */
public class EvolutionTest {
    @Test
    public void helper() throws Exception {
        int[][] defaultMatrix = {{0,1,0,0}, {1,0,0,1}, {0,0,0,1},{0,1,0,1}};
        int[][] target = new int[][]{
                {0,0,0,0},
                {0,0,1,0},
                {0,0,0,1},
                {0,0,1,0}};
        System.out.println("defaultMatrix：");
        for(int[] dd : defaultMatrix){
            for(int d : dd){
                System.out.print(d + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("target：");
        int[][] result = new  Evolution().onceReplace(defaultMatrix);

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                assertEquals(target[i][j], result[i][j]);
            }
        }
    }



}