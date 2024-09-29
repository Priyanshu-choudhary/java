#include<stdio.h>
#include <math.h>

int main(){
    printf("\nEnter the value a,b,c of quadric equation ax^2+bx+c ");
    int a,b,c;
   
    printf("\nEnter a ");
    scanf("%d",&a);
    printf("\nEnter b ");
    scanf("%d",&b);
    printf("\nEnter c ");
    scanf("%d",&c);

    //ax^2+bx+c
    //d=b^2-4ac
    float d=b*b-(4*a*c);
    //x=-b+-(D)/2a
    float x1=(float)((-b)-sqrt(d))/(2*a);
    float x2=(float)((-b)+sqrt(d))/(2*a);    
    if(d>0){
    printf("\nReal Roots are %f , %f",x1,x2);
    }
   if(d==0){
    printf("\nEqual Roots are %f ",x1);
    }
   if(d<0){
    printf("\nImaginary Roots are %f , %f",x1,x2);
    }
    return 0;
}