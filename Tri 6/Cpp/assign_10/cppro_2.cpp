#include <iostream>
#include <string>

using namespace std;

template <class T>
void add(T num1, T num2){
    cout << "Sum = " << num1 + num2 << "\n";
}
void add(string str1, string str2){
    cout << "String concatination  = " << str1 + " " + str2 << "\n";
}

int main(){

    string str1, str2;
    cout << "Enter first string : "; getline(cin, str1);
    cout << "Enter second string : "; getline(cin, str2);
    add(str1 ,str2);
    add<int>(20, 56);
    add<float>(53.2, 563.123);
    return 0;
}