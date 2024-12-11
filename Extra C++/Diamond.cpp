#include <iostream>

using namespace std;

int main()
{
   for(int i =1; i<=5; i++)
   {
    for(int j=5-i;j>=1;j--)
    {
        cout<<" ";
    }
    for(int j=1;j<=2*i-1;j++)
    {
        cout<<"*";
    }
    cout<<endl;
   }

   for(int i=4;i>=1;i--)
   {
    for(int j=5-i;j>=1;j--)
    {
        cout<<" 1..5";
    }
    for(int j=1;j<=2*i-1;j++)
    {
        cout<<"*";
    }
    cout<<endl;
   }
    return 0;
}