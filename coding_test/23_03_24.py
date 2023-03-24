# -*- coding: utf-8 -*-
"""
Created on Fri Mar 24 14:58:56 2023

23_03_24 
"""

    
# 1. 바구니 순서 바꾸기(슬라이싱)

# # N, M = map(int,input("바구니갯수N과 셔플횟수M을 입력하세요").split())
# N = 10
# M = 5
# N_list = []
# for i in range(1,N+1) :
#     N_list.append(i)
    
# for i in range(1, M+1) : 
#     i,j,k = list(map(int, input("i,j,k입력: ").split())) #1,6,4   
#     print(N_list)
#     temp_list = N_list[i-1:j]
#     print(temp_list)
#     print(temp_list[k-1:j] + N_list[j+1:])
#     # N_list[i-1:j] = temp_list[k-1:j] + temp_list[i-1:k-1]
#     print(N_list)
#     print()
    
    
    
#1-1

N, M = map(int,input("N 과 M을 입력하세요.").split())

N_list = []
for i in range(1,N+1) :
    N_list.append(i)
    
for i in range(1,M+1) :
    i,j,k = list(map(int, input("i,j,k는?").split())) # i:1 , j:6, k:4
    print(N_list)
    N_list = N_list[:i-1]+N_list[k-1:j]+N_list[i-1:k-1]+N_list[j:]   
    print(N_list)    
    
