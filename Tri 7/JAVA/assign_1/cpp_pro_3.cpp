#include <iostream>

using namespace std;

class evenodd{

    int num;
    public:
        void accept();
        void display();
};

void evenodd::accept(){
    cout << "Ente a Number : ";
    cin >> num;
}

void evenodd::display(){
    if(num%2 == 0)
        cout << num << " is Even \n";
    else
        cout << num << " is Odd \n";
}

int main(){

    evenodd number;

    number.accept();
    number.display();

    return 0;
}