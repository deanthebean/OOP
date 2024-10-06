public class Main {
    public static void main(String[] args) {
        IteratorExercise iteratorExercise = new IteratorExercise();
        //iteratorExercise.PrintNumbersFor();
        //iteratorExercise.PrintNumbersWhile();
        //iteratorExercise.PrintNumbersDoWhile();
        //iteratorExercise.FloatWhileIterator();
        //iteratorExercise.FloatForIterator();
        iteratorExercise.PrintBox(10, 4);
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