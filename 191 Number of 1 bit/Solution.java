class Solution {
    public int hammingWeight(int n) {
     int a=0;
     double num=n;
     double s=0;
     do{
        if(num%2==1){

            a++;
        }
        s=s*10+num%2;
        num=Math.floor(num/2);
        System.out.println(num);
     }while(num!=0 );
     System.out.println(a);
     System.err.println(s);
     return a;  
    }
    public static void main(String[] args) {
        System.out.println("hi");
        Solution s=new Solution();
        s.hammingWeight(2147483645);
        System.out.println("hi");

    }
}
// 11-->1011
// 11-->5
// 5-->2
// 2-->