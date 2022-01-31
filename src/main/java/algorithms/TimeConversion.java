package algorithms;

//  Given a time in -hour AM/PM format, convert it to military (24-hour) time.
//
//  Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
//  - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
//
//  Example
//  S = '12:01:00PM'
//  Return '12:01:00'.
//
//  S = '12:01:00AM'
//  Return '00:01:00'.
//
//  Function Description
//
//  Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.
//
//  timeConversion has the following parameter(s):
//
//  string s: a time in 12 hour format
//  Returns
//
//  string: the time in 24 hour format
//  Input Format
//
//  A single string S that represents a time in 12-hour clock format (i.e.: hh:mm:ssAM  or hh:mm:ssPM).
//
//  Constraints
//
//  All input times are valid

import java.util.Scanner;

public class TimeConversion {

    public TimeConversion(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o horário de conversão no formato 00:00:00AM OU PM");

        String time = scan.nextLine();
        scan.close();
        timeConversion(time);
    }

    private void timeConversion(String s){
        String dayMoment = s.replaceAll("[^A-Z]", "");
        String hourOfDay = s.replaceAll("[A-Z]", "");
        String onlyHour = s.substring(0,2);

        if(dayMoment.equals("AM")){
            String convertedTime = null;
            if (onlyHour.equals("12")) {
                convertedTime = "00";
            }

            if (convertedTime != null){
                hourOfDay = hourOfDay.replaceAll("^.{2}", convertedTime);
            }

        } else if(dayMoment.equals("PM")){
            String convertedTime = null;
            switch(onlyHour){
                case "01":
                    convertedTime = "13";
                    break;
                case "02":
                    convertedTime = "14";
                    break;
                case "03":
                    convertedTime = "15";
                    break;
                case "04":
                    convertedTime = "16";
                    break;
                case "05":
                    convertedTime = "17";
                    break;
                case "06":
                    convertedTime = "18";
                    break;
                case "07":
                    convertedTime = "19";
                    break;
                case "08":
                    convertedTime = "20";
                    break;
                case "09":
                    convertedTime = "21";
                    break;
                case "10":
                    convertedTime = "22";
                    break;
                case "11":
                    convertedTime = "23";
                    break;
                case "12":
                    convertedTime = "12";
                    break;
            }
            if (convertedTime != null){
                hourOfDay = hourOfDay.replaceAll("^.{2}", convertedTime);
            }
        }

        System.out.println(hourOfDay);
    }
}
