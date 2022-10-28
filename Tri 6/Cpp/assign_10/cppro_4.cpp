#include <iostream>
using namespace std;

template <class T>
void display(T a)
{
    cout<<"Value of a = " << a << "\n";
}

int main()
{
    int a = 10;
    char ch = 'M';
    float b = 56.70;
    string str = "Purchases made through some store links may provide some compensation";

    display(a);
    display(ch);
    display(b);
    display(str);

    return 0;
}

