package hust.soict.globalict.lab01;

import javax.swing.JOptionPane;

public class DisplayDay {
    public static void main(String[] args) {
        String yearString;
        int year;
        boolean isLeapYear;
        String monthString;
        int days = 100;
        boolean isValidMonth = true;
        boolean invalidPreviousInput = false;

        yearString = JOptionPane.showInputDialog(null, "Please enter year: ", "Year", JOptionPane.INFORMATION_MESSAGE);
        year = Integer.parseInt(yearString);
        while(year < 0) {
            yearString = JOptionPane.showInputDialog(null, "Invalid year! Please enter again: ", "Year", JOptionPane.INFORMATION_MESSAGE);
            year = Integer.parseInt(yearString);
        }

        if(year % 4 == 0) {
            isLeapYear = year % 100 != 0 || year % 400 == 0;
        }else {
            isLeapYear = false;
        }

        do {
            isValidMonth = true;
            String message;
            if(!invalidPreviousInput) {
                message = "Please enter month: ";
            }else {
                message = "Invalid month! Please enter again: ";
            }
            monthString = JOptionPane.showInputDialog(null, message, "Month", JOptionPane.INFORMATION_MESSAGE);
            switch(monthString) {
                case "1":
                case "Jan":
                case "Jan.":
                case "3":
                case "Mar":
                case "Mar.":
                case "5":
                case "May":
                case "May.":
                case "7":
                case "July":
                case "Jul":
                case "8":
                case "Aug":
                case "Aug.":
                case "10":
                case "Oct":
                case "Oct.":
                case "12":
                case "Dec":
                case "Dec.":
                    days = 31;
                    break;
                case "2":
                case "Feb":
                case "Feb.":
                    if(isLeapYear) {
                        days = 29;
                    }else {
                        days = 28;
                    }
                    break;
                case "4":
                case "Apr":
                case "Apr.":
                case "6":
                case "June":
                case "Jun":
                case "9":
                case "Sep":
                case "Sept.":
                case "11":
                case "Nov":
                case "Nov.":
                    days = 30;
                    break;
                default:
                    isValidMonth = false;
                    invalidPreviousInput = true;
            }
        }while(!isValidMonth);

        JOptionPane.showMessageDialog(null, "The number of days is: " + days, "Result",JOptionPane.INFORMATION_MESSAGE);
    }
}
