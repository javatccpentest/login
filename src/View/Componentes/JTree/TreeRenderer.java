/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Componentes.JTree;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.*;

/**
 *
 * @author Matheus
 */
public class TreeRenderer extends DefaultTreeCellRenderer implements TreeCellRenderer {

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
        DefaultMutableTreeNode dmtn = (DefaultMutableTreeNode) value;

        if (dmtn.toString().contains(".pdf")) {
            ImageIcon icon = new ImageIcon(getClass().getResource("/View/SubTelas/Listagem/pdf.png"));
            setIcon(icon);
        } else if (dmtn.toString().contains(".png")|dmtn.toString().contains(".jpg")) {
            ImageIcon icon = new ImageIcon(getClass().getResource("/View/SubTelas/Listagem/png.png"));
            setIcon(icon);
        }
        return this;
    }
}
