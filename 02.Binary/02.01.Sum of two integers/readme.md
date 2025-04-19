Description :

Given two integers a and b, return the sum of the two integers without using the operators + and -.

Solution:

We can use xor operation however for full addition we need to take care of the carry

suppose: a = 9 --> 1001
b = 11 --> 1011
expected ---> a+b = 10100 --> 20

         1001 -->a = 9
         1011 --> b = 11
         0010 --> a^b=2
         1001 --> a&b carry however it should be added to the previous element to the left
         10010-->a&b<<1 shifted bits to the left by 1

a = a^b --> 0010
b = a&b <<1 -->10010
addition:
a = a^b --> 10000
b = a&b <<1 --> 00010
addition:
a = a^b --> 10010
b = a&b <<1 -->00000
since carrry that is b = 0 so addition is completed and the result is 10010 that is 20 which is correct
