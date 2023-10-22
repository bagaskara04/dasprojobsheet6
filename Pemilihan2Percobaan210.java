import java.util.Scanner;

public class Pemilihan2Percobaan210 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        float totalSudut, sudut1, sudut2, sudut3;

        System.out.print("Masukkan sudut 1 : ");
        sudut1 = input10.nextFloat();
        System.out.print("Masukkan sudut 2 : ");
        sudut2 = input10.nextFloat();
        System.out.print("Masukkan sudut 3 : ");
        sudut3 = input10.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;
        System.out.println("Total sudut adalah : " +totalSudut);

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku - siku");
            if ((sudut1 == 60) || (sudut2 == 60) || (sudut3 == 60))
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut3 == sudut1))
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else 
                System.out.println("Bukan segitiga");
        // } else if(totalSudut == 180) {
        //     if ((sudut1 == 60) || (sudut2 == 60) || (sudut3 == 60))
        //         System.out.println("Segitiga tersebut adalah segitiga sama sisi");
        // } else if(totalSudut == 180) {
        //     if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut3 == sudut1));
        //         System.out.println("Segitiga tersebut adalah segitiga sama kaki");
        // } else if(totalSudut == 180) {
        //         System.out.println("Segitiga tersebut adalah segitiga sembarang");
        } else
            System.out.println("Bukan segitiga");
    }
}
