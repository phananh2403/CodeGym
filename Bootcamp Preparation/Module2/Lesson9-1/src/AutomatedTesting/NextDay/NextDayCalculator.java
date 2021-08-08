package AutomatedTesting.NextDay;

public class NextDayCalculator {
    public static String findNextDay(int day, int month, int year) {
        int[] month31Days = {1, 3, 5, 7, 8, 10, 12};
        int[] month30Days = {4, 6, 9, 11};

        if (year > 0) {
            for (int month31Day : month31Days) {
                if (month == month31Day && month != 2) {//xét tháng 31 ngày
                    if (day > 0 && day <= 31) {//xét ngày từ 1-31
                        day++;
                        if(month>12){
                            day = 1;
                            month = 1;
                            year++;
                        }

                    }
                }
                if (day > 31) {
                    day = 1;
                    month++;
                    if(month>12){
                        day = 1;
                        month = 1;
                        year++;
                    }
                }
            }

            for (int month30Day : month30Days) {
                if (month == month30Day && month != 2) {//xét tháng 30 ngày
                    if (day > 0 && day <= 30) {//xét ngày từ 1-30
                        day++;
                        if(month>12){
                            day = 1;
                            month = 1;
                            year++;
                        }

                    }
                    if (day > 30) {
                        day = 1;
                        month++;
                        if(month>12){
                            day = 1;
                            month = 1;
                            year++;
                        }
                    }
                }
            }

            if (checkYear(year)) {//năm nhuận tháng 2 có 29 ngày
                if (month == 2) {
                    if (day > 0 && day <= 29) {
                        day++;

                    }
                    if (day > 29) {//tháng 2
                        day = 1;
                        month++;
                    }
                }
            } else {
                if (month == 2) {
                    if (day > 0 && day <= 28) {//năm không nhuận tháng 2 có 28 ngày
                        day++;

                    }
                    if (day > 28) {//tháng 2
                        day = 1;
                        month++;
                    }
                }
            }

        }


        return "Ngay ke tiep la:" + day + "/" + month + "/" + year;
    }

    public static boolean checkYear(int year) {
        if ((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)))
            return true;
        return false;
    }
}
