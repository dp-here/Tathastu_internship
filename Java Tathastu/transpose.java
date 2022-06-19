public class transpose{
    public static void main(String args[]) {
    int a[][]={{2,3,4},{1,2,4},{6,6,2}};
    int [][]t=new int[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            t[i][j]=a[j][i];
        }
    }
    System.out.println("Original array is  ");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
     System.out.println("Transpose of array is  ");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        System.out.print(t[i][j]+" ");
        }
        System.out.println();
    }
    
    }
}