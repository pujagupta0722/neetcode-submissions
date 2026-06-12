class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        /*sort(nums.begin(),nums.end());
        for(int i=0; i<nums.size()-1; i++){
            if(nums[i] == nums[i+1])
            return true;
        }
        return false;*/
        unordered_set<int> seen;
        for(int i=0; i<nums.size(); i++){
            if(seen.count(nums[i]) > 0) return true;
            seen.insert(nums[i]);
        }
        return false;
    }
};