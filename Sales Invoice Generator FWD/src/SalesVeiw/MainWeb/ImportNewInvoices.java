package SalesVeiw.MainWeb;

import javax.swing.*;

public class ImportNewInvoices extends javax.swing.JDialog{
    private JLabel getInvoiceNoValue;
    private JTextField getCustomerNameTextField;
    private JTextField getInvoiceDateTextField;

    public ImportNewInvoices(App appFrame, AbstractButton cancelInvoicesButton){super(appFrame);
        initcomponents();

        createInvoiceButton.addActionListener(appFrame.getActionListener());
        cancelInvoicesButton.addActionListener(appFrame.getActionListener());


    }

    private void initcomponents() {

    }

    public JTextField getCustomerNameTextField(){return getCustomerNameTextField;}

    public void setCustomerNameTextField(JTextField customerNameTextField){

        this.customerNameTextField =customerNameTextField;
    }
    public JTextField getInvoiceDateTextField (){return getInvoiceDateTextField;}

    public void setInvoiceDateTextField(JTextField invoiceDateTextField){
        this.invoiceDateTextField =invoiceDateTextField;

    }
    public JLabel getInvoiceNoValue(){return getInvoiceNoValue;}

    public void setInvoiceNoValueLabel(JLabel invoiceNoValueLabel){this.invoiceNoValueLabel=invoiceNoValueLabel;}

    private javax.swing.JButton cancelInvoiceButton;

    private javax.swing.JButton createInvoiceButton;

    private javax.swing.JLabel createNewInvoiceLabel;

    private javax.swing.JLabel customerNameLabel;

    private javax.swing.JTextField customerNameTextField;

    private javax.swing.JLabel invoiceDataLabel;

    private javax.swing.JTextField invoiceDateTextField;

    private javax.swing.JLabel invoiceNoLabel;

    private javax.swing.JLabel invoiceNoValueLabel;

    private javax.swing.JPanel jPanel ;


    public AbstractButton setInvoiceNoValueLabel() {
        return null;
    }
}
