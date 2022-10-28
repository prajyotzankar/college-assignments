#include <iostream>
#include <string>

using namespace std;

template <class T>
void add(T num1, T num2){
    cout << "Sum = " << num1 + num2 << "\n";
}
void add(int arr1[], int arr2[]){
    cout << "Array sum -> ";
    for(int i = 0 ; i < 6 ; i++)
        cout << arr1[i] + arr2[i] <<"\t";
        
    
}

int main(){

    int arr1[] = {7, 5, 56, 15, 34, 35}, arr2[] = {65, 45, 29, 35, 45, 99};
    add<int>(45, 56);
    add<float>(45.3, 65.45);
    add(arr1, arr2);
    return 0;
}