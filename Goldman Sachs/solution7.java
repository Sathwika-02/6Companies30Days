int distributeincircle(int M,int N,int k){
int p=(M+k-1)%N;
if(p==0) return N;
return p;
}