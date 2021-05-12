import javax.swing.*;

class GraphicalUserInterface {
    public static void GuiExample(){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JButton button = new JButton("Press");
        frame.getContentPane().add(button); //Adds button to content page of frame
        frame.setVisible(true);
    }
}



