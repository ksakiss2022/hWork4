public class Main {
    public static void main(String[] args) {

        // task 1

        int i = 10;
        while (i > 0)
        {
            System.out.print(i + " ");
            i--;
        }
        System.out.println("");
        int a = 10;
        for (a = 1; a <= 10; a ++)
        {
            System.out.print(a + " ");

        }


        // task 2
        System.out.println();
        int friday = 0;

        for (friday = 5; friday <= 31 ; friday += 7)

        {
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет.");
        }

        // task 3

        int aComitFlyingBy = 0;
        int year = 2022;
        int one = 200;
        int yearsMinus200 = year - one;
        int two = 100;
        int yearsPlus100 = year + two;


        for (aComitFlyingBy = 79; aComitFlyingBy <= yearsPlus100; aComitFlyingBy += 79)

            if (aComitFlyingBy >= yearsMinus200) {
                System.out.println(aComitFlyingBy + " г.");
            }

    }
}

