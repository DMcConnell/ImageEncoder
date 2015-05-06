package encodeImage;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;

public class GetImage extends JFrame
{
	JButton run, exit;
	JTextArea text;
	
	public GetImage()
	{
		event listener = new event();
		
		JPanel main, flow;
		JLabel expla;
		
		main = new JPanel();
		main.setLayout(new BorderLayout());
		flow = new JPanel();
		flow.setLayout(new FlowLayout());
		expla = new JLabel("    Designate File Path To The Image:    ", SwingConstants.CENTER);
		run = new JButton("Run");
		exit = new JButton("Exit");
		text = new JTextArea();
		text.setBorder(LineBorder.createGrayLineBorder());
		run.addActionListener(listener);
		exit.addActionListener(listener);
		main.add(expla, BorderLayout.NORTH);
		main.add(text, BorderLayout.CENTER);
		flow.add(run);
		flow.add(exit);
		main.add(flow, BorderLayout.SOUTH);
		add(main);
	}
	
	public class event implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Object source = e.getSource();
			if(source == exit)
				System.exit(99);
			else
			{
			    	StoreImage run = new StoreImage(text.getText());
			}
		}
	}
	
	public static void main(String [] args)
	{
		GetImage GUI = new GetImage();
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUI.setVisible(true);
		GUI.setTitle("Image Encoder");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    Dimension frameSize = GUI.getSize();
	    if (frameSize.height > screenSize.height)
	    {
	    	frameSize.height = screenSize.height;
	    }
	    if (frameSize.width > screenSize.width)
	    {
	    	frameSize.width = screenSize.width;
	    }
	    GUI.setLocation((screenSize.width - frameSize.width) / 2 - 115,
                (screenSize.height - frameSize.height) / 2 - 104);
		GUI.pack();
	}
}
