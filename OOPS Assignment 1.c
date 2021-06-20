#include<iostream>
using namespace std;
class room
{
public:
            double length,breadth,height;
            void area(int length,int breadth);
            void volume(int length,int breadth,int height);
};
int main()
{
    int length,breadth,height;
    cin>>length>>breadth>>height;
    room r1;
    r1.area(length,breadth);
    r1.volume(length,breadth,height);
    return 0;
}
void room::area(int length,int breadth)
{
    double area ;
    area = length*breadth;
    cout<<area<<endl;
}
void room::volume(int length,int breadth,int height)
{
    double volume ;
    volume = length*breadth*height;
    cout<<volume<<endl;
}
