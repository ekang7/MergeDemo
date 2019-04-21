/**
 * The MergeAnimation class is used to animate mergesort and its steps
 *
 * @author Edward Kang
 * @version 1.0
 * @since 2019-04-21
 */
import javax.swing.JFrame;
public class MergeAnimation {
    public static void main(String[]args)
    {
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setTitle("Guided Visualization of Merge Sort- Edward Kang");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Drawer comp = new Drawer();
        frame.add(comp);
        frame.setVisible(true);

    }
}
