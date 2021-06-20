class Solution 
{
public:
    bool search(vector<int>& arr, int target)
    {
        int size = arr.size();
        int start=0,end=size-1;
        while(start <= end)
        {
            while(start+1 <= end && arr[start] == arr[start+1])
                start++;
            while(end-1 >= 0 && arr[end] == arr[end-1])
                end--;
            int mid = start + ((end - start)/2);
            if(arr[mid] == target)
                return true;
            else if(arr[mid] <= arr[end])
            {
                if(arr[mid] < target && target <= arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            else if(arr[mid] >= arr[start])
            {
                if(arr[mid] > target && target >= arr[start])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return false;
        
    }
};

