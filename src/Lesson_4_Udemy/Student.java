package Lesson_4_Udemy;

  public class Student {

    int numberOfStudentTicket;
    String name, surname;
    int yearOfEducation;
    double averageRatingMath;
    double averageRatingEconomic;
    double averageRatingEnglish;
}


    class StudentTest extends Student{
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

            System.out.println("For Kolya: ");
            System.out.println("Seredne for student: " + StudentNumber1.name + " " + StudentNumber1.surname + " ocenka: " +(StudentNumber1.averageRatingEnglish + StudentNumber1.averageRatingMath + StudentNumber3.averageRatingEnglish)/3 );
            System.out.println("Average rating of Economic: " + StudentNumber1.averageRatingEconomic);
            System.out.println("Average rating of Math: " + StudentNumber1.averageRatingMath);
            System.out.println("Average rating of English: " + StudentNumber1.averageRatingEnglish);

            System.out.println("For Vasya: ");
            System.out.println("Average rating of Economic: " + StudentNumber2.averageRatingEconomic);
            System.out.println("Average rating of Math: " + StudentNumber2.averageRatingMath);
            System.out.println("Average rating of English: " + StudentNumber2.averageRatingEnglish);

            System.out.println("For Oleg: ");
            System.out.println("Average rating of Economic: " + StudentNumber3.averageRatingEconomic);
            System.out.println("Average rating of Math: " + StudentNumber3.averageRatingMath);
            System.out.println("Average rating of English: " + StudentNumber3.averageRatingEnglish);

        }
    }