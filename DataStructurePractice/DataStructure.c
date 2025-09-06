//*******Q1-PrimeNumberAdvance************************** */
// #include <stdio.h>
// int main()
// {
//     int i, j;
//     int c;
//     for (i = 1; i <= 50; i++)
//     {
//         c = 1;
//         for (j = 2; j <= i / 2; j++)
//         {
//             if (i % j == 0)
//             {
//                 c = 0;
//                 break;
//             }
//         }
//         if (c)
//         {
//             printf("%d\n", i);
//         }
//     }
//     return 0;
// }

//*******Q2-PrimeNumbrUsingSieve************************** */
// class DataStructure {
//     public static void main(String ar[]) {
//         int n = 25;
//         boolean b[] = new boolean[n + 1];
//         for (int i = 2; i * i <= n; i++) {
//             if (b[i] == false) {
//                 for (int j = i + i; j <= n; j = j + i) {
//                     b[j] = true;
//                 }
//             }
//         }
//         for (int i = 2; i < 25; i++) {
//             if (!b[i])
//                 System.out.println(i);
//         }
//     }
// }

//*****Q3-display 1 to 10 number without using (+) addition operator************************** */
// #include <stdio.h>
// void main()
// {
//     int i = 0;
//     while (i < 10)
//     {
//         printf("%d\n", i = i - (-1));
//     }
// }

//****Q4-display 10 to 1 reverse number without using - minus sign ****************************** */
#include <stdio.h>
void main()
{
    int j = 0;
    int i = 0;
    do
    {
        printf("%d\n", 11 - (~i));
    } while (j > 1);

}

//**************************EXAMPLE-5************************** */
//**************************EXAMPLE-6************************** */
//**************************EXAMPLE-7************************** */
//**************************EXAMPLE-8************************** */
//**************************EXAMPLE-9************************** */
//**************************EXAMPLE-10************************** */
//**************************EXAMPLE-11************************** */
//**************************EXAMPLE-12************************** */
//**************************EXAMPLE-13************************** */
