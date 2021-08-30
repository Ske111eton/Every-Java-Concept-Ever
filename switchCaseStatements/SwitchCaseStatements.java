package switchCaseStatements;

public class SwitchCaseStatements {
    public static void main(String[] args) {
        int dayOfWeek = 7;

        switch(dayOfWeek){
            case 1:
                System.out.println("Eww!! Monday");
                break;
            case 2:
                System.out.println("Jai Hanuman");
                break;
            case 3:
                System.out.println("Wed Nes Day");
                break;
            case 4:
                System.out.println("Fast");
                break;
            case 5:
                System.out.println("Jumma");
                break;
            case 6:                     //Merging two Cases , when we have to print same thing for two cases.
            case 7:
                System.out.println("Weekend YAY!!!");
                break;
          //  case 7:
          //      System.out.println("Oh no tomorrow's Monday.");
          //      break;
            default:
                System.out.println("Invalid day Number ---@");
        }
    }
}
