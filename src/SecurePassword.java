public class SecurePassword {
    private String password;

    public SecurePassword(String password) {
        this.password = password;
    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }
    public boolean isSecure() {
        if(isLongEnough() && containsUppercase() && containsLowercase() && containsDigit() && containsSpecialSymbol()){
            return true;
        } else{
            return false;
        }
    }
    public String status() {
        String str = "";
        if(isSecure()){
            str += "Password is secure";
            return str;
        }
        if(!isLongEnough()){
            str += "The password must be at least 8 characters \n";
        }
        if(!containsUppercase()){
            str += "The password must contain at least one uppercase character \n";
        }
        if(!containsLowercase()){
            str += "The password must contain at least one lowercase character \n";
        }
        if(!containsDigit()){
            str += "The password must contain at least one number \n";
        }
        if(!containsSpecialSymbol()){
            str += "The password must contain at least one special symbol \n";
        }
        return str;
    }

    private boolean isLongEnough() {
        if (password.length() >= 8){
            return true;
        } else{
            return false;
        }
    }
    private boolean containsUppercase() {
        /* this one is completed for you as a hint for how to do the others! */
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return checkString(upperCaseLetters);  // this method implemented below
    }
    private boolean containsLowercase() {
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        return checkString(lowerCaseLetters);
    }
    private boolean containsDigit() {
        if(password.indexOf("1") != -1){
            return true;
        } else if(password.indexOf("2") != -1){
            return true;
        }else if(password.indexOf("3") != -1){
            return true;
        }else if(password.indexOf("4") != -1){
            return true;
        }else if(password.indexOf("5") != -1){
            return true;
        }else if(password.indexOf("6") != -1){
            return true;
        }else if(password.indexOf("7") != -1){
            return true;
        }else if(password.indexOf("8") != -1){
            return true;
        }else if(password.indexOf("9") != -1){
            return true;
        }else if(password.indexOf("0") != -1){
            return true;
        } else{
            return false;
        }
    }
    private boolean containsSpecialSymbol() {
        if(password.indexOf("!") != -1){
            return true;
        } else if(password.indexOf("@") != -1){
            return true;
        }else if(password.indexOf("#") != -1){
            return true;
        }else if(password.indexOf("$") != -1){
            return true;
        }else if(password.indexOf("%") != -1){
            return true;
        }else if(password.indexOf("^") != -1){
            return true;
        }else if(password.indexOf("&") != -1){
            return true;
        }else if(password.indexOf("*") != -1){
            return true;
        }else if(password.indexOf("?") != -1){
            return true;
        } else{
            return false;
        }
    }
    private boolean checkString(String characterString) {

        for(int idx = 0; idx < password.length(); idx++){
            if(characterString.indexOf(password.substring(idx, idx+1)) != -1){
                return true;
            }
        }
        return false;
    }
}