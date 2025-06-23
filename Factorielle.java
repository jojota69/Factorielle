public class Factorielle {
    public static void main(String[] args) {
        
        int a = 5;
        int fact = a;

        for (int i=1;i<a;i++){

            fact = fact * (a-i);

        }

        System.out.println(fact);


    }

}
