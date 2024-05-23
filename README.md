## 한울두레
# 농촌 살리기 프로젝트!
<p align="center"><img src="" height=800 width=800></p>

<br><br>

## 프로젝트 소개
#### 프로젝트명: 농촌 살리기 프로젝트
- 농촌 체험 프로그램 운영 및 연결

<br>

### <프로젝트 기획>

##### **기획목표**:
기획 목표 작성

##### **제안 배경**:
제안 배경 작성

##### **기대 효과**:
기대 효과 작성





<br><br><br>


## 😊팀원 구성

<div align="center">

| **김상익**| **도영익** | **배민서** | **안효준** | **이수빈** |
| :------: |  :------: | :------: | :------: | :------: |
|[<img src="https://github.com/4teamDBorganization/passaggio/assets/105586878/f1af7145-4133-4ac3-a2b5-9dcf5f27467a" height=150 width=150><br/>@do0ik(https://github.com/do0ik)|[<img src="https://github.com/4teamDBorganization/passaggio/assets/105586878/f1af7145-4133-4ac3-a2b5-9dcf5f27467a" height=150 width=150> <br/> @do0ik](https://github.com/do0ik)|[<img src="https://github.com/4teamDBorganization/passaggio/assets/105586878/e77503db-a0d0-454b-846f-f48b74992bac" height=150 width=150> <br/> @Baeminseo](https://github.com/Baeminseo) |[<img src="https://github.com/4teamDBorganization/passaggio/assets/105586878/cd06b1de-bc1a-4d55-8ef9-a428b9f59b16" width="150" height="150"/> <br/> @hyojunahn111](https://github.com/hyojunahn111) |[<img src="https://github.com/4teamDBorganization/passaggio/assets/105586878/10bb1a42-1ab8-4a61-95a3-ba401b5845df" height=150 width=150><br/> @joy:)](https://github.com/sb-77) |
</div>

### 🧑‍💻역할 분담

#### 도영익
- 역할

    
#### 배민서
- 역할


#### 안효준
- 역할

#### 이수빈 
- 역할
    
<br><br>



<br><br>

## 🗓️ 프로젝트 타임라인

<br>

<p align="center"><img src="" height=650 width=1000></p>

<br><br> <br><br><br><br>

## 🗓️ 개발 과정


<br><br> 

<p align="center"><img src="" height=540 width=540></p>

- 기획하기 : NOTION, DISCORD
- 디자인하기 : 피그마
- 코드 작성 : INTELLIJ

- 모든 과정에서 회의를 통해 다음 단계로 넘어가도록 했습니다.
- 회의 과정에서 수정된 부분을 노션에 기록하고, 피그마로 디자인을 구축한 뒤 참고하며 개발했습니다.

<br><br><br><br>
## 💻개발환경
<br><br> 

<p align="center"><img src="" height=400 width=600></p>


<br><br> 
- front-end : Figma
- Back-end : IntelliJ IDEA, Java 17, mySQL, MyBatis
- 버전 및 이슈관리 : Github, Github Issues, Github Project
<div align=left><h4>협업 툴</h4></div>
<div align=left><img src="https://img.shields.io/badge/Discord-5865F2?style=for-the-badge&logo=Discord&logoColor=white"/><a href="https://www.notion.so/c4f2135f392c40158f4c1cc500d9d563?v=b853aa9e72554b9fa9f70dd7315f058e"><img src="https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=Notion&logoColor=white"/></a><img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=GitHub&logoColor=white"/></div>

<br>

### 🌳브랜치 전략
- main 브랜치와 feature 보조 브랜치를 운용했습니다.
- **main** 브랜치는 배포 단계에서만 사용하는 브랜치입니다.
- **feature** 브랜치는 각 구현 단위로 구분하여 사용했습니다.
      

<br><br><br><br>

## 🧱프로젝트 구조

📦src <br>
 ┗ 📂main <br>
 ┃ ┣ 📂java <br>
 ┃ ┃ ┗ 📂com <br>
 ┃ ┃ ┃ ┗ 📂passaggio <br>
 ┃ ┃ ┃ ┃ ┗ 📂project <br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂application <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Application.java <br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂common <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Template.java <br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂controller <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Controller.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LoginController.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LostController.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SignUpController.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WithdrawController.java <br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂delay <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Delay.java <br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂mapper <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ListContentMapper.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LoginMapper.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PlaylistMapper.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SongInfoMapper.java <br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂model <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂listcontent <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ListContentDAO.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ListContentService.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ListContentTO.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂login <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜LoginService.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂playlist <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PlaylistDAO.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PlaylistService.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PlaylistTO.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂signup <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SignUpDTO.java <br> 
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SignUpService.java <br> 
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂songinfo <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SongInfoDAO.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SongInfoService.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SongInfoTO.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂withdraw <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WithdrawService.java <br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂myPage <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MypageService.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜NoneUserpage.java <br>
 ┃ ┃ ┃ ┃ ┃ ┗ 📂view <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂login <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Login.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂lostaccount <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LostAccount.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜LostAccountService.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂signup <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SignUp.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂withdraw <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Withdraw.java <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PlaylistViews.java <br>
 ┃ ┗ 📂resources <br>
 ┃ ┃ ┣ 📂com <br>
 ┃ ┃ ┃ ┗ 📂passaggio <br>
 ┃ ┃ ┃ ┃ ┗ 📂project <br>
 ┃ ┃ ┃ ┃ ┃ ┗ 📂mapper <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ListContentMapper.xml <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LoginMapper.xml <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PlaylistMapper.xml <br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SongInfoMapper.xml <br>
 ┃ ┃ ┗ 📂config <br>
 ┃ ┃ ┃ ┗ 📜mybatis-config.xml <br>




### <세부 기능 구현 사항>

##### **회원가입 및 로그인**:

사용자는 회원가입을 통해 아이디와 비밀번호를 생성하여 회원으로 등록할 수 있다.
이미 회원인 경우, 등록한 아이디와 비밀번호를 이용하여 로그인할 수 있다.

##### **아이디, 비밀번호 찾기**:

설명









<br><br><br><br>

## 7. 프로젝트 후기

### 😌김상익

<br>

### 😌도영익

<br>

### 🤗배민서


<br>

### 🙂안효준


<br>

### 😆이수빈



<br>




