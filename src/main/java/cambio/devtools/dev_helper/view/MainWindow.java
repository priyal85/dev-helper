package cambio.devtools.dev_helper.view;

import java.awt.EventQueue;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

public class MainWindow extends JFrame
{

  private JPanel contentPane;

  /**
   * Launch the application.
   */
  public static void main(String[] args)
  {
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        try
        {
          MainWindow frame = new MainWindow();
          frame.setVisible(true);
        }
        catch (Exception e)
        {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public MainWindow()
  {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 485, 313);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
    tabbedPane.setBounds(0, 0, 469, 274);
    contentPane.add(tabbedPane);
    
    JPanel panel = new JPanel();
    tabbedPane.addTab("New tab", null, panel, null);
    GridBagLayout gbl_panel = new GridBagLayout();
    gbl_panel.columnWidths = new int[]{0};
    gbl_panel.rowHeights = new int[]{0};
    gbl_panel.columnWeights = new double[]{Double.MIN_VALUE};
    gbl_panel.rowWeights = new double[]{Double.MIN_VALUE};
    panel.setLayout(gbl_panel);
  }
}
