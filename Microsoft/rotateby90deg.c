void rotate(int n,int a[][n])
{
    int p[n][n];
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           p[i][j]=a[j][n-i-1];
       }
   }
    for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           a[i][j]=p[i][j];
       }
   }
   
}
