class ReverseBits {
    public static long reverseBits(long n) {
		// Write your code here
		// first step converting and reversing the long n into stream of 0s1s
		long nn=n;
		long one =1;
		String rev = "";
		for(int i=0;i<32;i++){
			
			if((n&one)==1){
				rev=rev+1;
				n=n>>1;

			}else{
				rev=rev+0;
				n=n>>1;
			}
		}
		long j = 1;
		long product=0;
		for(int i = rev.length()-1; i>=0; i--){
			if(rev.charAt(i)=='1'){
				product+=j;

			}
			j=j*2;
		}
		if(nn==0)return 0;
		return product;
	}
    public static void main(String[] args) {
        System.out.println(reverseBits(3));
        
    }
}