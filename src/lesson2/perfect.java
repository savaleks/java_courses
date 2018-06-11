package lesson2;

public class perfect {
    public static void main(String[] args){
        int min = 1;
        int max = 1000;

        for (min = 1; min <= max; min++) {
            int sum = 0;
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
