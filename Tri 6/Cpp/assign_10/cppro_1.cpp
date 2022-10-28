#include <iostream>
using namespace std;

template <class T>
void difference(T a, T b){
    cout << "Difference  = " << a - b << "\n";
}

int main(){

    int a, b;
    cout << "Enter 2 values : "; cin >> a >> b;
    difference(a,b);
    return 0;
}