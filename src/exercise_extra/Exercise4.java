package exercise_extra;

public class Exercise4 {
    public static void main(String[] args) {
        String str = "codegymDaNang";
        String[] newArr = str.split("");
        String newStr = "";
        for (int i = 0; i < newArr.length; i++) {
            if(newArr[i].equals(newArr[i].toUpperCase())){
                newStr += " " + newArr[i];
            }else{
                newStr += newArr[i];
            }
        }
        System.out.println(newStr.toLowerCase().trim());
    }
}
