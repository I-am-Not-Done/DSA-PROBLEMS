public class AmstrongNumber {
    public static void main(String[] args) {
        int number = 153, sum = 0, temp = number;
        while(temp !=0){
            int digit =temp%10;
            sum +=Math.pow(digit,3);
            temp/=10;
        }
        System.out.println(number == sum);
    }
}

