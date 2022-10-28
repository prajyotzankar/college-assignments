#include <iostream>
#include <cstring>
using namespace std;

class student
{
private:
    int rollNo, age;
    char div, course[3], name[20];

public:
    void accept()
    {
        cout << "\nEnter student name: ";
        cin >> name;
        cout << "\nEnter Roll No.: ";
        cin >> rollNo;
        cout << "\nEnter age: ";
        cin >> age;
        cout << "\nEnter course: ";
        cin >> course;
        cout << "\nEnter Division: ";
        cin >> div;
    }
    void display()
    {
        cout << "Name : " << name ;
        if (rollNo >= 1 && rollNo <= 40)
        {
            cout << "Roll No.: " << rollNo << endl;
        }
        else
        {
            throw "\nInvalid Roll Number exception";
        }
        if (age >= 21 && rollNo <= 25)
        {
            cout << "Age: " << age << endl;
        }
        else
        {
            throw "\nInvalid Age exception";
        }
        if (strcmpi("MCS", course) || strcmpi("MCA", course))
        {
            cout << "Course: " << course << endl;
        }
        else
        {
            throw "\nInvalid course exception";
        }
        if (div == 'A' || div == 'B' || div == 'a' || div == 'b')
        {
            cout << "Div.: " << div << endl;
        }
        else
        {
            throw "\nInvalid Division exception";
        }
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
    catch (const char *msg)
    {
        cout << msg << endl;
    }

    return 0;
}