public class SequenciaCinco {
    public static void main(String[] args) throws Exception {
        int [][] matriz= {
        {2, 1, 1, 1, 1},
        {1, 2, 1, 1, 1},
        {1, 1, 2, 1, 1},
        {1, 1, 1, 2, 1},
        {1, 1, 1, 1, 2}
    };
    System.out.println(maiorProduto(matriz));
    }

    public static int maiorProduto(int[][] matriz){
        int n= matriz.length;
        int maiorProduto=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if (j+4<n){
                    maiorProduto= Math.max(maiorProduto, matriz[i][j] * matriz[i][j+1] * matriz[i][j+2] * matriz[i][j+3] * matriz[i][j+4]);
                }
                if (i+4<n){
                    maiorProduto = Math.max(maiorProduto, matriz[i][j] * matriz[i + 1][j] * matriz[i + 2][j] * matriz[i + 3][j] * matriz[i + 4][j]);
                }
                if (i+4<n && j+4<n){
                    maiorProduto = Math.max(maiorProduto, matriz[i][j] * matriz[i + 1][j + 1] * matriz[i + 2][j + 2] * matriz[i + 3][j + 3] * matriz[i + 4][j + 4]);
                }
                if (i+4<n && j-4>=0){
                    maiorProduto = Math.max(maiorProduto, matriz[i][j] * matriz[i + 1][j - 1] * matriz[i + 2][j - 2] * matriz[i + 3][j - 3] * matriz[i + 4][j - 4]);
                }
            }
        }
        return maiorProduto;
    }
}
