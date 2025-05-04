public class Main{
    public static void main(String[] args){
        //System.out.println(Data.MAX);
        int grid2[][] = {{12, 540, 450, 440}, {220, 450, 440, 190}};
        Data d = new Data(grid2);
        //d.repopulate();
        System.out.println(d.countIncreasingCols());
    }
}