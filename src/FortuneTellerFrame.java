import javax.swing.*;
import java.awt.*;

public class FortuneTellerFrame  extends JFrame
{
    public FortuneTellerFrame()
    {
        JPanel mainPnl, titlePnl, displayPnl, cmdPnl;
        JLabel titleLbl;
        ImageIcon icon;
        JScrollPane scroller;
        JTextArea fortuneText;
        JButton quickBtn, fortuneBtn;


        setTitle("Fortune Teller");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
