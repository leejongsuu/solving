# [Bronze II] 단어의 개수 - 1152 

[문제 링크](https://www.acmicpc.net/problem/1152) 

### 성능 요약

메모리: 31484 KB, 시간: 464 ms

### 분류

구현, 문자열

### 제출 일자

2023년 11월 13일 00:07:09

### 문제 설명

<p>영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.</p>

### 입력 

 <p>첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.</p>

### 출력 

 <p>첫째 줄에 단어의 개수를 출력한다.</p>

 ### 문제 풀이
 <p>문자열에서 단어는 공백으로 구분된다고 했으므로 공백의 개수를 세면 단어의 개수를 알 수 있음</p>
 <p> -> 예를 들면, cat dog 는 공백이 1개 단어의 개수 2개 </p>
 <p> -> 주의) 공백은 문자열 단어 사이의 공백을 세어야하며 맨앞이나 뒤의 공백은 세지않음. </p>
 <p> 따라서 str=str.trim();을 통해 앞뒤의 공백을 제거하고 공백의 개수를 세주면됨. </p>    

