package CounterPackage;

/**
 * Created by Andreea on 26.10.2014.
 *
 * Create a Counter class with an increment Method and use it in Main class
 */
public class Counter {
    int count=0;
    void increment(){
        count++;
    }
}

 class Main{
    public static void main(String[] arguments){
        //initialize Counter object and use it
        Counter firstCounter = new Counter();
        firstCounter.increment();
        System.out.println(firstCounter.count);
        //TODO two more objects of Counter type
    }
}
