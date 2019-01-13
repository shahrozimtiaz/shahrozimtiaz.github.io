import java.awt.*;
import java.io.IOException;

import javax.swing.*;
import java.net.URL;

class Pratice2 {
    static class ImagePanel extends JPanel {
        private Image image;
        ImagePanel(Image image) {
            this.image = image;
        }
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image,0,0,getWidth(),getHeight(),this);
        }
    }

    private static void createAndShowUI() {
        try {
            JFrame frame = new JFrame("Image");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            Image image = Toolkit.getDefaultToolkit().getImage(new URL(
                    "http://duke.kenai.com/iconSized/duke.running.gif"));

            ImagePanel imagePanel = new ImagePanel(image);

            imagePanel.add(new JLabel("Some label"));
            frame.add(imagePanel);
            frame.setSize(100, 100);
            frame.setVisible(true);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException
    {

        
      
                createAndShowUI();
            
   
    }
}
