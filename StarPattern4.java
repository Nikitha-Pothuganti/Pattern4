public class StarPattern4 {
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1&&(j==3||j==4)){
                    System.out.print("*");
                }else if (i==3&&j==4){
                    System.out.print("*");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        } 
}
