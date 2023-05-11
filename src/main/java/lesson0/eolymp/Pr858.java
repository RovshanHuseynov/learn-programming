package lesson0.eolymp;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Pr858 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bDay = in.nextInt();
        int bMonth = in.nextInt();
        int curDay = in.nextInt();
        int curMonth = in.nextInt();
        int curYear = in.nextInt();

        int bYear = curYear;
        if(curMonth > bMonth ||
                (curMonth == bMonth && curDay > bDay)) bYear++;

        if(bDay == 29 && bMonth == 2){
            while(!Year.of(bYear).isLeap()){
                bYear++;
            }
        }

        LocalDate curDate = LocalDate.of(curYear,curMonth,curDay);
        LocalDate bDate = LocalDate.of(bYear,bMonth,bDay);
        //System.out.println(bDate);
        //System.out.println(curDate);
        System.out.println(ChronoUnit.DAYS.between(curDate, bDate));
    }
}