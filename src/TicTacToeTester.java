import javax.swing.JFrame;

public class TicTacToeTester extends JFrame
{
	public static JFrame ttt;
	public static void main(String[] args)
	{
		ttt = new TicTacToe(); 
        ttt.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    ttt.setTitle("Tic-Tac-Toe");
	    ttt.setVisible(true);
	}
}
