package modul_2_smt2;
public class no3 {
    public static void main(String[]args){
        int[][]A={
            {1,2,3},
            {4,5,6}
        };
        
        int[][]B={
            {5,2},
            {7,3},
            {9,2}
        };
        
        if(A[0].length == B.length){
            int[][]C=new int[A.length][B[0].length];
            for(int i=0; i<A.length; i++){
                for(int j=0; j<B[0].length; j++){
                    for(int k=0; k<A[0].length; k++){
                    C[i][j]=A[i][k]*B[k][j];
                }
            }
        }
            {
            for(int[]c: C){
                for(int i: c){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        }
        else {
            System.out.println("Matrix Tidak Valid");
        }
        System.out.println();
        System.out.println("Irfan Triadi Saputra");
    }
    }

