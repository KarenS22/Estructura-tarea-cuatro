package ec.edu.ups.estructura.tarea.corchetes;


import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        Stack<String> x = new Stack<>();

        for (char caracter : cadena.toCharArray()) {
            switch (caracter) {
                case '{':
                    x.push("{");
                    System.out.println("  "+ x);
                    break;
                case '[':
                    x.push("[");
                    System.out.println("  "+ x);
                    break;
                case '(':
                    x.push("(");
                    System.out.println("  "+ x);
                    break;
                case ')':
                    if (!x.isEmpty() && x.peek().equals("(")) {
                        x.pop();
                        System.out.println("  "+ x);
                    }   break;
                case ']':
                    if (!x.isEmpty() && x.peek().equals("[")) {
                        x.pop();
                        System.out.println("  "+ x);
                    }   break;
                case '}':
                    if (!x.isEmpty() && x.peek().equals("{")) {
                        x.pop();
                        System.out.println("  "+ x);
                    }   break;
                default:
                    break;
            }
        }

        System.out.println("Lista x sería:");
        for (int i = 0; i < x.size(); i++) {
            System.out.print( x.get(i));
        }
    }
}
 