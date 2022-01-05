class Solution {
  public:
    bool canPair(vector<int> nums, int k) {

        if(nums.size() % 2) return false;

        unordered_map<int, int> rem;

        for(int n: nums) {
            int r = n%k;

            if(r && rem.count(k - r) && rem[k - r] > 0) {
                --rem[k - r];
                rem[0] += 2;
            }
            else {
                ++rem[r];
            }
        }
    
        return rem[0] == nums.size();
    }
};