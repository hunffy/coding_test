# -*- coding: utf-8 -*-
"""
Created on Thu Mar 23 11:46:27 2023

2023_03_23 test
"""

# 1.  검정색 체스말은 모두있고, 흰색 체스말은 부족하다.(반복문)
#.    체스는 총 16개의 말을 사용하여 킹1개, 퀸1개, 룩2개, 비숍2개 , 나이트2개, 폰8개로 구성되어있다.
#.    동혁이가 발견한 흰색 체스말 갯수가 주어졌을 때, 몇개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램 만들기.

"""
    1. 첫째 줄에 동혁이가 찾은 흰색 체스말 킹,퀸,룩,비숍,나이트,폰의 갯수가 주어진다.
    2. 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.
    
    ex) 입력: 0 1 2 2 2 7
        출력: 1 0 0 0 0 1
"""

Black = [1,1,2,2,2,8]
W = list(map(int, input("흰색 체스말 갯수를 입력하세요.").split()))

type(W)
type(W[0])

for i in range(6):
    print(Black[i]-W[i]," ",end='')
    
    
# 2. 별찍기 심화.(반복문)

"""
입력:5

출력:
    *           1
   ***          3
  *****         5
 *******        7
*********       9
 *******        7
  *****         5
   ***          3
    *           1

"""

N = int(input("별 갯수를 입력하세요."))

for i in range(1,N):
    print(" "*(N-i),"*"*(2*i-1))
for j in range(N,0,-1):
    print(" "*(N-j),"*"*(2*j-1))




# 3. 영어단어가 주어졌을 때 가장 많이 사용된 알파벳을 대문자로 출력해주기.
# 단, 여러개 존재하는경우에는 ?로 출력

word = input("단어를 입력하세요.").upper()
unique = list(set(word))


cnt_list =[]  
for i in unique :
    cnt = word.count(i) # cnt = 각각의 알파벳수를 카운트해줌
    cnt_list.append(cnt) # cnt_list = 카운트된 알파벳수를 cnt_list에 넣어준다.

if cnt_list.count(max(cnt_list))>1 :
    print("?")
else :
    max_index = cnt_list.index(max(cnt_list))
    print(unique[max_index])

    
