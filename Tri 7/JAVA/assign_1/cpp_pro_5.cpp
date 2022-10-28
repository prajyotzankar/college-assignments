#include <iostream>

using namespace std;

class sum{
    static int num1, num2;

    public:
        void accept(){
            cout << "Enter first number : ";
            cin >> num1;

            cout << "Enter second number : ";
            cin >> num2;
        }

        static void display(){
            cout << "Sum = " << num1 + num2 << "\n" ;
        }
};
int sum::num1;
int sum::num2;

int main(){

    sum number;
    number.accept();
    sum::display();

    return 0;
}