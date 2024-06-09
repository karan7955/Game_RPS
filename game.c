#include <stdio.h>
#include <string.h>
#include <time.h>
#include <stdlib.h>
int comGenRanNum(int num){
    srand(time(NULL));
    return rand()%2;  
}

int main(){
    int cscore = 0, uscore = 0 , compnum , usernum , i = 0 , round;
    char name[25];
    compnum = comGenRanNum(3);
    printf("Welcome to the game of Rock Paper and Scissors\n");
    printf("RULES: Rock is superior to Scissor and inferior to paper\nIn case of Paper, Scissors is superior. Always superior wins , to play the Game.\n\nEnter you name without any spaces:");
    scanf("%s" , name);
    printf("Enter the number of the rounds:\n");
    scanf("%d" , &round);
    while(i < round){
    start:
        printf("Enter the index to choose:\nPress 1.Rock\nPress 2.Paper\nPress 3.Scissors\n");
        scanf("%d" , &usernum);
        usernum = usernum - 1;
        if ( usernum == compnum){
            printf("It's a tie. You both choose the same.\n");
        }
        else if (usernum == 0 && compnum == 2){
            printf("You choosed Rock computer choosed scissors.\nCongratulation!! you won the Round\n");
            uscore++;
        }
        else if (usernum == 0 && compnum == 1){
            printf("You choosed Rock computer choosed Paper.\nOops!! computer won the Round\n");
            cscore++;
        }
        else if (usernum == 2 && compnum == 0){
            printf("You choosed Scissors computer choosed Rock.\nOops!! computer won the Round\n");
            cscore++;
        }
        else if (usernum == 1 && compnum == 0){
            printf("You choosed Paper computer choosed Rock.\nCongratulation!! you won the Round\n");
            uscore++;
        }
        else if (usernum == 1 && compnum == 2){
            printf("You choosed Paper computer choosed Scissors.\nOops!! computer won the Round\n");
            cscore++;
        }
        else if (usernum == 2 && compnum == 1){
            printf("You choosed Scissors computer choosed Paper.\nCongratulation!! you won the Round\n");
            uscore++;
        }
        else{
            printf("\aInvalid Response/Input.\nPlease Enter the index carefully between 1 to 3.\n\n");
            goto start;
        }
        printf("User score = %d \t Computer score = %d\n\n" , uscore , cscore);
        i++;

    }
    if (uscore > cscore){
        printf("The winner is %s with a score of %d.\n" , name , uscore);
    }
    else if (uscore == cscore){
        printf("You Both scored the same...It's a draw.");
    }
    else{
        printf("The winner is computer with a score of %d.\n" , cscore);
    }
    
    return 0;
}