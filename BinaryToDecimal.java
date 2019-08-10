class BinaryToDecimal
{
	public static void main(String[] args) {
		int[] bitsArray={1,0,0,1,1};
		Integer[] bitsArrayReversed=new Integer[bitsArray.length];
		int x=0;

		for(int i=(bitsArray.length-1);i>=0;i--)
        {
        	
            bitsArrayReversed[x]=bitsArray[i];
            x++;
            
        }
        double sum=0;
        for(int i=0;i<bitsArrayReversed.length;i++)
        {
        	
            sum=sum+(bitsArrayReversed[i]* Math.pow(2,i));

        }
        System.out.println((long)sum);

        // for(int temp:bitsArrayReversed)
        // {
        // 	System.out.println(temp);
        // }
	}
}