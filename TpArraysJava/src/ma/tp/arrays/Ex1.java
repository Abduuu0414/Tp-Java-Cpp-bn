package ma.tp.arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        int unique = 0;
        
        for (int num : arr) {
            unique ^= num;// ici j'ai travaille avec XOR entre num et unique
        }
        
        System.out.println("Le nombre unique est : " + unique);
    }
}
