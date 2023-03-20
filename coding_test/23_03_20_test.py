# -*- coding: utf-8 -*-
"""
Created on Mon Mar 20 11:16:56 2023

2023_03_20
"""

# 1. 숫자 N을 입력받아, 구구단 N단을 출력하는 프로그램 작성하기.

N = int(input("숫자 N을 입력하세요."))
for i in range(1,10) :
    print(N,"*",i,"=",(N*i))
    

# 2. 구매한 물건의 총금액과 영수증에 적힌 총 금액 일치하는지 검색해보기.

"""
첫째 줄: 영수증에 적힌 총 금액 X
둘째 줄: 영수증에 적힌 구매물건의 종류 수 N
이후 각 물건의 가격 a와  개수 b가 공백을 사이에 두고 주어짐.

1<= X <= 1,000,000,000 (총 금액)
1<= N <= 100   (구매 물건의 종류수)
1<= a <= 1,000,000 (각 물건의 가격)
1 <= b <= 10 (각 물건의 갯수)
""" 

X = int(input("영수증 최종 금액"))
N = int(input("구매 물건의 종류수"))
hap = 0
for i in range(N) :
    a = int(input("각 물건의 가격"))
    b = int(input("각 물건의 갯수"))
    hap += a*b
    print(a,b)

if X == hap :
    print("yes")
else :
    print("No")
    

# 3. 별 찍기

"""
첫째 줄 : 별1개
둘째줄 : 별3개
N번째 줄: 별 N개를 찍는 문제.

ex) 입력 :5
    *
    **
    ***
    ****
    *****
"""

N = int(input("별 자리수를 입력하세요."))

for i in range(N) :
    for j in range(i+1):
        print("*", end='')
    print()


# 4. 별 찍기2

"""
첫째 줄 : 별1개
둘째 줄 : 별2개
N번째 줄 : 별 N개

하지만, 오른쪽을 기준으로 정렬한 별 출력

ex) 입력 : 5
    
    *                
   **
  ***
 ****
*****

"""

N = int(input("별자리 N을 입력해주세요."))

for i in range(N):
    for j in range(N-(i+1)):
        print(" ",end='')
    for j in range(i+1) :
        print("*",end='')
    print()











