### 분류

HashMap

### 문제 설명

<p>
학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.

투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.

선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.

반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
</p>


### 입력

 <p>첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.

두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.</p>

### 출력

 <p>학급 회장으로 선택된 기호를 출력합니다.</p>

### 문제 풀이

<p>
1. HashMap key : Characyer형, value : Integer 형 선언
  
2. Key에 ‘A’ ‘B’ ‘C’ ‘D’ ‘E’ 넣어주면서 만약 이미 안에 Key값이 존재하면 value를 +1 해서 넣어줌

3. 여기서 map.getOrDefault(x,0)+1이 아닌 map.get(x)+1을 쓰면 처음 Key값이 들어갈 때 에러남 주의

4. 최대 value를 가진 key를 찾아서 출력
</p>
