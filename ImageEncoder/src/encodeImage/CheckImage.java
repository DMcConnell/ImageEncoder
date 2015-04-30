package encodeImage;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class CheckImage
{
	public CheckImage(String path)
	{
		try
		{
			File picture = new File(path);
			BufferedImage bufferedImage = ImageIO.read(picture);
			int width = bufferedImage.getWidth();
			int height = bufferedImage.getHeight();
			for(int i = 0; i < width; i++)
			{
				for(int j = 0; j < height; j++)
				{
					System.out.println(bufferedImage.getRGB(i,j));
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			ErrorGUI error = new ErrorGUI("  File path could not be found.  ");
			error.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			error.setVisible(true);
			error.setTitle("Image Encoder");
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		    Dimension frameSize = error.getSize();
		    if (frameSize.height > screenSize.height)
		    {
		    	frameSize.height = screenSize.height;
		    }
		    if (frameSize.width > screenSize.width)
		    {
		    	frameSize.width = screenSize.width;
		    }
		    error.setLocation((screenSize.width - frameSize.width) / 2 - 115,
	                (screenSize.height - frameSize.height) / 2 - 104);
			error.pack();
		}
	}
}