package com.modelo.action;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class PanelesDinamicos {

    private final List<JPanel> LIST_PANELES = new ArrayList<>();
    private int indice = 1;

    public void reorganizePanels(JPanel panelPrincipal, JPanel panelContenedor, JPanel panelDuplicar, int separacion) {
        panelContenedor.removeAll();

        int containerWidth = panelPrincipal.getWidth();
        int panelWidth = panelDuplicar.getPreferredSize().width;
        int panelHeight = panelDuplicar.getPreferredSize().height;
        int gap = 10;  // Espacio entre subpaneles

        int numColumns = Math.max(1, containerWidth / (panelWidth + gap));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(separacion, separacion, 0, 0);

        for (int i = 0; i < LIST_PANELES.size(); i++) {
            JPanel panell = LIST_PANELES.get(i);
            gbc.gridx = i % numColumns;
            gbc.gridy = i / numColumns;
            panell.setPreferredSize(new Dimension(panelWidth, panelHeight));
            panelContenedor.add(panell, gbc);
        }

        panelContenedor.revalidate();
        panelContenedor.repaint();
    }

    public void AgregarPanel(JPanel panelContenedor, int separacion, JPanel panelDuplicar) {
        int panelWidth = panelDuplicar.getPreferredSize().width;
        int containerWidth = panelContenedor.getWidth();

        int numColumns = Math.max(1, containerWidth / panelWidth);

        panelDuplicar.setPreferredSize(new Dimension(panelWidth, 350));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = (indice - 1) % numColumns;
        gbc.gridy = (indice - 1) / numColumns;
        gbc.insets = new Insets(separacion, separacion, 0, 0);
        panelContenedor.add(panelDuplicar, gbc);

        LIST_PANELES.add(panelDuplicar);

        indice++;
        panelContenedor.revalidate();
        panelContenedor.repaint();
    }

    public void AgregarMenuPanelVertical(JPanel panelContenedor, int separacion, JPanel panel) {
        panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, panel.getPreferredSize().height));
        panelContenedor.setLayout(new BoxLayout(panelContenedor, BoxLayout.Y_AXIS));
        if (panelContenedor.getComponentCount() > 0) {
            panelContenedor.add(javax.swing.Box.createVerticalStrut(separacion));
        }
        panelContenedor.add(panel);
        LIST_PANELES.add(panel);
        panelContenedor.revalidate();
        panelContenedor.repaint();
    }
}
