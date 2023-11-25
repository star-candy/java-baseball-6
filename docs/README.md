## 기능 목록

### view package

- outputView class
- [0] 게임 시작 문구를 출력하는 기능 - gamestart
- [0] 입력값에 따른 볼, 스트라이크 카운터를 출력하는 기능 gameresult
- [0] 게임 종료 문구 출력하는 기능 - gameEnd

- inputView class
    - 입력 형식 오류에 대한 exception은 해당 class에서 처리
- [0] 숫자 입력 요구문 출력, 입력값 return - ballNumber
- [0] 게임 재시작 요구문 출력, 입력값 return - restartorend

### controller package 프로젝트 진행

- [ ] Controller class - 게임 진행 baseballmanager

### model package

- [0] int형 숫자를 list로 변환하기 inttolist
- [0] 숫자 입력과 정답을 비교해 strike, ball 판단하기 - validategameresult
- [0] 숫자게임의 정답 3자리 수를 제작하기 answercreator (중복 숫자 발생 시 내부에서 변경하기)

### constatns package

- [0] string 상수 Enum으로 관리 - Description class

### exception packagae

gameException class

- [ ] input 값이 3자리가 아닐 경우 - longinput
- [ ] input 값 중 동일한 숫자가 포함된 경우 sameinput
- [ ] input 값 중 0이 포함된 경우 improperinput

restartException class

- [ ] 재시작 값에 1,2 외의 값이 인식될 경우 - improperinput