package encodeImage;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;

public class GetImage extends JFrame
{
	JButton run, exit;
	JTextArea imagePath, folderPath;
	
	public GetImage()
	{
		event listener = new event();
		
		JPanel main, flow, top, middle;
		JLabel expla1, expla2;
		
		main = new JPanel();
		main.setLayout(new BorderLayout());
		flow = new JPanel();
		flow.setLayout(new FlowLayout());
		top = new JPanel();
		top.setLayout(new BorderLayout());
		middle = new JPanel();
		middle.setLayout(new BorderLayout());
		expla1 = new JLabel("    Designate File Path To The Image:    ", SwingConstants.CENTER);
		expla2 = new JLabel("    Designate File Path for Folder:    ", SwingConstants.CENTER);
		run = new JButton("Run");
		exit = new JButton("Exit");
		imagePath = new JTextArea();
		imagePath.setBorder(LineBorder.createGrayLineBorder());
		folderPath = new JTextArea();
		folderPath.setBorder(LineBorder.createGrayLineBorder());
		run.addActionListener(listener);
		exit.addActionListener(listener);
		top.add(expla1, BorderLayout.NORTH);
		top.add(imagePath, BorderLayout.CENTER);
		middle.add(expla2, BorderLayout.NORTH);
		middle.add(folderPath, BorderLayout.CENTER);
		flow.add(run);
		flow.add(exit);
		main.add(top, BorderLayout.NORTH);
		main.add(middle, BorderLayout.CENTER);
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
			    	StoreImage run = new StoreImage(imagePath.getText(), folderPath.getText());
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
		GUI.setSize(300,144);
	}
}
