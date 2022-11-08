package Controller;

import SalesSample.Header;
import SalesSample.Item;
import SalesSample.ItemTable;
import SalesVeiw.MainWeb.App;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.ArrayList;



public class InvoiceSelectionListener implements ListSelectionListener{

    private App appFrame;
    public InvoiceSelectionListener(App appFrame){this.appFrame=appFrame;}
    public InvoiceSelectionListener(){

    }
    @Override
    public void valueChanged(ListSelectionEvent e){

        int selectedInvoiceIndex = appFrame.getInvoicesTable().getSelectedRow();
        if (selectedInvoiceIndex !=-1){
            Header selectedInvoice = (Header) appFrame.getHeadersArrayList().get(selectedInvoiceIndex);
            ArrayList<Item>itemArrayList =selectedInvoice.getLines();
            ItemTable itemTable = new ItemTable(itemArrayList);
            appFrame.setItemsArrayList(itemArrayList);
            appFrame.getInvoiceItemsTable().notify();

            appFrame.getInvoiceNumberValueLabel().setText(""+ selectedInvoice.getInvoiceNumber());
            appFrame.getCustomerNameValueLabel().setText(selectedInvoice.getCustomer());
            String simpleDataFormat = null;
            appFrame.getInvoiceDateValueLabel().setText(simpleDataFormat.format(selectedInvoice.getInvoiceDate()));
            appFrame.getInvoiceTotalValueLabel().setText("" + selectedInvoice.getTotal());

        }

    }
}
