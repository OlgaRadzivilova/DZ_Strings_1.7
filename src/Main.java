public class Main {
    public static void main(String[] args) {


// Задание 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        {
            String fullName = "Ivanov " + "Ivan " + "Ivanovich";

            System.out.println("Employee`s full name - " + fullName);


// Задание 2

            String fullNAME = fullName.toUpperCase();

            System.out.println("Employee`s full name data for filling out the report - " + fullNAME);

        }

// Задание 3

        String fullName = "Ivanov Semёn Semёnovich";

        fullName = fullName.replace('ё', 'e');

        System.out.println("Employee's full name data - " + fullName);

    }

}










