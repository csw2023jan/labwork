public class hexa {
    public static void printInt(int number) {
        String conv[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        int base = 16;
        char digit = (char) (number % base);
        number = number / base;
        if (number != 0) {
       printInt(number);
        }
        System.out.print(conv[digit]);
       }
    public static void main(String[] args) {
        printInt(6096);
    }
}
