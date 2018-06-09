
import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
/**
 * Created by qiaorenjie on 2018/6/9.
 */
public class PanelUi extends JPanel {

    private static int BLACK = 1;       // alive
    private static int WHITE = 0;      // dead
    int[][] cell;

    public PanelUi(int[][] cell) {
        super();
        this.cell = cell;
    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);

        // 画横线
        for (int i = 0; i <= 8; i++) {
            g.drawLine(50, 50 * i + 50, 450, 50 * i + 50);
        }
        // 画竖线
        for (int i = 0; i <= 8; i++) {
            g.drawLine(50 * i + 50, 50, 50 * i + 50, 450);
        }
        for(int[] i:cell){
            for(int j:i){
                System.out.println(j);
            }
        }
        // 画存活点
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell.length; j++) {
                if (cell[i][j] == 1) {  // 黑色 活着as
                    g.setColor(Color.BLACK);
                    g.fillOval(55 + 50 * j, 55 + 50 * i, 40, 40);
                    repaint();
                }
            }
        }

    }





}
