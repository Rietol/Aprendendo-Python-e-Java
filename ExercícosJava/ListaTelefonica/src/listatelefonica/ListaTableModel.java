package listatelefonica;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ListaTableModel extends AbstractTableModel {
 
    private List<Dados> lista;
        private String[] colunas = new String []{
            "ID", "Nome", "Numero"};
        
    public ListaTableModel(List<Dados> lista) {
        this.lista = lista;
    }
    
    public ListaTableModel(){
        this.lista = new ArrayList<Dados>();
    }
    
    public int getRowCount() {
        return lista.size();
    }
    
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }
    
    public void setValueAt(Dados aValue, int rowIndex) {
        Dados dados = lista.get(rowIndex);
        
        
        dados.setId(aValue.getId());
        dados.setNome(aValue.getNome());
        dados.setNumero(aValue.getNumero());
        
        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Dados dados = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                dados.setId((long) aValue);
            case 1:
                dados.setNome(aValue.toString());
            case 2:
                dados.setNumero((int) aValue);

            default:
                System.err.println("Índice da coluna inválido");
    }
    fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dados dadosSelecionado = lista.get(rowIndex);
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
    
    public Dados getDados(int indiceLinha) {
        return lista.get(indiceLinha);
    }
    
    public void addDados(Dados d) {
        lista.add(d);
        
        int ultimoIndice = getRowCount() -1;
        
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
    
    public void removeDados(int indiceLinha) {
        lista.remove(indiceLinha);
        
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }
    
    public void addListaDePessoas(List<Dados> novasPessoas) {
        
        int tamanhoAntigo = getRowCount();
        lista.addAll(novasPessoas);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
    
    public void limpar() {
        lista.clear();
        fireTableDataChanged();
    }
    
    public boolean isEmpty() {
        return lista.isEmpty();
    }
}
