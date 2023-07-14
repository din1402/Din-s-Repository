public class Methods {
    private static int element;
    private static int size;

    public void theNumber(){
        this.element = element;
        this.size = 0;
    }

    public static  int sumOfDigits(int num){
        if (num == 0) {
            return 0;
        }
        else {
            return(num % 10 + sumOfDigits(num/10));
        }
    }
}