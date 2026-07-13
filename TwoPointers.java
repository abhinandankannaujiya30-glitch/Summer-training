class TwoPointers 
 {
    public static void main(String[] args) 
    {
    int arr[]= {10,20,30,40};
    int target = 70;
    for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]+arr[j]==target)
            {
                System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                return;
            }
        }
    }
}
 }