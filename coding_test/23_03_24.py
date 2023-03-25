# -*- coding: utf-8 -*-
"""
Created on Fri Mar 24 14:58:56 2023

23_03_24 
"""

    
#1 바구니 순서바꾸기(슬라이싱)

"""
    1. N = 바구니갯수와 번호는 동일하다 
    2. M = 바꿀 횟수
    3. i = 바꿀공 번호의 시작점
    4. j = 바꿀공 번호의 끝점
    5. k = 바꿀공 번호의 기준.
    
    ex) N=5일때
    N =[1,2,3,4,5]
    i=1 j=4 k=3 일때
    
    1부터 4까지 차례대로 맨뒤로 보내준다.
    단, k가 기준이기때문에
    1,2를 넘겨주다가 k=3인 지점에서 멈춰진다.
    
    이때 숫자5는 고정시키고
    i와 j의 범위인 1~4범위에서만 회전시킨뒤,
    결과를 첨부해준다.
    
    첫번째 [1,2,3,4,5]
    2,3,4,1,(5)
    
    두번째 [2,3,4,1,5]
    3,4,1,2,(5)
    
    k가 기준이기때문에 3,4,1,2,5가 결과가된다.
"""

N, M = map(int,input("N 과 M을 입력하세요.").split())

N_list = []
for i in range(1,N+1) :
    N_list.append(i)
    
for i in range(1,M+1) :
    i,j,k = list(map(int, input("i,j,k는?").split())) # i:1 , j:6, k:4
    print(N_list)
    print(N_list[:1])
    N_list = N_list[:i-1]+N_list[k-1:j]+N_list[i-1:k-1]+N_list[j:]   
    print(N_list)    
    



















