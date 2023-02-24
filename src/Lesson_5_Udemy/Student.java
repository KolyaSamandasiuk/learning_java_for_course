package Lesson_5_Udemy;

  public class Student {
    int numberOfStudentTicket;
    String name, surname;
    int yearOfEducation;
    double averageRatingMath;
    double averageRatingEconomic;
    double averageRatingEnglish;

}
    class StudentTest extends Student{
        double serednyaOcinka(StudentTest StudentNumber) {
            double serednyaOcinkaZnach = (StudentNumber.averageRatingEconomic + StudentNumber.averageRatingEnglish + StudentNumber.averageRatingMath)/3;
            System.out.println("Name: " + StudentNumber.name + "Surname: " + StudentNumber.surname + serednyaOcinkaZnach);
            return serednyaOcinkaZnach;
        }
        public static void main(String[] args) {

        StudentTest StudentNumber1 = new StudentTest();
        StudentTest StudentNumber2 = new StudentTest();
        StudentTest StudentNumber3 = new StudentTest();

        StudentNumber1.numberOfStudentTicket = 1;
        StudentNumber1.name = "Kolya";
        StudentNumber1.surname = "Samandasiuk";
        StudentNumber1.averageRatingEconomic = 8.9;
        StudentNumber1.averageRatingEnglish = 10.1;
        StudentNumber1.averageRatingMath = 11.4;
        StudentNumber1.yearOfEducation = 10;

        StudentNumber2.numberOfStudentTicket = 2;
        StudentNumber2.name = "Vasya";
        StudentNumber2.surname = "Pupkin";
        StudentNumber2.averageRatingEconomic = 6.9;
        StudentNumber2.averageRatingEnglish = 3.1;
        StudentNumber2.averageRatingMath = 6.4;
        StudentNumber2.yearOfEducation = 7;

        StudentNumber3.numberOfStudentTicket = 3;
        StudentNumber3.name = "Oleg";
        StudentNumber3.surname = "Lanko";
        StudentNumber3.averageRatingEconomic = 6.9;
        StudentNumber3.averageRatingEnglish = 12.0;
        StudentNumber3.averageRatingMath = 7.4;
        StudentNumber3.yearOfEducation = 9;

        StudentTest sTest = new StudentTest();
        sTest.serednyaOcinka(StudentNumber1);
        sTest.serednyaOcinka(StudentNumber2);
        sTest.serednyaOcinka(StudentNumber3);

        }
    }