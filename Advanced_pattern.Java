public class Advanced_pattern{
     public static void Butterfly(int n){
         for(int i =1; i<=n; i++){
             for(int j = 1; j<=i; j++){
                 out.print("*");
             }
             for(int k = 1; k<=2*(n-i); k++){
                 out.print(" ");
                 } for(int l = 1; l<=i; l++){
                 out.print("*");
             }
             out.println();
         } for(int i = n; i>=1; i--){
             for(int j = 1; j<=i; j++){
                 out.print("*");
             } for(int k =1; k<=2*(n-i); k++){
                 out.print(" ");
             } for(int l = 1; l<=i; l++){
                 out.print("*");
             }
             out.println();
         }
     }

    public static void main(String[] args) {
        Butterfly(7);
    }
 }