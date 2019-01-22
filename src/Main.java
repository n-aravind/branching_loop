public class Main {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String birthdayMonth = "April";

//        Write code loops an array of the names of the months and prints the names of the month. Enhance the code by adding a break to break out of the loop when the month is the same as the month that you were born

        for (String month : months) {
            if (month == birthdayMonth) {
                break;
            }
            System.out.println(month);
        }
//        Write code that divides 21 by 1, 21 by 2, 21 by 3, ..., 21 by 21 and prints the remainder. When the remainder is zero skip printing the remainder and continue to the top of the loop.
        for (int i = 1; i <= 21; i++) {
            if (21 % i == 0) {
                continue;
            } else {
                System.out.println("21 % " + i + " = " + 21 % i);
            }
        }
    }
}