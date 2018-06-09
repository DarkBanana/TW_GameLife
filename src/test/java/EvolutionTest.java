import org.junit.Test;

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
        assertEquals(target,new  Evolution().onceReplace(defaultMatrix));
    }



}