public class IteratorExercise {
    public void PrintNumbersFor(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }

    public void PrintNumbersWhile(){
        int i=0;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
    }

    public void PrintNumbersDoWhile(){
        int i=0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public void FloatWhileIterator(){
        float i=0.9f;
        while(i < 1f){
            System.out.println(i);
            i += 0.000025f;
        }
    }

    public void FloatForIterator(){
        float num=0.9f;
        for(int i=0;i<=4000;i++){
            System.out.println(num);
            num += 0.000025f;
        }
    }

    public void PrintBox(final int width, final int height){
        for(int i=0;i<height;i++){
            String boxStr = "#";
            String filler = (i == 0 || i == height-1) ? "#" : " ";
            for(int j=0;j<=width;j++){
                boxStr += filler;
            }
            boxStr += "#";
            System.out.println(boxStr);
        }
    }
}
