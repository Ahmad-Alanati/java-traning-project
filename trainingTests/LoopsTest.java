package trainingTests;

public class LoopsTest {
    public static void main(String[] args){
        int i = 0;
        System.out.println("this is a while loop");
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("this is a for loop");
        for(int y = 1;y<10;y+=2){
            System.out.println(y);
        }
        i = 11;
        System.out.println("this is a do while loop");
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
        
    }
}
