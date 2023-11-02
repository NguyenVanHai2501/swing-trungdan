package com.test.hai.trungdan;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *  * Custom renderer to display a user's flag alongside its name  *  *
 * @author wwww.codejava.net
 
 */
public class UserRenderer extends JLabel implements ListCellRenderer<User> {

    public UserRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends User> list, User user, int index,
            boolean isSelected, boolean cellHasFocus) {
        String code = user.getAvatar();
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\hainguyen\\OneDrive\\Desktop\\ui\\src\\main\\java\\com\\mycompany\\ui\\image\\homeflat_106039.png");
        Image imgHome = imageIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(imgHome);
        setIcon(imageIcon);
        setText(user.getName());
        setPreferredSize(new Dimension(0, 50));
        if (isSelected) {
            System.out.println(user.getName() + cellHasFocus);
            setBackground(Color.red);
            setForeground(Color.red);
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        return this;
    }
}
