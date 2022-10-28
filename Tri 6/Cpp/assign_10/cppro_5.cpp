#include <iostream>
#include <string>

using namespace std;

template <class T>
void sub(T num1, T num2){
    cout << "Subtraction = " << num1 - num2 << "\n";
}
void sub(int arr1[], int arr2[]){
    cout << "Array subtraction -> ";
    for(int i = 0 ; i < 6 ; i++)
        cout << arr1[i] - arr2[i] <<"\t";
        
    
}

int main(){

    int arr1[] = {7, 5, 56, 15, 34, 35}, arr2[] = {65, 45, 29, 35, 45, 99};
    sub<int>(45, 56);
    sub<float>(45.3, 65.45);
    sub(arr1, arr2);
    return 0;
}