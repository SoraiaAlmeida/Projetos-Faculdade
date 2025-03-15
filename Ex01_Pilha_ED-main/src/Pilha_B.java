import java.util.Stack;



    public class Pilha_B {
    public static void main(String[] args) {
    Stack<Integer> pilha = new Stack<Integer>();



    for (int i = 100; i < 115; i++) {
       if (pilha.isEmpty()) {
            pilha.push(i + 100);
       } 
       else {
         if (pilha.size() <= 4) {
             pilha.push(i + 50);
    } 
         else {
              pilha.pop();
              }
             }
               System.out.println("Topo da Pilha: " + pilha.peek());
               }

              System.out.println("Tamanho da Pilha: " + pilha.size());
    }
}