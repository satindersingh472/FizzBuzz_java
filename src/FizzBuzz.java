import java.util.Arrays;
public class FizzBuzz {

    public FizzBuzz(){

    }
    public int[] sample_array(){
        int[] random_numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        return random_numbers;
    }
    public static void fizz_buzz(int[] numbers){
        for (int number : numbers) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number + " FizzBuzz");
            } else if (number % 3 == 0){
                System.out.println(number + " Fizz");
            } else if (number % 5 == 0){
                System.out.println(number + " Buzz");
            }
        }
    }
    public static void main(String[] args){
      FizzBuzz sample_test = new FizzBuzz();
      int[] abc = sample_test.sample_array();
      fizz_buzz(abc);



    }
}
