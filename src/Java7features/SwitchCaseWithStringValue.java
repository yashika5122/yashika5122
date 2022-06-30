package Java7features;

public class SwitchCaseWithStringValue {
//    Switch case accepting string value prior to java 7 it only accept the integer and char

    public static void main(String[] args) {
        String day = "sun";
        switch (day) {
            case "sun":
                System.out.println(" sunday");
                break;
            case "mon":
                System.out.println(" Monday");
                break;
            default:
                System.out.println(" day not found");
                break;
        }
    }

}
