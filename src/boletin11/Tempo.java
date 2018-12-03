
package boletin11;

import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class Tempo {
   private long tempoInicioM, tempoInicioS, tempoFinalM, tempoFinalS;
  
    public void CalcularTempoInicial(){
       tempoInicioM= System.currentTimeMillis();
       tempoInicioS= TimeUnit.MILLISECONDS.toSeconds(tempoInicioM);
       
       JOptionPane.showInputDialog(null, "ESCRIBE A SEGUINTE FRASE:\n"
               + "A documentación é todo aquel conxunto de manuais impresos "
               + "ou en formato dixital que explique unha aplicación informática.");
      
      tempoFinalM= System.currentTimeMillis();
      tempoFinalS= TimeUnit.MILLISECONDS.toSeconds(tempoFinalM);
      
      long tempoTotal= tempoFinalS-tempoInicioS;
      
      JOptionPane.showMessageDialog(null,"Tardaches "+tempoTotal+" tempo en escribir a frase");
       
    }
    }
