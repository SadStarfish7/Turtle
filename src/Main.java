import javax.swing.*;
import java.awt.*;
public class Main {

    static final int CELL_WIDTH = 50;
    static final int GAME_WIDTH = 1280;
    static final int GAME_HEIGHT = 720;
    
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
    static final setup game = new setup();
    static final int BLOCKS_WIDTH = Main.GAME_WIDTH/CELL_WIDTH;
    static final int BLOCKS_HEIGHT = Main.GAME_HEIGHT/CELL_WIDTH;
    
    
    public static void main(String[] args){
        //get options and such
        Options.refreshOptions();
        new Main();
    }
    
    public Main() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window();
            }
        });
    }
    public class Window extends JFrame {
        Window(){
            //setup frame
            setTitle("turtle game");
            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //a bunch of bs to set up the game
            JPanel contentPane = new JPanel();
            contentPane.setLayout(null);

            //set up width and height of the game
            this.setPreferredSize(new Dimension(GAME_WIDTH, GAME_HEIGHT));
            game.setBounds(0,0,GAME_WIDTH,GAME_HEIGHT);
            contentPane.add(game);
            
            //stuff...?
            pack();
            setVisible(true);
            setLocationRelativeTo(null);
            setContentPane(game);
        }
    }
}
