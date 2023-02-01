import java.io.*;
import java.util.*;

public class Options {
        //declare all static variables
        public static final String root = System.getProperty("user.dir")+"\\src\\";
        public static int screenWidth;
        public static int screenHeight;
        public static boolean gamePaused = false;


    public static void refreshOptions(){
        File file = new File(root+"options.txt");

    }
        


<USE A LISTENER TO CHECK FOR A SPECIFIC KEY PRESS, PROBABLY P, I DO NOT KNOW HOW TO DO THAT THOUGH>
while (gamePaused == true) {
        JButton button = new JButton("Sound");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button.setText("Sound off");
                Music.play(1);
            }
        
}
}




/* Notes for later
 * we can get general user key input using KeyPress class for key re-assignment
 * 
 * 
 */
