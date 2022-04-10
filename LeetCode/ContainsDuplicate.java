public class ContainsDuplicate {
    public static checkContainsDuplicate(int[] nums){
        // O(n) Time | O(1) Space
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i : nums){
            if(set.contains(i)){
                return true;
            } else{
                set.add(i);
            }
        }
        return false;
    }
}