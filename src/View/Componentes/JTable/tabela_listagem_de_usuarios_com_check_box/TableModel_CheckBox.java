package View.Componentes.JTable.tabela_listagem_de_usuarios_com_check_box;

import Model.sub_usuario_lista;
import java.util.*;
import javax.swing.table.AbstractTableModel;

public class TableModel_CheckBox extends AbstractTableModel {

    // Lista de Sócios a serem exibidos na tabela
    private List<sub_usuario_lista> linhas;

    // Cria um TableModel_CheckBox sem nenhuma linha
    public TableModel_CheckBox() {
        linhas = new ArrayList<>();
    }

    // Cria um TableModel_CheckBox contendo a lista recebida por parâmetro
    public TableModel_CheckBox(List<sub_usuario_lista> listaDeDados) {
        linhas = new ArrayList<>(listaDeDados);
    }
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Nome"};
// Constantes representando o índice das colunas
    private static final int NOME = 0;

  

    
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    ;
@Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case NOME:
                return sub_usuario_lista.class;
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    public int getColumnIndex(int columnIndex) {
        switch (columnIndex) {
            case NOME:
                return NOME;
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o sócio referente a linha especificada.
        sub_usuario_lista dado = linhas.get(rowIndex);

        switch (columnIndex) {
            case NOME:
                return dado;
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        sub_usuario_lista dado = linhas.get(rowIndex);

        switch (columnIndex) {
            case NOME:
                dado = ((sub_usuario_lista) aValue);
                break;
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }

        fireTableCellUpdated(rowIndex, columnIndex); // Notifica a atualização da célula
    }


    public sub_usuario_lista getDados(int indiceLinha) {
        return linhas.get(indiceLinha);
    }


    public void addDados(sub_usuario_lista dado) {
        // Adiciona o registro.
        linhas.add(dado);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;

        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }


    public void removeDados(int indiceLinha) {
        // Remove o registro.
        linhas.remove(indiceLinha);

        // Notifica a mudança.
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }


    public void addListaDeDados(List<sub_usuario_lista> sub_usuario_lista) {

        int indice = getRowCount();

        // Adiciona os registros.
        linhas.addAll(sub_usuario_lista);

        // Notifica a mudança.
        fireTableRowsInserted(indice, indice + sub_usuario_lista.size());
    }

// Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Notifica a mudança.
        fireTableDataChanged();
    }
}
