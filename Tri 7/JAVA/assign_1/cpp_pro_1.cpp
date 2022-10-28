#include <iostream>

using namespace std;

class sum{

    int num1, num2;

    public:
        void accept(){
            cout << "Enter the first number : ";
            cin >> num1;

            cout << "Enter the second number : ";
            cin >> num2;
        }

        void display(){
            cout << "sum = " << num1 + num2 << "\n";
        }
};

int main(){

    sum sum_1;
    sum_1.accept();
    sum_1.display();

    return 0;
}
