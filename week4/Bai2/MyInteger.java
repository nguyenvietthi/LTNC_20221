package Bai2;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public boolean isEven(int value){
        return value % 2 == 0;
    }

    public boolean isOdd(int value){
        return value % 2 == 1;
    }

    public boolean isPrime(int value){
        if (value < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(value);
        for (int i = 2; i <= squareRoot; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isEven(){
        return isEven(this.value);
    }

    public boolean isOdd(){
        return isOdd(this.value);
    }

    public boolean isPrime(){
        return isPrime(this.value);
    }

    public boolean isEven(MyInteger myinteger){
        return isEven(myinteger.getValue());
    }

    public boolean isOdd(MyInteger myinteger){
        return isOdd(myinteger.getValue());
    }

    public boolean isPrime(MyInteger myinteger){
        return isPrime(myinteger.getValue());
    }

    public boolean equals(int value){
        return this.value == value;
    }

    public boolean equals(MyInteger value){
        return this.value == value.getValue();
    }

    public static int parseInt(char[] array){
        int sum = 0;
        int position = 1;
        if(array[0] == '-') {
            for (int i = array.length - 1; i >= 1 ; i--) {
                int number = array[i] - '0';
                if(number < 0 || number > 9) {
                    System.out.println("Recheck input");
                    return 0;
                }
                sum += number * position;
                position = position * 10;
            }
            return -sum;
        } else {
            for (int i = array.length - 1; i >= 0 ; i--) {
                int number = array[i] - '0';
                if(number < 0 || number > 9) {
                    System.out.println("Recheck input");
                    return 0;
                }
                sum += number * position;
                position = position * 10;
         
            }
             return sum;
        }
    }


    public static int parseInt(String string){
        int sum = 0;
        int position = 1;
        if(string.charAt(0) == '-') {
            for (int i = string.length() - 1; i >= 1 ; i--) {
                int number = string.charAt(i) - '0';
                if(number < 0 || number > 9) {
                    System.out.println("Recheck input");
                    return 0;
                }
                sum += number * position;
                position = position * 10;
            }
            return -sum;
        } else{
            for (int i = string.length() - 1; i >= 0 ; i--) {
                int number = string.charAt(i) - '0';
                if(number < 0 || number > 9) {
                    System.out.println("Recheck input");
                    return 0;
                }
                sum += number * position;
                position = position * 10;
         
             }
             return sum;
        }
    }

}
