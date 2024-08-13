class Solution {
    List<List<Integer>> l=new ArrayList<>();
    public void find(int[] c,int t,int i,int sum,List<Integer> l1)
    {
        
        if(sum==t )
        {
            if(!l.contains(l1))
            {
                l.add(new ArrayList<>(l1));
            }
            
        }
        if(i>c.length-1)
        return;

        if(  sum+c[i]<=t)
        {
        
        l1.add(c[i]);
        find(c,t,i+1,sum+c[i],l1);
         l1.remove(l1.size()-1);
         while(i+1<c.length&&c[i]==c[i+1])
         i++;
         find(c,t,i+1,sum,l1);
         }

    }

    public List<List<Integer>> combinationSum2(int[] c, int t) {
        Arrays.sort(c);
        List<Integer> l1=new ArrayList<>();
        find(c,t,0,0,l1);
        return l;

        
    }
}