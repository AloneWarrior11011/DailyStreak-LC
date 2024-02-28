//{ Driver Code Starts

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

/* Here's the solution Input:
s = "54141111648421214584416464555"
Output:
-1
Explanation:
Given Number is not divisible by 8, 
so the driver code prints -1 as the output.
*/
class Solution{
    public:
    int DivisibleByEight(string s){
        //code here
        if(s.length() <= 3){
            int num = stoi(s);  
            if(num % 8 == 0){
                return 1;
            }
        }
        else if(s.length() > 3){
            int pos = s.length() - 4;
            int res = 0;
            res = res * 10 + s[pos+1];
            res = res * 10 + s[pos+2];
            res = res * 10 + s[pos+3];
            if(res % 8 == 0) return 1;
        }
        return -1;
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        string S;
        cin>>S;
        Solution ob;
        cout<<ob.DivisibleByEight(S)<<"\n";
    }
}
// } Driver Code Ends
