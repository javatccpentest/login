package View.Componentes.JTable.tabela_listagem_de_testes;

import Model.testes_lista;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.AbstractTableModel;

public class TableModel_Testes extends AbstractTableModel {

    // Lista de Sócios a serem exibidos na tabela
    private List<testes_lista> linhas;

    // Cria um TableModel_CheckBox sem nenhuma linha
    public TableModel_Testes() {
        linhas = new ArrayList<>();
    }

    // Cria um TableModel_CheckBox contendo a lista recebida por parâmetro
    public TableModel_Testes(List<testes_lista> listaDeDados) {
        linhas = new ArrayList<>(listaDeDados);
    }
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Tipo", "Teste", "Executado por"};
// Constantes representando o índice das colunas
    private static final int TIPO = 0;
    private static final int TESTE = 1;
    private static final int EXECUTADO_POR = 2;

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
            case TIPO:
                return String.class;
            case TESTE:
                return String.class;
            case EXECUTADO_POR:
                return String.class;
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    public int getColumnIndex(int columnIndex) {
        switch (columnIndex) {
            case TIPO:
                return TIPO;
            case TESTE:
                return TESTE;
            case EXECUTADO_POR:
                return EXECUTADO_POR;
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o sócio referente a linha especificada.
        testes_lista dado = linhas.get(rowIndex);

        switch (columnIndex) {
            case TIPO:
                return new JLabel(dado.getImagem());
            case TESTE:
                return dado.getInfo();
            case EXECUTADO_POR:
                return dado.getSub_user();
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        testes_lista dado = linhas.get(rowIndex);

        switch (columnIndex) {
            case TIPO:
                dado.setImagem(((testes_lista) aValue).getImagem());
                break;
            case TESTE:
                dado.setInfo(((testes_lista) aValue).getInfo());
                break;
            case EXECUTADO_POR:
                dado.setSub_user(((testes_lista) aValue).getSub_user());
                break;
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }

        fireTableCellUpdated(rowIndex, columnIndex); // Notifica a atualização da célula
    }

    public testes_lista getDados(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    public void addDados(testes_lista dado) {
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

    public void addListaDeDados(List<testes_lista> testes_lista) {

        int indice = getRowCount();

        // Adiciona os registros.
        linhas.addAll(testes_lista);

        // Notifica a mudança.
        fireTableRowsInserted(indice, indice + testes_lista.size());
    }

// Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Notifica a mudança.
        fireTableDataChanged();
    }
}
