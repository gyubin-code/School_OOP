import  java.awt.Image ;
import java.awt.*;
import javax.swing.*;
public class imageComponent extends JComponent{
    public static final int WIDTH=300;
    public static final int HEIGHT=200;
    private Image image;
    public  imageComponent(){
    image=new ImageIcon("blue-ball.gif").getImage();
    }

  public void paintComponent(Graphics g){
      if (image==null){
          return ;
      }
      int imageWidth=image.getHeight(null);
      int imageHeight=image.getWidth(null);

      g.drawImage(image, 0, 0, null);

      for (int i = 0; i * imageWidth <= getWidth(); i++)
        for (int j = 0; j * imageHeight <= getHeight(); j++)
        if (i + j > 0)
        g.copyArea(0, 0, imageWidth, imageHeight, i * imageWidth, j * imageHeight);

    }
        public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGHT);
        }
        
}

