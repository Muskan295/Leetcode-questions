public class RecursiveSequence {
    static long sequence(int n) {
        long sum=0;
        long start=1;
        final long  MOD=1000000007;
        

        for(int i=1;i<=n;i++){
            long product=1;
            for(long j=start;j<start+i;j++){
                product=(product*j) % MOD;
            }
                sum=(sum+product)%MOD;
                start=start+i;
                
        }
        return sum;
    }
}
