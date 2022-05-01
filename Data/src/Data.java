import java.text.SimpleDateFormat; 
import java.util.Date;

public class Data {
    private SimpleDateFormat formatterDay = new SimpleDateFormat("dd"); 
    private SimpleDateFormat formatterMonth = new SimpleDateFormat("MM"); 
    private SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

    private Date date = new Date();
    private int day = Integer.parseInt(formatterDay.format(date)) ;
    private int month = Integer.parseInt(formatterMonth.format(date));
    private int year = Integer.parseInt(formatterYear.format(date));

    public Data(int day, int month, int year) {
        if(day>0 && day<31) {this.day = day;}
        if(month>0 && month<13) {this.month = month;}
        this.year = year;
    }

    public Data() {
        this.day = Integer.parseInt(formatterDay.format(date)) ;
        this.month = Integer.parseInt(formatterMonth.format(date));
        this.year = Integer.parseInt(formatterYear.format(date));
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void getDay() {
        System.out.println(this.day);
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public void getMonth() {
        System.out.println(this.month);
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void getYear() {
        System.out.println(this.year);
    }

    public void apresentaData(boolean season) {
        System.out.println(this.day + "/" + this.month + "/" + this.year );
        if(season) {
            if(this.month > 2 && this.month < 6 ) {
                System.out.println("Outono");
            } else if(this.month > 5 && this.month < 9 ) {
                System.out.println("Inverno");
            } else if(this.month > 8 && this.month < 12 ) {
                System.out.println("Primavera");
            } else if(this.month > 11 && this.month < 3 ) {
                System.out.println("Verão");
            }
        }
    }

    public void setTomorrow() {
        if (this.day < 30) {
            this.day += 1;
        } else if(this.month < 12) {
                this.month += 1;
                this.day = 1;
        } else {
            this.year += 1;
            this.month = 1;
            this.day = 1;
        }
    }
}
