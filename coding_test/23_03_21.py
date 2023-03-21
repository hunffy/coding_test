# -*- coding: utf-8 -*-
"""
Created on Tue Mar 21 12:24:59 2023

2023_03_21
"""

import random

# 1. 원하는 숫자의 갯수 출력하는 프로그램 만들기

"""
1. 1~100까지의 원하는 갯수 N을 입력한다.

2.  N개에 해당하는 숫자들이 입력된다.

3. 숫자들중 원하는 숫자 V를 입력한다.

4. 결과 : 원하는 숫자 V의 갯수를 출력해준다.


ex) 1. 5입력
    2. 1 1 2 3 2
    3. 1
    4. 결과: 숫자1의 갯수 2개가 출력된다
"""

N = int(input("원하는 숫자의 갯수를 입력하세요."))
# input.split() 을 해주면 띄어쓰기 기준으로 구분해준다.
N_list = list(map(int, input("N개에 해당하는 숫자를 입력하세요.").split()))
V = int(input("원하는 숫자를 입력하세요"))

print("숫자",V,"의 갯수는 :",N_list.count(V))


# 2. N개의 정수가 주어질때, 최솟값과 최댓값을 구하는 프로그램 만들기.

"""
 1. 첫째 줄에 정수의 갯수 N이 주어진다.
 2. 둘째 줄에 N개의 정수를 공백으루 구분하여 주어진다.
"""

N = int(input("숫자의 갯수를 입력하세요."))
N_list = list(map(int, input("숫자를 입력하세요.").split()))

print("최댓값 :",max(N_list), "최솟값 :",min(N_list))


# 3. N개의 바구니에 1번부터 N번까지 번호가 새겨진 공이 1개씩 들어가있다.
#    바구니 2개를 선택해 공을 M번 바꿔줬을때 최종 각 바구니의 결과 출력하기.

"""
 N = 바구니의갯수
 M = 공을 바꿔줄 횟수
 C = 1번째 공
 D = 2번째 공
 BOX = 바구니
"""

N ,M = map(int, input("바구니갯수 N, 공 교체 횟수 M").split())

BOX = [i for i in range(1,N+1)]

for i in range(M) :
    C, D = map(int, input("1번째 공 : C , 2번째 공 : D를 입력해주세요").split())
    temp = BOX[C -1]
    BOX[C -1] = BOX[D -1]
    BOX[D -1] = temp
    
print(BOX)