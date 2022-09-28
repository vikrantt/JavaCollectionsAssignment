//Question 1
//Write Java code to define List . 
//Insert 5 floating point numbers in List, and using an iterator, 
//find the sum of the numbers in List.



import java.util.*;
class Question1
{
    public static void main(String[] args) {
        List<Float> list= new ArrayList<>();
        list.add(1.1f);
        list.add(1.79f);
        list.add(1.24f);
        list.add(5.76f);
        list.add(4.79f);
        Iterator<Float> it= list.iterator();
        float sum=0f;
        while(it.hasNext())
        {
            sum+=it.next();
        }
        System.out.println(sum);
    }
}