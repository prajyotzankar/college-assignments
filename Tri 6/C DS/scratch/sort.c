#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct student_details{
    int roll_no;
    char name[20] , division;
    float percentage;
};

int main(){

    int i , j , k , no_of_students , option;

    printf("Ente no of students : ");
    scanf("%d" , &no_of_students);

    struct student_details student[no_of_students] , temp ;

    for(i = 0 ; i < no_of_students ; i++){
        printf("Student No. -> %d\n" , i+1);

        printf("Roll No. : ");
        scanf("%d" , &student[i].roll_no);
        fflush(stdin);

        printf("Name : ");
        fgets(student[i].name , 20 , stdin);
        fflush(stdin);

        printf("Division : ");
        scanf("%c" , &student[i].division);
        fflush(stdin);

        printf("Percentage : ");
        scanf("%f" , &student[i].percentage);
        printf("\n");
        fflush(stdin);

    }

    for(i = 0 ; i < no_of_students ; i++){
        for(j = 0 ; j < no_of_students - i - 1 ; j++){
            if(student[j].percentage < student[j+1].percentage){
                temp = student[j];
                student[j] = student[j+1];
                student[j+1] = temp;
            }
        }
    }

    printf("1 -> Display all details of division ‘B’ class sorted by percentage \n");
    printf("0 -> Exit \n");

    do{
        printf("Option : ");
        scanf("%d" , &option);

        switch(option){
            case 1 :    printf("Details of division B class sorted by percentage \n");
                        for(i = 0 ; i < no_of_students ; i++){
                            if(student[i].division == 'B'){
                                printf("Name : %s" , student[i].name);
                                printf("Roll No and Division : " , student[i].roll_no , student[i].division);
                                printf("Percentage : %.2f \n" , student[i].percentage);
                                printf("\n");
                            }
                        }
                        break;
                        

            case 0 :    exit(1);

            default :   printf("Enter valid option 1 or 0 \n");
        }
    }while(option != 0);

    return 0;
}