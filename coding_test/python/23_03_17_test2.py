# -*- coding: utf-8 -*-
"""
Created on Fri Mar 17 12:31:03 2023

23_03_17_test2
"""


####if문 활용해보기####


# 1. 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램 작성해보기.

"""
 1. A가 B보다   큰 경우에는 '>' 를 출력한다.
 2. A가 B보다 작은 경우에는 '<' 를 출력한다.
 3. A와 B가  같은 경우에는 '=' 를 출력한다.
"""

A = int(input("A값을 입력해주세요."))
B = int(input("B값을 입력해주세요."))

if A>B:
    print(">")
elif A<B :
    print("<")
else :
    print("=")
    
    

# 2. 윤년 판별하기

"""
 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력해준다.
 
 윤년조건.
 1. 4의 배수이다.
 2. 100의 배수가 아니다.
 3. 400의 배수이다.
 
 3가지 조건이 모두 충족되어야한다.
 
 예를 들어 2012년은 4의배수이면서,100의배수가 아니라서 윤년이다.
 
 1900년은 100의 배수이고 400의 배수는 아니기 떄문에 윤년이 아니다.
 
 하지만 2000년은 400의 배수이기 때문에 윤년이다.
 
 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
"""

year = int(input("년도를 입력해주세요."))

if(year%4==0 and year%100 !=0 or year%400 == 0):
    print("1")
else :
    print("0")
    


# 3. 알람시계

"""
45분 일찍 알람 설정하기.
원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸기.

첫째 줄에 두 정수 H와 M이 주어진다(0<= H <=23 , 0 <= M <= 59)
이것은 상근이가 설정해 놓은 알람 시간과 분이다.

입력시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)
끝은 23:59(다음날 자정 1분 전) 이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.

시간과 분을 45분 전으로 설정하여 출력하기
"""

H = int(input("시간을 입력해주세요"))
M = int(input("분을 입력해주세요"))

# 1시43분을 입력했을 때.

if M<45 :                
    if H != 0:           
        H-=1             # 파이썬은 증감연산자를 사용하려면 이러한형태로 사용해준다.
        M = 60-(45-M)    
        print(H,"시",M,"분.")
    elif H ==0:
        H=23
        M = 60-(45-M)
        print(H,"시",M,"분.")
else :
    M = M-45
    print(H,"시",M,"분.")
    
    
# 4. 불기연도 입력 시 서기연도로 변환하기

"""
 불기연도 2541년도 == 서기연도 1998년도
"""


year = int(input("불기연도를 입력해주세요"))

year2 = year-543

print(year2)
        

# 5. 3개의 주사위를 던져 규칙에 따라 상금을 받는 게임.

"""
    1.같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
    2.같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
    3.모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
    
    ex) 3,3,3  => 10,000 + (3) x 1,000 = 13,000원
    ex) 3,3,6  => 1,000 + (3) x 100    = 1,300원
    ex) 1,3,6  => (6) x 100 = 600원
"""


A = int(input("숫자를 입력해주세요"))
B = int(input("숫자를 입력해주세요"))
C = int(input("숫자를 입력해주세요"))

# A,B,C 모두 눈이 같은경우
if A==B and B==C :
    print(10000+A*1000)

# 눈이 2개만 같은경우
elif A==B or A==C :
    print(1000+A*100)
elif B==C :
    print(1000*B*100)

# 눈이 모두 다른경우
else :
    print(max(A,B,C)*100)