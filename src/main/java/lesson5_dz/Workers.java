package lesson5_dz;

public class Workers {
    String name;
    String position;
    String email;
    int telephone;
    int theSalary;
    int age;
    static int count = 0;
    String gender;
    static boolean isRetired;

    public Workers(String name, String position, String email, int telephone, int theSalary, int age,String gender) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.theSalary = theSalary;
        this.age = age;
        count++;
        this.gender=gender;

    }
    public void printInfo() {
        System.out.printf("Сотрудника зовут: %s, должность: %s, email: %s, телефон: %d, зарплата: %d, возраст: %d , пол: %s\n" , name, position, email, telephone, theSalary, age, gender);
    }

    public void isRetired(){
         if ((gender == "man" & age > 63) || (gender == "woman" & age > 58)){
         System.out.println( name + " " + "Retired");
         }else
             System.out.println(name + " " + "NO Retired");
    }


}
//ФИО, должность, email, телефон, зарплата, возраст.