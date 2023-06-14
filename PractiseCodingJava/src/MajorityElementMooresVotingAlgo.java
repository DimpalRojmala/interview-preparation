public class MajorityElementMooresVotingAlgo {

    // In this algo start from first candidate and increase counter if next element is same and decrease it if its different.
    // wheneven count is zero .make  current element as candidate and reset count as 1.
    //last check if candidate has occurance more than n/2
    public static void main(String[] args) {

        int[] a= new int[]{2,3,4,5,6,4,5,5,5,5,5};

        System.out.println(findMajorityElement(a));
    }

    public static int findMajorityElement(int[] a) {
        int candidate = a[0];
        int count=1;
        for(int i=1;i<a.length;i++)
        {
            if(candidate ==a[i])
            {
                count++;
            }else
            {
                count--;
            }
            if(count==0)
            {
                candidate=a[i];
                count =1;
            }

        }
        count=0;
        for(int val:a)
        {
            if(candidate==val)
            {
                count++;

            }
        }
        if(count>a.length/2)
        {
            return candidate;
        }else return -1;
    }
}
