package Controller;

import static Controller.ActionListener.simpleDataFormat;
import SalesSample.Header;
import SalesSample.Item;
import SalesSample.ItemTable;
import SalesVeiw.MainWeb.App;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class InvoiceSelectionListener implements ListSelectionListener{

    private App appFrame;
    public InvoiceSelectionListener(App appFrame){this.appFrame=appFrame;}
    public InvoiceSelectionListener(){

    }
    @Override
    public void valueChanged(ListSelectionEvent e){

        int selectedInvoiceIndex = appFrame.getInvoicesTable().getSelectedRow();
        if (selectedInvoiceIndex !=-1){
            Header selectedInvoice = appFrame.getHeadersArrayList().get(selectedInvoiceIndex);
            ArrayList<Item>itemArrayList =selectedInvoice.getLines();
            ItemTable itemTable = new ItemTable(itemArrayList);
            appFrame.setItemsArrayList(itemArrayList);
            appFrame.getInvoiceItemsTable().setMode(itemTable);

            appFrame.getInvoiceNumberValueLabel().setText(""+ selectedInvoice.getInvoiceNumber());
            appFrame.getCustomerNameValueLabel().setText(selectedInvoice.getCustomer());
            appFrame.getInvoiceDateValueLabel().setText(simpleDataFormat.format(selectedInvoice.getInvoiceDate()));
            appFrame.getInvoiceTotalValueLabel().setText("" + selectedInvoice.getTotal());

        }

    }
}
