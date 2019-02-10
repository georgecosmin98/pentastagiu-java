import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String fname;
    private String lname;
    private Date birthDate;
    Format form = new SimpleDateFormat("yyyy/MM/dd");

    public User(String fname, String lname, String birthDate) {
        this.fname = fname;
        this.lname = lname;
        setBirthDate(birthDate);
    }


    public String getName() {
        return fname + " " + lname;
    }

    public String getInfo() {
        return fname + " " + lname + " " + form.format(birthDate);
    }

    public void setBirthDate(String birthDate) {
        try {
            this.birthDate = (Date) form.parseObject(birthDate);
        } catch (ParseException e) {
            System.out.println("Date invalid: " + e.getStackTrace());
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
