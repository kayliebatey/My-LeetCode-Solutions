class Solution {
private:
    struct Node
    {
        int val;
        Node * next;
    };
public:
    int numIdenticalPairs(vector<int>& nums) {
        int sz= nums.size();
        
        // O(n) space
        Node *arr [sz];
        
        // O(n) time
        for(int i=0; i<sz; i++)
            arr[i]=nullptr;
        
        // O(n) time
        for (int i=0; i<sz; i++)
            hash((nums.at(i)), sz, arr );
        
        int count=0;
        int numPairs=0;
        
        // O(n) time
        for (int i=0; i<sz; i++)
        {
            // O(n) time->(O(n^2))
            while (arr[i])
            {
                count++;
                arr[i]=arr[i]->next;
            }
            numPairs= ((count*(count-1))/2) + numPairs;
            count=0;
        }
            
        return numPairs;
    }
    
    void hash(int num, int sz, Node * arr[])
    {
        int hashI=hashedIndex(num, sz);
        // O(1)
        Node * newNode= new Node;
        newNode->val= num;

        // O(n)
        while(arr[hashI]&& arr[hashI]->val!=num)
        { 
            hashI++;
            hashI%=sz;
        }
        
        newNode->next=arr[hashI];
        arr[hashI]=newNode;
    }
    
    int hashedIndex(int num, int sz)
    {
       return num%sz;
    } 
};
