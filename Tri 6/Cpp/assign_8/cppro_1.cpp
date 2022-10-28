#include <iostream>
#include <string>

using namespace std;


int main (){
   int x = 46;
 
    try{
        if(x%3 != 0){
            throw "Not Divisible by 3 \n";
            try{
                if(x%5 != 5)
                    throw "Not Divisible by 5 \n";
            }
        }
    }


    catch (const char* msg){
        cerr << msg << endl;
    }

   return 0;
}

