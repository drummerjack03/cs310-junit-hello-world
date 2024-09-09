package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        System.out.println("I'm Coding!");
        System.out.println("!gnidoC m'I");
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        StringBuilder reversed = new StringBuilder(message);
        return reversed.reverse().toString();
    }
    
    
}