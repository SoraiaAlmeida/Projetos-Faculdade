import java.util.Stack;


  public class Pilha_A {
  public static void main(String[] args) {
Stack<Integer> pilha = new Stack<Integer>();


  for (int i = 0; i < 10; i++) {
 if (i % 2 == 0) {
 pilha.push(i * i);
 
 } 
 
 else {
	 
if (i <= 5) {
pilha.push(i);
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
