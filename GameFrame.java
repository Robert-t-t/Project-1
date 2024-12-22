import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.SwingConstants;



public class GameFrame extends JFrame 
{
    
    public GameFrame()
    {
        this.setTitle("Wordle");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 600);
        this.getContentPane().setBackground(Color.darkGray);
        this.setLayout(new BorderLayout());

        // title of the game
       JLabel titleLabel = new JLabel("Wordle", SwingConstants.CENTER);
       titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
       this.add(titleLabel, BorderLayout.NORTH);

       
        //Input panel
        //Input box and button
        InputPanel panel = new InputPanel();
        panel.setBackground(Color.PINK);
        this.add(panel, BorderLayout.SOUTH);


       this.setVisible(true);
       








    }


}
