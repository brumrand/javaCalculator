package calculadora;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.*;

import javafx.event.ActionEvent;

import java.awt.*;

public class GraphicInterface {
    public void interfaz() {

      JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
      
      panel = addTextAndButtons(panel);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    

    private JPanel addTextAndButtons (JPanel panel){
            JTextField display = new JTextField();
            panel.add(display);

            String[] buttonLabels = {
                  "7", "8", "9", "/",
                  "4", "5", "6", "*",
                  "1", "2", "3", "-",
                  "0", "C", "=", "+"
            };
            for (String label : buttonLabels) {
                  JButton button = new JButton(label);
                  panel.add(button);

            
        }
        return panel;
    }
}
