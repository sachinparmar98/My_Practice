public class XORoperationInArray {

    public int xorOperation(int n, int start) {
        /*
         * int temp[]=new int[n];
         * for(int i=0;i<n;i++)
         * {
         * temp[i]=start+2*i;
         * }
         * int xor=temp[0];
         * for(int i=1;i<n;i++)
         * {
         * xor=xor^temp[i];
         * }
         * return xor;
         */
        // optimize above code

        int xor = 0;
        for (int i = 0; i < n; i++) {

            xor = xor ^ (start + 2 * i);
        }
        return xor;
    }

}
