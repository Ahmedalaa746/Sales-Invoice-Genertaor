package SalesVeiw.MainWeb;

import javax.swing.*;



public class AddingNewData extends javax.swing.JDialog{

    private JTextField itempriceTextField;

    public AddingNewData(App appFrame){super(appFrame);

    initcomponents();

    createLineButton.addActionListener(appFrame.getActionsListener());
    cancelLineButton.addActionListener(appFrame.getActionsListener());
    }

    private void initcomponents() {
    }

    public JTextField getCountTextField(){return countTextField;}
    public void setCountTextField(JTextField countTextField){this.countTextField=countTextField;}

    public JTextField getItemNameTextField(){return itemNameTextField;}

    public void  setItemTextField(JTextField itemTextField){this.itemNameTextField=itemNameTextField;}


    public JTextField getItemPriceTextField(){return itemPriceTextField;}

    public void setItemPriceTextField(JTextField itemPriceTextField){this.itempriceTextField =itemPriceTextField;}

    private javax.swing.JButton cancelLineButton;

    private javax.swing.JTextField countTextField;

    private javax.swing.JButton createLineButton;

    private javax.swing.JLabel createNewLineLabel;

    private javax.swing.JLabel invoiceDateLabel;

    private javax.swing.JLabel itemNameLabel;

    private javax.swing.JTextField itemNameTextField;

    private javax.swing.JLabel itemPriceLabel;

    private javax.swing.JTextField itemPriceTextField;


    private javax.swing.JPanel jPanel;



}
