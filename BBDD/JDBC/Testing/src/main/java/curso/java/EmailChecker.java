package curso.java;

public class EmailChecker {


    public boolean isValidEmail(String email) {
        boolean isvalid = email.contains("@");
        return isvalid;
    }
}
