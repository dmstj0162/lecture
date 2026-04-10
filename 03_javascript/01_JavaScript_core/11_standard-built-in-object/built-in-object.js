/**
 * 표준 내장 객체
 * 자바스크립트가 기본적으로 제공하는 유용한 객체들이다.
 *
 */

/**
 * String: 텍스트를 다루는데 필수적인 기능들을 제공한다.
 */
const myIntro = "안녕하세요! 제 이름은 판다입니다.";

// 검색: .indexOf(), .includes()
// '이름'이라는 단어가 몇 번째 인덱스에 처음 등장하나요
console.log(myIntro.indexOf("이름"));
// '나이'라는 단어가 포함되어 있나요?
console.log(myIntro.includes("나이"));

// 잘라내기: .slice(), subString()
const fileName = "my-profile.jpg";
// 11번째 인덱스부터 끝까지 잘라내기(확장자명 추출)
console.log(fileName.slice(11));
//0번부터 10번 전까지 잘라내기
console.log(fileName.substring(0, 10));

// .split(): 쪼개서 배열 만들기
const tags = "#자바스크립트#개발자#꿀팁#프론트엔드";
// #을 기준으로 문자열을 쪼개서 배열
const tagArray = tags.split("#");
console.log(tagArray);

//trim(): 앞 뒤 공백 제거
const userId = "   UsEr123   ";
console.log(userId);
console.log(userId.trim());

// 모두 대문자/소문자로 바꾸기
console.log(userId.toLowerCase());
console.log(userId.toUpperCase());

/**
 * Math: 랜덤 숫자 생성, 반올림 등 간단하지만 활용도 높은 숫자 관련 기능을 제공
 */

// Math.random(): 랜덤 숫자 만들기
// 0이상 1미만의 랜덤한 소수 반환
console.log(Math.random());

// 1부터 10까지의 랜덤 정수 반환(공식처럼 외우기)
const randomNumber = Math.floor(Math.random() * 10) + 1; //0.0xx~0.9XXX 범위 , 10과 1을 변경하여 범위 조정 가능
console.log(randomNumber);

// 숫자 반올림/버림/올림
console.log(Math.round(3.54)); //반올림
console.log(Math.floor(3.989)); //소수점 버림
console.log(Math.ceil(3.01)); //소수점 올림

/**
 * Date
 * 날짜와 시간을 다루는 기본적인 기능 제공
 */
const now = new Date();
console.log(now);

console.log(now.toLocaleString("ko-KR"));

console.log(now.getFullYear());
console.log(now.getMonth() + 1); //0부터 시작해서  +1 필요
console.log(now.getDate());
