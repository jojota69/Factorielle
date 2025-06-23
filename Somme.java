public class Somme{
    public static void main(String[] args) {
        
        for (int j=1;j<1000000;j++){
            
            int a = j;
            String nombre = Integer.toString(a);
            int[] tabChiffre = new int[nombre.length()];
            
            for (int i=0;i<nombre.length();i++){
                
                tabChiffre[i] = Character.getNumericValue(nombre.charAt(i));
                
            }

            int somme = 0;

            for (int i=0;i<tabChiffre.length;i++){

                int fact = factorielle(tabChiffre[i]);
                somme += fact;

            }

            if (a == somme){
                System.out.println(a);
            }
            else{
                continue;
            }

        }

            



    }

    public static int factorielle(int chiffre){

        int fact = chiffre;

        if(chiffre==1 || chiffre==0){
            return 1;
        }
        else{
            for (int i=1;i<chiffre;i++){
    
                fact = fact * (chiffre-i);
    
            }
    
            return fact;
        }

    }
}