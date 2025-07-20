 public class Diamond_pattern {
      public static void Diamond(int n){
          for(int i = 1; i<=n; i++){
              for(int j = 1; j<=(n-i); j++){
                  out.print(" ");
              } for(int j = 1; j<=(2*i-1); j++){
                  out.print("*");
              }
              out.println();
          } for(int i = n; i>=1; i--){
              for(int j = 1; j<=(n-i); j++){
                  out.print(" ");
              } for(int j = 1; j<=(2*i-1); j++){
                  out.print("*");
              }
              out.println();
          }
      }

    public static void main(String[] args) {
        Diamond(10);
    }
}