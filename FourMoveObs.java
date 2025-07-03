public class FourMoveObs {
  public static int noofpaths(int arr[][],boolean visited[][],int i,int j,int m,int n){
    if(i<0 || j<0 || i>=m || j>=n){
      return 0;
    }

    if(arr[i][j] == 0 || visited[i][j] ){
      return 0;
    }

    if(i==m-1 && j==n-1){
      return 1;
    }

    visited[i][j] = true;

    int total = 0;

    total += noofpaths(arr,visited, i-1, j, m, n);
    total += noofpaths(arr,visited, i, j-1, m, n);
    total += noofpaths(arr,visited, i+1, j, m, n);
    total += noofpaths(arr, visited,i, j+1, m, n);

    visited[i][j] = false;

    return total;
  }


  public static void main(String[] args) {
    int arr[][] = {
      {1, 1, 1},
      {1, 0, 1},
      {1, 1, 1}
    };

    int m = arr.length;
    int n = arr[0].length;

    boolean visited[][] = new boolean[m][n];

    int ans = noofpaths(arr,visited,0,0,m,n);
    System.out.println(ans);
  }
}
