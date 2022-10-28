#include <iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;
/*
class student
{
	public:
	double c;
	int rno,age;
	char name[20],course[20],div,course1[20],course2[20];
	
	void accept()
{
	cout<<"\nEnter Student Roll Number : ";
	cin>>rno;
	cout<<"\nEnter Student Name : ";
	cin>>name;
	cout<<"\nEnter Student Age : ";
	cin>>age;
	cout<<"\nEnter Student Course : ";
	cin>>course;
	cout<<"\nEnter Student Division : ";
	cin>>div;
}

void display()
{
		if(rno<1 && rno>40)
		throw 0;
		
		if(age<21 && age>25)
		throw 'N';
		
		if(course!="MSC" || course!="MCA")
		throw c;
		
		if(div!='A' || div!='B')
		throw"\nInvalid Division Exception .";
}
};


int main()
{
	student s;
    s.accept();
    try
    {
        s.display();
    }
    catch(int n)
    {
        cout<<"\nInvalid Roll Number Exception.";
    }
    
    catch(char ch)
    {
        cout<<"\nInvalid Age Exception.";
    }
    
    catch(double c)
    {
        cout<<"\nInvalid Course Exception.";
    }
    
    catch(const char *msg)
    {
        cout<<msg;
    }
    return 0;
} */

int main(){
    string course = "MCA";
    cout << course!="MSC" ;
}