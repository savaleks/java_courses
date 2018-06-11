package lesson2;
//rasti tobula skaiciu duotam intervale;
public class perfect {
    public static void main(String[] args){
        //intervalas nuo 1 iki 1000
        int min = 1;
        int max = 1000;

        for (min = 1; min <= max; min++) {
            int sum = 0;
            //dalina ir lygina skaicius
            for (int e = 1; e < min; e++) {
                if ((min % e) == 0) {
                    sum += e;
                }
            }
            if (sum == min){
                System.out.println(sum);
            }
        }
    }
}
