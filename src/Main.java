import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Student student = new Student("Кумарбек","Толонбаев",15,"Male");
Student student2 = new Student("Айдай","Исмаилова",18,"Female");
Student student3 = new Student("Самаган","Толонбаев",15,"Male");
Student student4 = new Student("Айзирек","Токтосунова",18,"Female");
Student student5 = new Student("Русланбек","Тайполотов",26,"Male");
Student student6 = new Student("Рысбек","Шарапов",25,"Male");
Student student7 = new Student("Нуржигит","Умаров",23,"Male");
Student student8 = new Student("Назгул","Мансуралиева",25,"Female");
Student student9 = new Student("Байкал","Асанов",15,"Male");
Student student10 = new Student("Адина","Дуйшобаева",27,"Female");

Student[] students ={student,student2,student3,student4,student5,student6,student7,student8,student9,student10};
School school=new School();
school.getAllStudent(students);
school.getByName("Назгул",students);
school.getAllBoys(students);
    }
}