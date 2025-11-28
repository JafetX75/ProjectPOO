public class ArregloBidimensional {
    private int[][] FIgura;
    private int altura, anchura;

    public ArregloBidimensional(int altura, int anchura){
        this.FIgura = new int[altura][anchura];
        this.altura = altura;
        this.anchura = anchura;
    }
    public void anchuraNumero(){
        for(int z = 0; z < anchura; z++){
                FIgura[1][z] = 1;
            }
    }
    public void Altura(){
        for(int t = 0; t< altura; t++){
            FIgura[t][1] = 1;
        }
    }
    public void Cuadrado(){
        for(int u = 0; u < altura; u++) {
                FIgura[u][0] = 1;
                FIgura[9][u] = 1;
            for (int y = 1; y < anchura; y++) {
                FIgura[0][y] = 1;
                FIgura[y][9] = 1;
            }
        }
    }

        public void Renderizado(){
            for(int i = 0; i < altura; i++){
                for (int y= 0;y<anchura; y++){
                    System.out.print(FIgura[i][y]+"\t");
                }
                System.out.println();
        }
    }

}