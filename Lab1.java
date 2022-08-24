//Laboration 1 av Tobias Nordwall
public class Lab1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(i == 42) {
                printString("Answer to the Ultimate Question of Life, the Universe, and Everything");
            } else if (i % 3 == 0 && i % 5 == 0) {
                printString("Fizzbuzz");
            } else if (i % 3 == 0) {
                printString("Fizz");
            } else if (i % 5 == 0) {
                printString("Buzz");    
            } else {
                String j = String.valueOf(i); 
                printString(j);
            }
        }
    }

    public static void printString(String input) {
        System.out.println(input);
    }
}

