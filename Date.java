public class Date {
    private String day;
    private int date;
    private int month;
    private int year;

    public Date(String day, int date, int month, int year) {
        this.day = day;
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String americanFormat() {
        return "American format: " + day + " " + date + "/" + month + "/" + year;
    }

    public static void main(String[] args) {

}