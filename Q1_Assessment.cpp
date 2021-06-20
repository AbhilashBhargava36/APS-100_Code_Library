#include<iostream>
//#include<conio.h>
#define SIZE 5
using namespace std;
class emp
  {
     float basic,da,it,netsal;
     char name[20],num[10];
     public:
         void getdata();
         void net_sal();
         void dispdata();

  };

void emp::getdata()
    {
      cout<<"\nEnter employee number: " ;
      cin>>name;
      cout<<"              Enter employee name: " ;
      cin>>num;
      cout<<"Enter employee basic salary in Rs: " ;
      cin>>basic;
    }

void emp::net_sal()
    {
      da=((0.52)*basic );
      float gsal=da+basic;
      it=((0.3)*gsal);
      netsal=gsal-it;
    }

void emp::dispdata()
    {
      cout
            <<"\n      Employee number: "<<name
            <<"\n        Employee name: "<<num
            <<"\n   Employee netsalary: "<<netsal<<" Rs.";

    }

int main()
  {

     emp ob[SIZE];
     int n,i;
     cout<<"\n\n***********************************"
         <<"\nCalculation of Employee Net Salary"
         <<"\n***********************************"
         <<"\n Enter the number of employees";
     cin>>n;
     for(int i=0;i<n;i++)
         {
            ob[i].getdata();
            ob[i].net_sal();
         }

     cout<<"\n-----------------"
         <<"\nEmployee Detail::"
         <<"\n-----------------";
     for( i=0;i<n;i++)
          {
            cout<<"\n\n Employee:"<<i+1
                <<"\n ----------";
            ob[i].dispdata();
          }
     return 0;
  }
