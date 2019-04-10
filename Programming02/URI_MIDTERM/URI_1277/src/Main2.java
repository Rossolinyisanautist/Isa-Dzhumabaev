import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, points, medicals, n = sc.nextInt();   sc.nextLine();
        float minimum = 0;

        while(n-- > 0){
            sc.nextLine();

            String[] students = sc.nextLine().split(" "),

                    attendance = sc.nextLine().split(" ");

            String output = "";

            for(i = 0; i < attendance.length; i++){
                medicals = points = 0;
                for(char status : attendance[i].toCharArray()){
                    medicals += status == 'M' ? 1 : 0;
                    points +=  status == 'P' ? 1 : 0;
                    minimum = (attendance[i].length() - medicals) * 0.75f;
                }
                if(points < minimum)
                    output = output.concat(students[i] + " ");
            }
            System.out.println(output.trim());
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