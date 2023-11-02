package com.test.hai.trungdan;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

/**
 *  * Custom renderer to display a user's flag alongside its name  *  
 *
 *
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
        ImageIcon imageIcon = new ImageIcon("src/main/java/com/test/hai/trungdan/image/girl_icon-icons.com_55043.png");
        Image imgHome = imageIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(imgHome);
        setIcon(imageIcon);
        setText(user.getName());
// Đặt padding cho JPanel
        Insets paddingInsets = new Insets(10, 10, 10, 10); // Đặt giá trị padding theo ý muốn
        EmptyBorder paddingBorder = new EmptyBorder(paddingInsets);

        // Đặt dòng kẻ dưới cho JPanel
        MatteBorder lineBorder = new MatteBorder(0, 0, 1, 0, Color.BLACK);

        // Kết hợp cả padding và dòng kẻ dưới
        CompoundBorder compoundBorder = new CompoundBorder(paddingBorder, lineBorder);
        setBorder(compoundBorder);
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
