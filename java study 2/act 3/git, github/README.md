# git, github study

## 목표
- 브랜치를 따서 버전을 각각 관리할 수 있다.
- 풀리퀘스트를 날릴 수 있다.

## 활동 내용
- [x] markdown 사진 넣기
- [x] review 예시 보여주기
- [x] 브랜치 이해하기
- [x] branch fork 하기
- [x] main 브랜치에서 갈린 브랜치 생성
- [x] 로컬 생성 브랜치 원격으로 푸시하기
- [x] 깃허브에서 compare, pullrequest
```

풀리퀘스트 순서

1. 다른 사람의 repos를 fork
2. fork한 repos를 로컬로 clone
3. clone한 repos에서 main branch를 복사해 branch를 생성
4. 해당 branch에서 modify함
5. branch를 push
6. compare하고 pullrequest
```

## git command
```
// clone remote repos to local
git clone <code-link>

// show local branchs
git branch
// show remote branchs
git branch -r

// delete branch
git branch -d <branch-name-to-delete>
// move to branch, <branch-name>
git checkout <branch-name>
// copy original branch(current branch) and create a branch<branch-name>
git checkout -b <branch-name>

git pull
git add .
git commit -m <commit-message>
git push <repository-name> <branch-name>// e.g. git push origin <branch-name> 
```

- branch를 만들 때 checkout명령어를 통해 main 브랜치로 이동한 후 checkout -b 명령어를 통해 main branch를 복사한 새로운 branch를 만들 것.
- 깃에서 새로운 작업을 하기 전 **bash를 켜자마자 pull** 명령어를 통해 원격에 있는 변경사항을 pull 해오는 습관을 갖자.
- 'git push' 명령에서 bash에서 이전에 다른 브랜치에 접근을 해서 push한 경우에는 'git push'명령만으로는 원격 브랜치에 push가 안 된다. 따라서 repos 이름을 꼭 명시해준 뒤 브랜치 이름을 써 주어야 한다. (github에서 repos를 생성한 경우 보통 기본이름은 'origin'이다.)

## 과제

- Moonki-Java-Study repository에 activity2와 activity3 브랜치를 각각 만든 후 각각 pull request를 날려주세요.
- 각각 브랜치들의 내용은 겹치지 않게 해주세요.
- 메인 브랜치가 아닌 다른 브랜치에 한 push는 깃허브 프로필에 **잔디가 심기지 않습니다**. 
- organization이 아닌 personal repository를 만들어서 그곳에도 push 해주세요. (잔디가 심겨집니다. ~~신난다~~)
- 궁금하면 물어보시고 참고 하라고 보내거나 참조로 남긴 링크들은 되도록이면 공부하기 전에 한 번 읽어보세요.

# Reference
- [pull request](https://wayhome25.github.io/git/2017/07/08/git-first-pull-request-story/)