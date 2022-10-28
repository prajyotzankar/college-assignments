#include <iostream>

using namespace std;

class employee{
    string emp_name;
    int emp_age;
    int emp_salary;
    
    public:
        void accept();
        void display();
};

void employee::accept(){

    cin.ignore();
    cout << "Enter Emp Name : ";
    getline(cin, emp_name);

    cout << "Enter Emp Age : ";
    cin >> emp_age;

    cout << "Enter emp Salary : ";
    cin >> emp_salary;
}

void employee::display(){
    cout << "Name : " << emp_name << "\n";
    cout << "Age : " << emp_age << "\n";
    cout << "Salary : " << emp_salary << "\n";
}

int main(){
    int no_emp;
    cout << "Enter no of employees : ";
    cin >> no_emp;

    employee emp[no_emp];

    cout << "Enter employee info -> \n";

    for(int i = 0; i < no_emp; i++){
        cout << "Employee number " << i + 1 << "\n";
        emp[i].accept();
        cout << "\n";
    }

    for(int i = 0; i < no_emp; i++){
        cout << "Employee number " << i + 1 << "\n";
        emp[i].display();
        cout << "\n";
    }

}