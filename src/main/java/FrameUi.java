import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.Timer;

/**
 * Created by qiaorenjie on 2018/6/9.
 */
public class FrameUi extends JFrame {

    JPanel jPanel = new JPanel();

    int[][] defaultMatrix = {
            {0,1,0,0,1,1,1,1},
            {1,0,0,1,0,0,1,0},
            {0,0,0,1,1,0,1,0},
            {0,1,0,0,0,0,1,1},
            {0,1,1,0,1,1,1,0},
            {1,0,0,1,0,0,0,1},
            {0,0,0,1,1,0,0,1},
            {0,1,0,1,1,0,0,1}};
    Evolution evolution = new Evolution();
    int[][] cell = defaultMatrix;

    public void imports(){
        new Timer().schedule(new TimerTask() {
            public void run() {
                jPanel.removeAll();
                int[][] newcell = evolution.onceReplace(cell);
                new PanelUi(newcell);
            }
        },1000,1000);
    }

    public FrameUi() throws HeadlessException {
        new Timer().schedule(new TimerTask() {
            public void run() {
                int[][] newcell = cell;
                PanelUi p = new PanelUi(newcell);
                if (newcell == cell){
                    newcell = evolution.onceReplace(cell);
                    cell = newcell;
                }
                setContentPane(p);
                setSize(600, 600);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setBackground(Color.WHITE);
                setVisible(true);
                setResizable(true);
            }
        },1000,1000);

    }

    public static void main(String[] args) {
        FrameUi frameUi = new FrameUi();
    }

}
