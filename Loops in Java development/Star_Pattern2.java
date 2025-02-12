public class Star_Pattern2 {
    public static void main(String[] args) {
        String star = "*";

        int[] array1 = { 3, 1, 0 };

        for (int i : array1) {
            System.out.println(star.repeat(i) + "." + star.repeat(i));
        }

        int[] array2 = {1,2,3,4,3,2,1};

        for(int i:array2){
            System.out.println(star.repeat(i));
        }
    }
}
