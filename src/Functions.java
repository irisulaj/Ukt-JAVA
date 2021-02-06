import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iri_s
 */
public class Functions {
    
      //function that clears input fields when we cancel input or after we have added a set of inputs
        
        public static void ClearClientData(JLabel label, JTextField inputText1, JTextField inputText2, JTextField inputText3,
                ButtonGroup radiobgroup, JTextField inputText4, JTextField inputText5, JTextField inputText6, JTextField inputText7){
       
        inputText1.setText("");
        inputText2.setText("");
        inputText3.setText("");
        radiobgroup.clearSelection();     
        inputText4.setText("");
        inputText5.setText("");
        inputText6.setText("");
        inputText7.setText("");
        label.setVisible(false);
        inputText1.requestFocus();
        }
        
            //function that clears input fields when we cancel input or after we have added a set of inputs
        
        public static void ClearFaturaData(JLabel label, JTextField inputText1, JTextField inputText2, JTextField inputText3,
                 JTextField inputText4, JTextField inputText5, JTextField inputText6,
                JTextField inputText7, JTextField inputText8, JTextField inputText9, JTextField inputText10){
       
        inputText1.setText("");
        inputText2.setText("");
        inputText3.setText("");    
        inputText4.setText("");
        inputText5.setText("");
        inputText6.setText("");
        inputText7.setText("");
        inputText8.setText("");
        inputText9.setText("");
        inputText10.setText("");
        label.setVisible(false);
        inputText1.requestFocus();
        }
        
                 //function that clears input fields when we cancel input or after we have added a set of inputs
        
        public static void ClearPunonjesData(JLabel label, JTextField inputText1, JTextField inputText2, JTextField inputText3,
                    ButtonGroup radiogroup2, JTextField inputText5, JTextField inputText6,
                JTextField inputText7, JTextField inputText8, JTextField inputText9, JTextField inputText10){
       
        inputText1.setText("");
        inputText2.setText("");
        inputText3.setText("");    
        radiogroup2.clearSelection();
        inputText5.setText("");
        inputText6.setText("");
        inputText7.setText("");
        inputText8.setText("");
        inputText9.setText("");
        inputText10.setText("");
        label.setVisible(false);
        inputText1.requestFocus();
        }
        
  
             
            //function that clears input fields when we cancel input or after we have added a set of inputs
        
        public static void ClearKontrataData(JLabel label, JTextField inputText1, JTextField inputText2, JTextField inputText3,
                 JTextField inputText4, JTextField inputText5, JTextField inputText6,
                JTextField inputText7, JTextField inputText8){
       
        inputText1.setText("");
        inputText2.setText("");
        inputText3.setText("");    
        inputText4.setText("");
        inputText5.setText("");
        inputText6.setText("");
        inputText7.setText("");
        inputText8.setText("");
        label.setVisible(false);
        inputText1.requestFocus();
        } 
        
             //function that clears input fields when we cancel input or after we have added a set of inputs
        
        public static void ClearDegaData(JLabel label, JTextField inputText1, JTextField inputText2, JTextField inputText3,
                 JTextField inputText4, JTextField inputText5){
       
        inputText1.setText("");
        inputText2.setText("");
        inputText3.setText("");    
        inputText4.setText("");
        inputText5.setText("");
        label.setVisible(false);
        inputText1.requestFocus();
        } 
    
       
}
