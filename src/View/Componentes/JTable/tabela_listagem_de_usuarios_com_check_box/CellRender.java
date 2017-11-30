/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Componentes.JTable.tabela_listagem_de_usuarios_com_check_box;

import Model.sub_usuario_lista;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.*;

public class CellRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table,
            Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        sub_usuario_lista dado =((TableModel_CheckBox) table.getModel()).getDados(row);

        return dado.getCheck();
    }
    
   
}
