package Conditions;

public class SwitchCase {
  public static void main(String[] args) {
        System.out.println("Running Switch case statement.");
        
        int day=44;
        
        switch(day){
            case 1:
                System.out.println("Day is 01");
                break;
            case 2:
                System.out.println("Day is 02");
                break;
            case 3:
                System.out.println("Day is 03");
                break;
            default:
                System.out.println("No case match!!");
        }
  }
}
