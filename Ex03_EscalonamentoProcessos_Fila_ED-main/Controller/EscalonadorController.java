package Controller;

import br.edu.fateczl.filaobj.Fila;

public class EscalonadorController {
    
    public void escalonador(Fila filaProcessos) {
        int quantum = 5; 
        while (!filaProcessos.isEmpty()) {
            try {
               
                String[] processoStr = ((String) filaProcessos.remove()).split(";");
                String nomeProcesso = processoStr[0];
                int qtdeRetornos = Integer.parseInt(processoStr[1]);
                
               
                System.out.println("Executando " + nomeProcesso + ", retornos restantes: " + qtdeRetornos);
                
                
                qtdeRetornos--;
                
                if (qtdeRetornos > 0) {
                   
                    filaProcessos.insert(nomeProcesso + ";" + qtdeRetornos);
                } else {
                    
                    System.out.println(nomeProcesso + " finalizado.");
                }
                
                
                Thread.sleep(quantum * 50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
