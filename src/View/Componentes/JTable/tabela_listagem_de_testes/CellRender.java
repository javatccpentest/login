/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Componentes.JTable.tabela_listagem_de_testes;

import Model.testes_lista;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.*;

public class CellRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table,
            Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        testes_lista dado = ((TableModel_Testes) table.getModel()).getDados(row);

        JLabel jLabel = new JLabel();
        
        switch (column) {
            case 0:
                jLabel.setIcon(dado.getImagem());
                break;
            case 1:
                jLabel.setText(dado.getInfo());
                break;
            default:
                jLabel.setText(dado.getSub_user());
                break;
        }
        jLabel.setHorizontalAlignment(CENTER);

        return jLabel;
        
    }
}
