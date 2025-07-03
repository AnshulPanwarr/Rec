public class TwoMoveObs {
  public static int noofpaths(int arr[][],int i,int j,int m,int n){
    if(i>=m || j>=n){
      return 0;
    }
    if(arr[i][j] == 0){
      return 0;
    }
    else{


      if (i == m - 1 && j == n - 1) return 1;
      int right = noofpaths(arr, i, j+1, m, n);
      int down = noofpaths(arr, i+1, j, m, n);

      return right+down;

      
    }

    
  
    

   }

   public static void main(String args[]){
      int [][] arr = {
        {1, 1, 1, 1},
        {1, 0, 1, 1},
        {1, 1, 0, 1},
        {1, 1, 1, 1},
        

      
   };
   int m = arr.length;
   int n = arr[0].length;

   int sx= 1;
   int sy =1;

   int paths = noofpaths(arr, 0, 0, m, n);
   System.out.println(paths);


   
}
}
