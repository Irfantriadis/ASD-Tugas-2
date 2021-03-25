package modul_2_smt2;
public class no2 {
    public static void main(String[]args){
        int[][]A={
            {1,2},
            {4,5},
            {7,8}
        };
        
        int[][]B={
            {5,2},
            {7,3},
            {9,2}
        };
        
        if((A.length==B.length)&&(A[0].length==B[0].length)){
            int[][]C=new int[A.length][A[0].length];
            for(int i=0; i<A.length; i++){
                for(int j=0; j<A[0].length; j++){
                    C[i][j]=A[i][j]-B[i][j];
                }
            }
            
            for(int[]c: C){
                for(int q: c){
                    System.out.print(q+" ");
                }
                System.out.println();
            }
            System.out.println(C[1][1]);
        }
        else {
            System.out.println("Matrix Tidak Valid");
        }
        System.out.println();
        System.out.println("Irfan Triadi Saputra");
    }
    }

