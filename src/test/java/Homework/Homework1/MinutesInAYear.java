package Homework.Homework1;

public class MinutesInAYear {
    public static void main(String[] args) {
        int data=3456789;
        int hoursOfDay=24;
        int minutesOfHour=60;
        int minutesOfDay=hoursOfDay*minutesOfHour;
        int daysOfYear=365;
        int minutesOfYear=daysOfYear*minutesOfDay;
        System.out.println(minutesOfYear);
        int totalYear= data/minutesOfYear;
        int remainder=data%minutesOfYear;
        int totalDays = remainder/minutesOfDay;
        System.out.println(data + " minutes are " + totalYear + " years and " + totalDays + " days.");



    }
}
