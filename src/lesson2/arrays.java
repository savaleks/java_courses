package lesson2;

public class arrays {

    public static void main(String[] args){

        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};
        double sum = 0;
        double sum1 = 0;

        // pirmas blokas
        for(int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        System.out.println("pirma suma: " + sum);
        double vidurkis = sum/a.length;
        System.out.println("pirmas vidurkis: " + vidurkis);

        // antras blokas
        for(int j = 0; j < b.length; j++){
            sum1 = sum1 + b[j];
        }
        System.out.println("antra suma: " + sum1);
        double vidurkis1 = sum1/b.length;
        System.out.println("antras vidurkis: " + vidurkis1);

        //skirtumas tarp vidurkiu;
        double skirtumas = vidurkis - vidurkis1;
        System.out.println("skirtumas tarp vidurkiu: " + skirtumas);

        }
}
