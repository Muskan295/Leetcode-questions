public class Power_of_two {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        int result=1;
        for(int i=1;i<31;i++){
            result=result*2;
            if(result==n){
                return true;
            }
        }
        return false;
    }
}