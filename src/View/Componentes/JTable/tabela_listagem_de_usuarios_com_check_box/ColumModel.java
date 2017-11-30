package View.Componentes.JTable.tabela_listagem_de_usuarios_com_check_box;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.table.*;


public class ColumModel extends DefaultTableColumnModel{
    /** Creates a new instance of TarefasColumnModel */
    public ColumModel(TableModel tbm) {
        for(int i=0;i<tbm.getColumnCount();i++){
            addColumn(criaColuna(0, false,"Nome"));
        }
    }
    private TableColumn criaColuna(int columnIndex, 
            boolean resizeable, String titulo){
        TableColumn col = new TableColumn(columnIndex);
        col.setCellRenderer(new CellRender());
        //col.setHeaderRenderer(new ColumnHeaderRenderer());
        col.setHeaderValue(titulo);
        col.setResizable(resizeable);
        return col;
    }
}