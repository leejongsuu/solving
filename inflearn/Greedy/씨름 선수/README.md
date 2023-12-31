### 분류

Greedy

### 문제 설명

<p>
현수는 씨름 감독입니다. 현수는 씨름 선수를 선발공고를 냈고, N명의 지원자가 지원을 했습니다.

현수는 각 지원자의 키와 몸무게 정보를 알고 있습니다.

현수는 씨름 선수 선발 원칙을 다음과 같이 정했습니다.

“A라는 지원자를 다른 모든 지원자와 일대일 비교해서 키와 몸무게 모두 A지원자 보다 높은(크고, 무겁다) 지원자가

존재하면 A지원자는 탈락하고, 그렇지 않으면 선발된다.”

N명의 지원자가 주어지면 위의 선발원칙으로 최대 몇 명의 선수를 선발할 수 있는지 알아내는 프로그램을 작성하세요.
</p>


### 입력

 <p>
 첫째 줄에 지원자의 수 N(5<=N<=30,000)이 주어집니다.

  둘째 줄 부터 지원자의 키와 몸무게가 주어집니다.
  </p>

### 출력

 <p>첫째 줄에 씨 선수로 뽑히는 최대 인원을 출력하세요.</p>

### 풀이 

<p>
좌표정렬에서 사용했던것처럼 키를 내림 차순으로 정렬하자.

이후 반복문을 돌면서 선수의 몸무게가 지금까지 나왔던 선수보다 몸무게가 크면 max를 방금 나온 선수의 무게로 넣어주고 answer++ 해준다.

이유는 선발 원칙에서 조건은 키와 몸무게가 둘 다 A라는 선수보다 큰 선수 가 있으면 탈락인거다. 즉, 둘 중 하나만 커도 이 선수는 선발인것임.

키 순으로 정렬했으니 만약 몸무게가 최대 max가 나오면 그 전 인덱스의 선수들보다 키는 작지만 무게는 큰것임  반대로 그 후 인덱스의 선수들 보다 키는 큰것임 → 선발 !
</p>
