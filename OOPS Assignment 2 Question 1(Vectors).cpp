#include<iostream>
using namespace std;
class Vector
{
public:
int x,y,z;

void set_vector()
{
cout<<"\nEnter the scaler values of vector\nIn x direction :";
cin>>x;
cout<<"In y direction :";
cin>>y;
cout<<"In z direction :";
cin>>z;
}

void modify()
{
int i;
display();
cout<<"\nEnter the direction in which you want to modify vector\n1. x-dimension\n2. y-dimension\n3. z-dimension\n";
cin>>i;
if(i==1)
{
cout<<"\nEnter new x :";
cin>>x;
}
else if(i==2)
{
cout<<"\nEnter new y :";
cin>>y;
}
else if(i==3)
{
cout<<"\nEnter new z :";
cin>>z;
}
display();
}

void multiply()
{
int scalar;
cout<<"\nEnter scalar quantity to multiply by :";
cin>>scalar;
x=x*scalar;
y=y*scalar;
z=z*scalar;
display();
}

void display()
{
cout<<"\nEntered vector is :"<<x<<"i + "<<y<<"j + "<<z<<"k";
}

};

int main()
{
Vector vt;
vt.set_vector();
vt.modify();
vt.multiply();
return 0;
}
