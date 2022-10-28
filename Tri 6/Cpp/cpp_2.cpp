#include <iostream>
#include <fstream>
#include <cctype>


using namespace std;

int main(){

    fstream my_file_read , my_file_digits , my_file_char;

    my_file_digits.open("digits.txt" , ios::out);
    my_file_char.open("characters.txt" , ios::out);

    if(!my_file_digits && !my_file_char)
        cout << "File not created \n";

    else{
        my_file_read.open("pqr.txt" , ios::in);
        if(!my_file_read)
            cout << "File not found \n";
        else{
            char ch;
            my_file_read << noskipws;
            while(!my_file_read.eof()){
                my_file_read >> ch;
                if(isdigit(ch))
                    my_file_digits << ch;
                else
                    my_file_char << ch;
            }

            my_file_char.close();
            my_file_digits.close();
            my_file_read.close();
        }
    }

}
