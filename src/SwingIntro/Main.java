package SwingIntro;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().show();
            }
        });
    }
}
