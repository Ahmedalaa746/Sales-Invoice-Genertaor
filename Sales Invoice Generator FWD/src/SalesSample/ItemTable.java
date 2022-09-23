package SalesSample;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ItemTable extends AbstractTableModel{
    private ArrayList<Item>itemArrayList;

    public ItemTable(ArrayList<Item>lineArrayList){this.itemArrayList=lineArrayList;}

    public ItemTable(){

    }

    @Override
    public int getRowCount(){return itemArrayList.size();}
    @Override
    public int getColumnCount(){return 5;}
    @Override
    public Object getValueAt(int i , int j ){
        Item line =itemArrayList.get(i);
        switch (j){
            case 0 :
                return i + 1 ;
            case 1:
                return line.getItemName();
            case 2 :
                return line.getItemPrice();
            case  3 :
                return line.getItemCount();
            case 4 :
                return line.getItemTotal();

        }
        return "";
    }
    @Override
    public String getColumnName(int column){
        switch (column){
            case 0 :
                return  "No.";
            case 1 :
                return "Item Name";
            case 3 :
                return "count";
            case  4 :
                return "Item Total";
        }
        return "";

    }

}
