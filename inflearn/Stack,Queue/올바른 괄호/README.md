### 분류

Stack

### 문제 설명

<p>
괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.

(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
</p>


### 입력

 <p>첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.</p>

### 출력

 <p>첫 번째 줄에 YES, NO를 출력한다.</p>

### 문제 풀이

<p>
괄호의 쌍이 맞아야함.

1. 들어오는 데이터가 ‘(’이면 스택 push 해줌

2. ‘)’이면 스택에서 pop 해줌 

3. 스택이 비어있는데 ‘)’가 들어온다? → 쌍이 안맞는거임

4. 주의) 예를 들어서 (())( 이렇게 들어오면 쌍이 안맞지만 스택에 (가 남아있으므로
    
    반복문이 끝나고 스택이 남아있는지 검사해줌 스택이 남아있으면 마찬가지로 쌍이 안맞는거임.
</p>
