package listatelefonica;

import java.util.List;

public class ListaTableModel extends ViewAbstractTableModel<Lista> {
    public ListaTableModel(List<Lista> rows) {
        super(rows);
        columns = new String[]{
            "ID",           //[0]
            "Nome",         //[1]
            "Numero"};      //[2]
        }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Lista lst = rows.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return lst.getId();
            case 1:
                return lst.getNome();
            case 2:
                return lst.getNumero();
            default:
                return null;
        }
    }  
}
