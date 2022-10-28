#include <iostream>

using namespace std;

class dynamic_arr{

    int lim;
    int sum = 0;
    float average = 0;

    public:
        int *arr = new int(lim);

        void accept(){
            cout << "Enter no of elemenmts in array : ";
            cin >> lim;

            cout << "Enter array elements : ";
            for(int i = 0; i < lim ;i++){
                cin >> arr[i];
                sum += arr[i];
            }
                
            average = (float)sum/lim;
        }

        void display(){
            cout << "Sum = " << sum << "\n";
            cout << "Average = "<< average << "\n";
        }
};


int main(){

    dynamic_arr arr;

    arr.accept();
    arr.display();

    return 0;
}