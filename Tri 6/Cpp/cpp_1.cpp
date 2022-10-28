#include <iostream>
 
using namespace std;
 
void check(int day, int month, int year){

    try{

        if(year < 0)
            throw "Invalid Year exception \n";

        else if(month < 1 || month > 12)
            throw "Invalid Month exception \n";
    
        else{

            if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 0 && day <= 31)
                throw "It is valid \n";
            else if (month == 4 || month == 6 || month == 9 || month == 11 && day > 0 && day <= 30)
                throw "It is valid \n";
            else if (month == 2){

                if ((year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) && day > 0 && day <= 29)
                    throw "It is valid \n";
                else if (day > 0 && day <= 28)
                    throw "It is valid \n";
                else
                    throw "Invalid Day exception \n";
            }
            else
                throw "Invalid Day exception \n";
        }
    }
 
    catch (const char *ch){
        cout << ch;
    }
    
}
 
int main()
{
    int day, month, year;
 
    cout << "Enter day: ";
    cin >> day;
 
    cout << "Enter month: ";
    cin >> month;
 
    cout << "Enter year: ";
    cin >> year;
 
    check(day, month, year);
}
