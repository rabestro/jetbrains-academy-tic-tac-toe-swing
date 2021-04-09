package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.text.MessageFormat;

public class StatusBar extends JPanel {
    final JLabel status = new JLabel(State.EMPTY.getMessage());

    {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        status.setName("LabelStatus");
        status.setPreferredSize(new Dimension(350, 20));
        add(status);
    }

    void setMessage(State state, Object... args) {
        status.setText(MessageFormat.format(state.getMessage(), args));
    }
}
