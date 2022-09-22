import javax.swing.*;
import java.awt.*;
public class HW9 {
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setSize(500,600);
            HW9Draw ABEER =new HW9Draw();
            frame.add(ABEER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        }
    }

