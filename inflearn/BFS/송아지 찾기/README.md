### 분류

BFS

### 문제 설명

<p>
현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.

현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.

송아지는 움직이지 않고 제자리에 있다.

현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.

최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.
</p>


### 입력

 <p>첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.</p>

### 출력

 <p>점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재합니다.</p>

### 풀이 

<p>
BFS 알고리즘을 이용해서 풀었다.

1. BFS 알고리즘을 사용하기 위해 Queue를 선언 해준다.

2. ArrayList 선언 이유는 Queue에 offer 하기전에 이미 탐색한 값이면 offer 하지 않아 시간복잡도를 줄이기위해서 이다.

3. level마다 Queue 사이즈 만큼 반복문을 통해 Q.poll을 통해 데이터를 추출.

4. 그 데이터가 e 와 같으면 레벨 리턴

5. 아니면 그 노드의 자식 데이터들을 Queue에 추가
</p>
