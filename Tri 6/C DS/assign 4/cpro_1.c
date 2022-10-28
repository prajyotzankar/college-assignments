#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct student_detail{
    int roll_no , class;
    char name[20] , div;
};

int main(){

    int i , option , no_of_students;
    char division , name[20];

    printf("Enter no of students : ");
    scanf("%d" , &no_of_students);

    struct student_detail student[no_of_students];

    for(i = 0 ; i < no_of_students ; i++){
        printf("Student No. -> %d \n" , i+1);
        printf("Roll No. : ");
        scanf("%d" , &student[i].roll_no);
        fflush(stdin);
        printf("Name : ");
        fgets(student[i].name , 20 , stdin); 
        
        printf("Class and Division : ");
        scanf("%d %c" , &student[i].class , &student[i].div);
        printf("\n");
        fflush(stdin);
    }

    printf("1 -> Display data of all students \n");
    printf("2 -> Display data of student by division \n");
    printf("3 -> Display data based on name provided \n");
    printf("0 -> Exit \n");

    do{
        printf("Option : ");
        scanf("%d" , &option);

        switch(option){

            case 1 :    for(i = 0 ; i < no_of_students ; i++){
                            printf("Name : %s" , student[i].name);
                            printf("Roll No. : %d \n" , student[i].roll_no);
                            printf("Class and Division : %d %c \n" , student[i].class , student[i].div);
                            printf("\n");
                        }
                        break;

            case 2 :    fflush(stdin);
                        printf("Enter the division to print for : ");;
                        scanf("%c" , &division);
                        
                        for(i = 0 ; i < no_of_students ; i++){
                            if(student[i].div == division){
                                printf("Name : %s" , student[i].name);
                                printf("Roll No. : %d \n" , student[i].roll_no);
                                printf("Class and Division : %d %c \n" , student[i].class , student[i].div);
                                printf("\n");
                            }
                        }
                        break;

            case 3 :    fflush(stdin);
                        printf("Enter the name to print for : ");;
                        fgets(name , 20 , stdin);
                        for(i = 0 ; i < no_of_students ; i++){
                            if(!strcmp(student[i].name , name)){
                                printf("Name : %s" , student[i].name);
                                printf("Roll No. : %d \n" , student[i].roll_no);
                                printf("Class and Division : %d %c \n" , student[i].class , student[i].div);
                                printf("\n");
                            }
                        }
                        break;
            case 0 :    exit(1);
            
            default :   printf("Enter valid option 1 , 2 , 3 or 0 \n");
        }
    }while(option != 0);

    return 0;
}