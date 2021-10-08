package Tools;

import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;
import java.util.Calendar;

public class TSToolWindow {
    private JButton refreshToolWindowButton;
    private JButton hideToolWindowButton;
    private JLabel currentDate;
    private JLabel currentTime;
    private JLabel timeZone;
    private JPanel tsToolWindowContent;

    public TSToolWindow(ToolWindow toolWindow){
        hideToolWindowButton.addActionListener(e -> toolWindow.hide(null));
        refreshToolWindowButton.addActionListener(e -> currentDateTime());
        this.currentDateTime();
    }

    public void currentDateTime(){
        currentDate.setText("PAY");
        currentTime.setText("MAINTAINERS");
        timeZone.setText("THE");
    }

    public JPanel getContent() {
        return tsToolWindowContent;
    }
}
