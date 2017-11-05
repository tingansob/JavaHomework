#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("%d integer\n",47);
    printf("%ld large integer\n",4712374249345);
    printf("%f float\n",47.8);
    printf("%lf large float\n",483988.384285);
    printf("%c char\n",'%');
    printf("%s string\n","Hello George!");
    printf("%x hex\n\n",47);

    puts("This is my c pgragram");
    puts("Does puts include a carriage return?");
    puts("It appers that c uses the same commenting style as java..or perhaps it's the other way around.");

    /*
     * The math operators are the same in c
     */

    int a=10, b=83;
    int sum;
    sum=a+b;
    printf("sum = %d\n\n",sum);

    // if loops
    int age;
    printf("Please enter the age ");
    scanf("%d",&age);
    if( age < 18 ) {
        printf("Age is less than 18");
    }

    if( age == 18 ) {
        printf("Age is 18");
    }

    if( age > 18 ) {
        printf("Age is greater than 18");
    }



    return 0;
}
