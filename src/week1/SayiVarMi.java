package week1;

public class SayiVarMi {
    public static void main(String[] args) {

        int[] sayilar = new int[] {1,2,3,5,6,4,8};
        int aranacak = 1;
        boolean varMi = false;
        for (int i = 0; i < sayilar.length; i++) {
            if(sayilar[i] == aranacak) {
                varMi = true;
                break;
            }
        }
        if(varMi) {
            System.out.println("Var");
        }
        else {
            System.out.println("Yok");
        }
    }
}
