package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class Cell extends JButton {
    private static final Font COMIC_SANS = new Font("Comic Sans", Font.BOLD, 50);

    Cell(final String name, final ActionListener listener) {
        super(Mark.EMPTY.getMark());
        addActionListener(listener);
        setName("Button" + name);
        setFont(COMIC_SANS);
        setFocusPainted(false);
        setVisible(true);
        setEnabled(false);
    }

    int getIndex() {
        final var notation = this.getName().substring(6);
        return ('3' - notation.charAt(1)) * 3 - 'A' + notation.charAt(0);
    }

    void clear() {
        setText(Mark.EMPTY.getMark());
    }

    boolean isEmpty() {
        return getText().equals(Mark.EMPTY.getMark());
    }

    void setMark(final Mark mark) {
        setText(mark.getMark());
    }

    public enum Mark {
        EMPTY(" "), X("X"), O("O");

        private final String mark;

        Mark(String mark) {
            this.mark = mark;
        }

        public String getMark() {
            return mark;
        }
    }
}