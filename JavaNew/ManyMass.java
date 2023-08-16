public class ManyMass {
    public static void main(String[] args){
        int [] [] matrice = {{1,2,3,4,5},
                            {5,4},
                            {3,2,1,0}};
        for (int i = 0; i < matrice.length; i++) {
            for(int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }System.out.println();
        }
        
    }
}
