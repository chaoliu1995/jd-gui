package org.jd.gui.test;

import org.fife.ui.rtextarea.FoldIndicatorIcon;

import java.awt.*;

public class EmptyTestFoldIndicatorIcon extends FoldIndicatorIcon {

    public EmptyTestFoldIndicatorIcon(boolean collapsed) {
        super(collapsed);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        // Do nothing - comment for Sonar
    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }
}
