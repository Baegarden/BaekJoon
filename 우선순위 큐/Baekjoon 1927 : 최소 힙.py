# Baekjoon 1927 : 최소 힙
import sys
import heapq

# 입력
N = int(input())

# 알고리즘
heap = []
result = []
for i in range(N):
    num = int(sys.stdin.readline())
    lenHeap = len(heap)
    if num == 0:
        if lenHeap == 0:
            result.append(0)
        else:
            result.append(heapq.heappop(heap))
    else:
        heapq.heappush(heap, num)

# 출력
for i in result:
    print(i)
