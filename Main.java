import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//1.Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2
    int [] numbers = {50,-20,0,30,40,60,10};
    if(numbers[0]==numbers[numbers.length-1]) System.out.println(true);
    else System.out.println(false);

//2.Write a Java program to find the numbers greater than the average of the numbers of a given array
        int [] num={1,4,17,7,25,3,100};
        double avg=0;
        for(int n:num){
            avg+=n;
        }
        avg= avg /num.length;
        for (int n:num){
            if(n>avg) System.out.println(n);
        }

//3.Write a Java program to get the larger value between first and last element of an array of integers
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(20);
        nums.add(30);
        nums.add(40);
        if (nums.getFirst() >nums.getLast()) System.out.println(nums.getFirst()+" is the largest");
        else if (nums.getFirst()< nums.getLast()) System.out.println(nums.getLast()+" is the largest");
        else System.out.println("both values are equals");

//4.Write a Java program to swap the first and last elements of an array and create a new array
        ArrayList<Integer> nums=new ArrayList<>();
        ArrayList<Integer> newNums= new ArrayList<>();
        nums.add(20);
        nums.add(30);
        nums.add(40);
        for (int i = 0; i <nums.size() ; i++) {
            if(i==0) newNums.add(nums.getLast());
            else if (i==nums.size()-1)newNums.add(nums.getFirst());
            else newNums.add(nums.get(i));
        }
        System.out.println(newNums);

//5.Write a program that places the odd elements of an array before the even elements.
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> numsE = new ArrayList<>();
        ArrayList<Integer> numsO = new ArrayList<>();

        int inp = 0;
          do {
              System.out.println("Enter a number or zero to quit");
              inp=input.nextInt();
              nums.add(inp);
          }while(inp!=0);

          for(int n:nums){
              if(n%2!=0)numsO.add(n);
                else if (n==0) continue;
                  else numsE.add(n);
          }
          nums.removeAll(nums);
          nums.addAll(numsO);
          nums.addAll(numsE);
          System.out.println(nums);

//6.Write a program that test the equality of two arrays.
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        arr1.add(2);arr1.add(3);arr1.add(6);arr1.add(6);arr1.add(4);
        arr2.add(2);arr2.add(3);arr2.add(6);arr2.add(6);arr2.add(4);

        System.out.println(arr1.equals(arr2));










    }
}