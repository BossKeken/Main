package capstoneproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class AboutDevelopers extends JFrame {
    JTable groupMembers;
    JPanel tablePanel;
    JLabel title;

    public AboutDevelopers() {
        super("About Developers");
        setSize(620, 380);
        setLocation(430, 280);
        setLayout(new BorderLayout());

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("capstoneproject/icons/systemIcon.png"));
        setIconImage(icon.getImage());

        title = new JLabel("Group Members", JLabel.CENTER);
        title.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        title.setOpaque(true);
        add(title, BorderLayout.NORTH);

        String[][] rowData = { { "xxxxxx", "Jade Mcloud L. Cabanero", "<html>Full Stack Developer<html>" },
                { "xxxxxx", "Aimee B. Baculpo", "<html>Front End Developer<br/> and Code Refinement</html>" },
                { "xxxxxx", "Yonelyn S, Cabico", "<html>Database Connectity<br/> and Design</html>" },
                { "xxxxxx", "Glenn Jay L. Bacus", "<html>Database Connectity<br/> and Design</html>" }};
        String columns[] = { "ID Number", "Name", "Contributions" };

        tablePanel = new JPanel(new BorderLayout());
        add(tablePanel, BorderLayout.CENTER);

        JTable table = new JTable(rowData, columns);
        table.setBackground(Color.ORANGE);
        table.setRowHeight(60);
        table.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
        TableColumnModel colModel = table.getColumnModel();
        colModel.getColumn(0).setPreferredWidth(10);
        colModel.getColumn(1).setPreferredWidth(110);
        colModel.getColumn(2).setPreferredWidth(90);
        tablePanel.add(table.getTableHeader(), BorderLayout.NORTH);
        tablePanel.add(table, BorderLayout.CENTER);

        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AboutDevelopers();
    }
}
