import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IteratorExercise iteratorExercise = new IteratorExercise();
        //iteratorExercise.PrintNumbersFor();
        //iteratorExercise.PrintNumbersWhile();
        //iteratorExercise.PrintNumbersDoWhile();
        //iteratorExercise.FloatWhileIterator();
        //iteratorExercise.FloatForIterator();
        //iteratorExercise.PrintBox(10, 4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        String numbers = scanner.nextLine();

        String[] numbersArray = numbers.split(" ");
        int[] numbersArrayInt = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArrayInt[i] = Integer.parseInt(numbersArray[i]);
        }


        int a = 1;
        int b = 2;
        int c = 3;
        int[] resultArray = new int[3];

        if (a < b && a < c){
            resultArray[0] = a;
            if (b<c){
                resultArray[1] = b;
                resultArray[2] = c;
            } else {
                resultArray[1] = c;
                resultArray[2] = b;
            }
        } else if (b < c && b < a){
            
        } else {

        }

    }

    public int max (int a, int b){
        return Math.max(a, b);
    }

    public int min (int a, int b){
        return a < b ? a : b;
    }

    public int max (int a, int b, int c){
        if (a < b && a < c){
            return a;
        } else if (b < c){
            return b;
        } else {
            return c;
        }
    }
}