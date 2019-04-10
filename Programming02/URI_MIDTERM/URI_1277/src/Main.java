
// COMPLETE ANS TOTAL BULLSHIT, Main2 IS BETTER
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int c = 0; c < n; c++){
            int numberOfStudents = sc.nextInt();
            sc.nextLine();
            String[] students = new String[numberOfStudents];       // students's name array
            String[] attendance = new String[numberOfStudents];     // attendance list array
            int[] studentsMaxPoints = new int[numberOfStudents];    // maximum points array
            int[] studentPoints = new int[numberOfStudents];

            for(int i = 0; i < students.length; i++){
                students[i] = sc.next();                            // get students' names
            }
            for(int i = 0; i < attendance.length; i++){
                attendance[i] = sc.next();                          // get students' attendance lists
                studentsMaxPoints[i] = attendance[i].length();      // student's maximum attendance points
            }
            for(int i = 0; i < attendance.length; i++){
                for(int j = 0; j < attendance[i].length(); j++){
                    char status = attendance[i].charAt(j);
                    studentsMaxPoints[i] = status == 'M' ?                                  // if: 'M'
                                           studentsMaxPoints[i] - 1 : studentsMaxPoints[i]; // then: student's maximum points decrement by 1
                    studentPoints[i] =  status == 'P' ?                                     // if: 'P'
                                        studentPoints[i] + 1 : studentPoints[i];            // then: increments student's points by 1
                }
            }
            // OUTPUT
            numberOfStudents = 0;
            boolean isFirstPrinted = false;
            for(int i = 0; i < students.length; i++){
                float studentPointsInPercents;
                studentPointsInPercents = (studentPoints[i] * 100f) / studentsMaxPoints[i]; // turn student's points in percents
                if(studentPointsInPercents < 75){
                    System.out.print(isFirstPrinted ? " " : "");
                    System.out.print(students[i]);
                    isFirstPrinted = true;
                }
            }
            System.out.println();
        }
    }
}/*
4
1
Justin
PAAPP
2
Justin Chris
PAAPP PPPPA
1
Sunny
PPPAM
4
Mansi Arjun Nikhil Taneja
PPPPMPPAPP AAMAAPP PPPPAAP PPPAAAMPP
5
Mansi Arjun Nikhil Taneja Isa
PPPPMPPAPP AAMAAPP PPPPAAP PPPAAAMPP PPPPMPPAPP
*/