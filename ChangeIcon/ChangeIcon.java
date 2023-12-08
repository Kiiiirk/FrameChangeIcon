import javax.swing.*;
class ChangeIcon {
  public static void main(String args[]){
	
  JFrame frame = new JFrame("Todolist Management System");
    frame.setSize(400, 600);
    frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    //changing the icon in the frame:) 
    String iconPath = "mario.png";
    frame.setIconImage(new ImageIcon(iconPath).getImage());
  }
}