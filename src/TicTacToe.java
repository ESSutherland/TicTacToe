import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class TicTacToe extends JFrame implements ActionListener
{
	private static final int ROW = 3;
	private static final int COL = 3;
	private static final int WIDTH = 700;
	private static final int HEIGHT = 900;
	private int[][] tttArray = new int[ROW][COL];
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, reset, exit;
	private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, turn, winner;
	private boolean d1, d2, d3, d4, d5 ,d6, d7, d8, d9, Oturn, Xturn, foundO, foundX = false;
	private int full, testO, testX = 0;
	Font f = new Font("SansSerif", Font.PLAIN, 36);
	Font f1 = new Font("SansSerif", Font.BOLD, 90);
			
	public TicTacToe()
	{
		setSize(WIDTH, HEIGHT);
		createComponents();
		Xturn = true;
	}
	
	private void createComponents()
	{
		setLayout(null);
		
		b1 = new JButton("Box 1");
		b2 = new JButton("Box 2");
		b3 = new JButton("Box 3");
		b4 = new JButton("Box 4");
		b5 = new JButton("Box 5");
		b6 = new JButton("Box 6");
		b7 = new JButton("Box 7");
		b8 = new JButton("Box 8");
		b9 = new JButton("Box 9");
		reset = new JButton("Reset");
		exit = new JButton("Exit");
		
		l1 = new JLabel("", SwingConstants.CENTER);
		l2 = new JLabel("", SwingConstants.CENTER);
		l3 = new JLabel("", SwingConstants.CENTER);
		l4 = new JLabel("", SwingConstants.CENTER);
		l5 = new JLabel("", SwingConstants.CENTER);
		l6 = new JLabel("",SwingConstants.CENTER);
		l7 = new JLabel("", SwingConstants.CENTER);
		l8 = new JLabel("", SwingConstants.CENTER);
		l9 = new JLabel("", SwingConstants.CENTER);
		turn = new JLabel("X's Turn!", SwingConstants.CENTER);
		winner = new JLabel("", SwingConstants.CENTER);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(turn);
		add(winner);
		add(reset);
		add(exit);
		
		l1.setBounds(30, 60, 200, 200);
		l2.setBounds(240, 60, 200, 200);
		l3.setBounds(450, 60, 200, 200);
		l4.setBounds(30, 270, 200, 200);
		l5.setBounds(240, 270, 200, 200);
		l6.setBounds(450, 270, 200, 200);
		l7.setBounds(30, 480, 200, 200);
		l8.setBounds(240, 480, 200, 200);
		l9.setBounds(450, 480, 200, 200);
		b1.setBounds(80, 225, 100, 30);
		b2.setBounds(290, 225, 100, 30);
		b3.setBounds(500, 225, 100, 30);
		b4.setBounds(80, 435, 100, 30);
		b5.setBounds(290, 435, 100, 30);
		b6.setBounds(500, 435, 100, 30);
		b7.setBounds(80, 645, 100, 30);
		b8.setBounds(290, 645, 100, 30);
		b9.setBounds(500, 645, 100, 30);
		turn.setBounds(30, 10, 620, 40);
		winner.setBounds(30, 690, 620, 40);
		reset.setBounds(180, 740, 150, 50);
		exit.setBounds(360, 740, 150, 50);
		
		l1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l9.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		turn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		winner.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l5.setFont(f1);
		l6.setFont(f1);
		l7.setFont(f1);
		l8.setFont(f1);
		l9.setFont(f1);
		turn.setFont(f);
		winner.setFont(f);
		
		this.b1.addActionListener(this);
		this.b2.addActionListener(this);
		this.b3.addActionListener(this);
		this.b4.addActionListener(this);
		this.b5.addActionListener(this);
		this.b6.addActionListener(this);
		this.b7.addActionListener(this);
		this.b8.addActionListener(this);
		this.b9.addActionListener(this);
		this.reset.addActionListener(this);
		this.exit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == b1)
		{
			if(d1 == false)
				l1.setText(buttonMethod(0, 0));
			
			d1 = true;
			turnMethod();
			checkMatches();
			winner.setText(winner());
		}
		
		else if(e.getSource() == b2)
		{
			if(d2 == false)
				l2.setText(buttonMethod(0, 1));
			
			d2 = true;
			turnMethod();
			checkMatches();
			winner.setText(winner());
		}
		
		else if(e.getSource() == b3)
		{
			if(d3 == false)
				l3.setText(buttonMethod(0, 2));
			
			d3 = true;
			turnMethod();
			checkMatches();
			winner.setText(winner());
		}
		
		else if(e.getSource() == b4)
		{
			if(d4 == false)
				l4.setText(buttonMethod(1, 0));
			
			d4 = true;
			turnMethod();
			checkMatches();
			winner.setText(winner());
		}
		
		else if(e.getSource() == b5)
		{
			if(d5 == false)
				l5.setText(buttonMethod(1, 1));
			
			d5 = true;
			turnMethod();
			checkMatches();
			winner.setText(winner());
		}
		
		else if(e.getSource() == b6)
		{
			if(d6 == false)
				l6.setText(buttonMethod(1, 2));
			
			d6 = true;
			turnMethod();
			checkMatches();
			winner.setText(winner());
		}
		
		else if(e.getSource() == b7)
		{
			if(d7 == false)
				l7.setText(buttonMethod(2, 0));
			
			d7 = true;
			turnMethod();
			checkMatches();
			winner.setText(winner());
		}
		
		else if(e.getSource() == b8)
		{
			if(d8 == false)
				l8.setText(buttonMethod(2, 1));
			
			d8 = true;
			turnMethod();
			checkMatches();
			winner.setText(winner());			
		}
		
		else if(e.getSource() == b9)
		{
			if(d9 == false)
				l9.setText(buttonMethod(2, 2));
			
			d9 = true;
			turnMethod();
			checkMatches();
			winner.setText(winner());
		}
		
		else if(e.getSource() == reset)
		{
			d1 = false;
            d2 = false;
            d3 = false;
            d4 = false;
            d5 = false;
            d6 = false;
            d7 = false;
            d8 = false;
            d9 = false;
            full = 0;
            l1.setText("");
            l2.setText("");
            l3.setText("");
            l4.setText("");
            l5.setText("");
            l6.setText("");
            l7.setText("");
            l8.setText("");
            l9.setText("");
            winner.setText("");
            Xturn = true;
            Oturn = false;
            foundX = false;
            foundO = false;
            for (int i = 0; i < ROW; i++)
                for (int j = 0; j < COL; j++)
                    tttArray[i][j] = 0;
            turnMethod();
            l1.setForeground(Color.BLACK);
            l2.setForeground(Color.BLACK);
            l3.setForeground(Color.BLACK);
            l4.setForeground(Color.BLACK);
            l5.setForeground(Color.BLACK);
            l6.setForeground(Color.BLACK);
            l7.setForeground(Color.BLACK);
            l8.setForeground(Color.BLACK);
            l9.setForeground(Color.BLACK);
            
		}
		else if(e.getSource() == exit)
		{
			this.dispose();
		}
	}
	
	private String buttonMethod(int i, int j)
    {
        full++;
        if (Xturn == true && Oturn == false)
        {
            Xturn = false;
            Oturn = true;
            tttArray[i][j] = 1;
            return "X";
            
        }
        else if (Oturn == true && Xturn == false)
        {
            Xturn = true;
            Oturn = false;
            tttArray[i][j] = 2;
            return "O";

        }
        else
            return null;
    }
	
	private void turnMethod()
    {
        if (Xturn == true && Oturn == false)
            turn.setText("X's Turn!");
        else if (Xturn == false && Oturn == true)
            turn.setText("O's Turn!");
    }
	
	private void checkMatches()
    {
        for (int i = 0; i < ROW; i++)
        {
            for (int j = 0; j < COL; j++)
            {
                if (tttArray[i][j] == 2)
                {
                    testO++;
                    testX = 0;
                    if (testO == 3)
                        foundO = true;
                }
                else if (tttArray[i][j] == 1)
                {
                    testX++;
                    testO = 0;
                    if (testX == 3)
                        foundX = true;
                }
            }
            testX = 0;
            testO = 0;
        }
      
        for (int i = 0; i < ROW; i++)
        {
            for (int j = 0; j < COL; j++)
            {
                if (tttArray[j][i] == 2)
                {
                    testO++;
                    testX = 0;
                    if (testO == 3)
                        foundO = true;
                }
                else if (tttArray[j][i] == 1)
                {
                    testX++;
                    testO = 0;
                    if (testX == 3)
                        foundX = true;
                }
            }
            testX = 0;
            testO = 0;
        }

        if ((tttArray[0][0] == 2 && tttArray[1][1] == 2 && tttArray[2][2] == 2) 
        	|| (tttArray[0][2] == 2 && tttArray[1][1] == 2 && tttArray[2][0] == 2))
            foundO = true;
        else if ((tttArray[0][0] == 1 && tttArray[1][1] == 1 && tttArray[2][2] == 1) 
        	|| (tttArray[0][2] == 1 && tttArray[1][1] == 1 && tttArray[2][0] == 1))
            foundX = true;
    }
	
	private String winner()
    {
        if (foundO == true && foundX == false)
        {
            lockButtons();
            showMatch();
            turn.setText("Game Over!");
            return "O Wins!";
        }
        else if (foundX == true && foundO == false)
        {
            lockButtons();
            showMatch();
            turn.setText("Game Over!");
            return "X Wins!";
        }
        else if (foundO == false && foundX == false && full == 9)
        {
        	turn.setText("Game Over!");
            return "There are no winners!";
        }
        else if (foundO == false && foundX == false && full < 9)
            return "";
        else
            return null;
    } 
    private void lockButtons()
    {
        d1 = true;
        d2 = true;
        d3 = true;
        d4 = true;
        d5 = true;
        d6 = true;
        d7 = true;
        d8 = true;
        d9 = true;
    }
    
    private void showMatch()
    {
    	if((l1.getText().equals("X") && l2.getText().equals("X") && l3.getText().equals("X")) 
    			|| (l1.getText().equals("O") && l2.getText().equals("O") && l3.getText().equals("O")))
    	{
    		l1.setForeground(Color.GREEN);
    		l2.setForeground(Color.GREEN);
    		l3.setForeground(Color.GREEN);
    	}
    	
    	else if((l4.getText().equals("X") && l5.getText().equals("X") && l6.getText().equals("X")) 
    			|| (l4.getText().equals("O") && l5.getText().equals("O") && l6.getText().equals("O")))
    	{
    		l4.setForeground(Color.GREEN);
    		l5.setForeground(Color.GREEN);
    		l6.setForeground(Color.GREEN);
    	}
    	
    	else if((l7.getText().equals("X") && l8.getText().equals("X") && l9.getText().equals("X")) 
    			|| (l7.getText().equals("O") && l8.getText().equals("O") && l9.getText().equals("O")))
    	{
    		l7.setForeground(Color.GREEN);
    		l8.setForeground(Color.GREEN);
    		l9.setForeground(Color.GREEN);
    	}
    	
    	else if((l1.getText().equals("X") && l4.getText().equals("X") && l7.getText().equals("X")) 
    			|| (l1.getText().equals("O") && l4.getText().equals("O") && l7.getText().equals("O")))
    	{
    		l1.setForeground(Color.GREEN);
    		l4.setForeground(Color.GREEN);
    		l7.setForeground(Color.GREEN);
    	}
    	
    	else if((l2.getText().equals("X") && l5.getText().equals("X") && l8.getText().equals("X")) 
    			|| (l2.getText().equals("O") && l5.getText().equals("O") && l8.getText().equals("O")))
    	{
    		l2.setForeground(Color.GREEN);
    		l5.setForeground(Color.GREEN);
    		l8.setForeground(Color.GREEN);
    	}
    	
    	else if((l3.getText().equals("X") && l6.getText().equals("X") && l9.getText().equals("X")) 
    			|| (l3.getText().equals("O") && l6.getText().equals("O") && l9.getText().equals("O")))
    	{
    		l3.setForeground(Color.GREEN);
    		l6.setForeground(Color.GREEN);
    		l9.setForeground(Color.GREEN);
    	}
    	
    	else if((l1.getText().equals("X") && l5.getText().equals("X") && l9.getText().equals("X")) 
    			|| (l1.getText().equals("O") && l5.getText().equals("O") && l9.getText().equals("O")))
    	{
    		l1.setForeground(Color.GREEN);
    		l5.setForeground(Color.GREEN);
    		l9.setForeground(Color.GREEN);
    	}
    	
    	else if((l3.getText().equals("X") && l5.getText().equals("X") && l7.getText().equals("X")) 
    			|| (l3.getText().equals("O") && l5.getText().equals("O") && l7.getText().equals("O")))
    	{
    		l3.setForeground(Color.GREEN);
    		l5.setForeground(Color.GREEN);
    		l7.setForeground(Color.GREEN);
    	}
    }

}
