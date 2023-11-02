package com.test.hai.trungdan;

import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CustomScrollBarUI extends BasicScrollBarUI {

    @Override
    protected void configureScrollBarColors() {
        // Tùy chỉnh màu sắc của thanh cuộn
        thumbColor = Color.LIGHT_GRAY;
        trackColor = Color.getHSBColor(204, 204, 204);
    }

    protected void configureScrollBarWidth() {
        // Tùy chỉnh độ dày của thanh cuộn
        scrollBarWidth = 20;
    }

    @Override
    protected JButton createDecreaseButton(int orientation) {
        // Tạo nút giảm giá trị của thanh cuộn
        return new JButton() {
            @Override
            public Icon getIcon() {
                ImageIcon icon = new ImageIcon("C:\\Users\\ADMIN\\Desktop\\swing-trungdan\\src\\main\\java\\com\\test\\hai\\trungdan\\image\\arrow-up.png");
                Image img = icon.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH);
                icon = new ImageIcon(img);
                return icon;
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(20, 20); // Ẩn nút giảm giá trị
            }
        };
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        // Tạo nút tăng giá trị của thanh cuộn
        return new JButton() {

            @Override
            public Icon getIcon() {
                ImageIcon icon = new ImageIcon("C:\\Users\\ADMIN\\Desktop\\swing-trungdan\\src\\main\\java\\com\\test\\hai\\trungdan\\image\\arrow-down.png");
                Image img = icon.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH);
                icon = new ImageIcon(img);
                return icon;
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(20, 20); // Ẩn nút tăng giá trị
            }
        };
    }
}
