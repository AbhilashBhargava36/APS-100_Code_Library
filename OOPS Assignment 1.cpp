#include<iostream>
using namespace std;
class bank
{
public:
            string name;
            long long acc;
            string acc_type;
            double balance;
            void assignment();
            double deposit();
            double withdraw();
            void display();
};
int main()
{
    int ch;
    bank b1;
    b1.assignment();
    while(1)
    {
        cout<<"Enter ur choice  :"<<endl<<"1 to deposit"<<endl<<"2 to withdraw"<<endl<<"3 to display"<<endl<<"0 to exit"<<endl;
    cin>>ch;
    if (ch==1)
    b1.balance = b1.deposit();
    else if (ch==2)
    b1.balance = b1.withdraw();
    else if (ch==3)
    b1.display();
    else if(ch==0)
    break;
    }
        return 0;
}
void bank::assignment()
{
    string nm;    string typ;    double bal;    long long ano;
    cout<<"Enter name:  ";
    cin>>nm;
    cout<<"Enter Account Number:  ";
    cin>>ano;
    cout<<"Enter Account Type:   ";
    cin>>typ;
    cout<<"Enter Account Balance:   ";
    cin>>bal;
    name = nm;      acc=ano;       acc_type=typ;         balance=bal;
}
void bank::display()
{
    cout<<"Account name:    ";
    cout<<name<<endl;
    cout<<"Account Number:  ";
    cout<<acc<<endl;
    cout<<"Account Type:    ";
    cout<<acc_type<<endl;
    cout<<"Account Balance:   ";
    cout<<balance<<endl;
}
double bank::deposit()
{
    double amt;
    cout<<"Enter amount to deposit:   ";
    cin>>amt;
    cout<<"Deposited Rs."<<amt;
    balance = balance+amt;
    return balance;
}
double bank::withdraw()
{
    double amt;
    cout<<"The current balance is :   ";
    cout<<balance<<endl;
    cout<<"Enter amount to Withdraw:   ";
    cin>>amt;
    cout<<"Withdrawn Rs."<<amt;
    balance = balance-amt;
    return balance;
}
