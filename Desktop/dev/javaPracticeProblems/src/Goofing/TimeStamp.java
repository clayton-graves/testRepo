package Goofing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {
    public static void main (String[] args){
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        System.out.println(timeStamp);
        System.out.println(timeTranslate(timeStamp));
    }

    public static String timeTranslate(String time){
        String pieces[] = new String[5];
        String basket = "";
        int i = 0;
        for(char c : time.toCharArray()){
            if(c == '.'){
                pieces[i] = basket;
                System.out.println(pieces[i]);
                basket = "";
                i++;
                continue;
            }
            basket += c;
        }
        String tranTime = "";
        int month = Integer.parseInt(pieces[1]);
        String monthString = "";
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        tranTime = monthString +" ";
        int day = Integer.parseInt(pieces[2]);
        tranTime += day + ", ";
        int year = Integer.parseInt(pieces[0]);
        tranTime += year + ", ";
        int hour = Integer.parseInt(pieces[3]);

        String timeappendage = "am";
        if (hour >= 12 && hour != 24){
            timeappendage = "pm";
        }
        else if (hour < 12 && hour != 24){
            timeappendage = "am";
        }
        hour = hour%12;
        if (hour == 0){
            hour = 12;
        }
        String clock = "";
        clock = Integer.toString(hour) +":";
        int minute = Integer.parseInt(pieces[4]);
        clock += Integer.toString(minute) + timeappendage;
        tranTime += clock;
        return tranTime;
    }
}
