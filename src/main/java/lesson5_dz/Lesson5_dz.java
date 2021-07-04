package lesson5_dz;

import java.util.Arrays;

public class Lesson5_dz {
    public static void main(String[] args) {
        Workers workerDir = new Workers("Василий Петрович", "Директор", "dir@mail.ru", 501020,50000,42, "man");
        Workers workerBux = new Workers("Екатерина Владимировна", "Бухгалтер", "bux@mail.ru", 522018,40000,59, "woman");
        Workers workerBux2 = new Workers("Ольга Дмитриевна", "Бухгалтер", "bux2@mail.ru", 522017,35000,30, "woman");
        Workers workerSklad = new Workers("Дмитрий Олегович", "Кладовщик", "sklad@mail.ru", 512010,40000,64, "man");
        Workers workerSklad2 = new Workers("Александр Петров", "Грузчик", "sklad2@mail.ru", 512010,25000,25, "man");

        workerDir.printInfo();
        workerBux.printInfo();
        workerBux2.printInfo();
        workerSklad.printInfo();
        workerSklad2.printInfo();
        System.out.println();
        System.out.println("Сотрудников: " + Workers.count);
        System.out.println();
        workerDir.isRetired();
        workerBux.isRetired();
        workerBux2.isRetired();
        workerSklad.isRetired();
        workerSklad2.isRetired();




        System.out.println();
        System.out.println("Сотрудники старше 40 лет :");

        Workers[] persArray = {
                new Workers("Василий Петрович", "Директор", "dir@mail.ru", 501020, 50000, 42, "man"),
                new Workers("Екатерина Владимировна", "Бухгалтер", "bux@mail.ru", 522018,40000,59, "woman"),
                new Workers("Ольга Дмитриевна", "Бухгалтер", "bux2@mail.ru", 522017,35000,30, "woman"),
                new Workers("Дмитрий Олегович", "Кладовщик", "sklad@mail.ru", 512010,40000,64, "man"),
                new Workers("Александр Петров", "Грузчик", "sklad2@mail.ru", 512010,25000,25, "man"),
        };

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age >40) System.out.println("Возраст Сотрудника " + persArray[i].name +" "+ persArray[i].age ) ;
        }
        System.out.println();
        System.out.println("Сотрудник пенсионер?");

        for (int i = 0; i < persArray.length; i++) {
            boolean isRet = ((persArray[i].gender == "man" & persArray[i].age > 63) || (persArray[i].gender == "woman" & persArray[i].age > 58));

                System.out.println("Сотрудник " + persArray[i].name +" "+ isRet ) ;
        }
        System.out.println();





    }
}
