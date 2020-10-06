package listatelefonica;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ListaTableModel extends AbstractTableModel {
    
    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private static final int COL_TELEFONE = 2;
    
    private List<Dados> linhas;
    private String[] colunas = new String []{
        "ID", "Nome", "Telefone"};
        
    public ListaTableModel(List<Dados> linhas) {
        this.linhas = linhas;
    }
    
    public ListaTableModel(){        
        this.linhas = new ArrayList<Dados>();
    }
    
    public int getRowCount() {
        return linhas.size();
    }
    
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public Class getColumnClass(int columnIndex) {
        if (columnIndex == COL_ID) {
            return Integer.class;
        }
        return String.class;
    }
    
    public void setValueAt(Dados aValue, int rowIndex) {
        Dados dados = linhas.get(rowIndex);
        
        
        dados.setId(aValue.getId());
        dados.setNome(aValue.getNome());
        dados.setNumero(aValue.getNumero());
        
        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Dados dados = linhas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                dados.setId((int) aValue);
            case 1:
                dados.setNome(aValue.toString());
            case 2:
                dados.setNumero(aValue.toString());

            default:
                System.err.println("Índice da coluna inválido");
    }
    fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dados dadosSelecionado = linhas.get(rowIndex);
        Object valueObject = null;
        switch(columnIndex){
            case 0: valueObject = dadosSelecionado.getId(); 
            break;
            case 1: valueObject = dadosSelecionado.getNome(); 
            break;
            case 2: valueObject = dadosSelecionado.getNumero(); 
            break;
            default: System.err.println("Índice inválido para propriedade do bean Dados.class");
        }    
        
        return valueObject;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public Dados getContato(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    public void addContato(Dados d) {
        linhas.add(d);
        
        int ultimoIndice = getRowCount() -1;
        
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
    
    public void removeContato(int indiceLinha) {
        linhas.remove(indiceLinha);
        
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }
    
    public void updateContato(int indiceLinha, Dados marca) {
        linhas.set(indiceLinha, marca);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }
    
    public void addListaDePessoas(List<Dados> novasPessoas) {
        
        int tamanhoAntigo = getRowCount();
        linhas.addAll(novasPessoas);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
    
    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }
    
    public boolean isEmpty() {
        return linhas.isEmpty();
    }
}
