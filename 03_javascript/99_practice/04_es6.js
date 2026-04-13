/*
1. Rest 파라미터와 Spread 문법 활용
- 두 개의 함수 sumAll과 mergeArrays를 작성하세요.
  1. sumAll 함수는 가변 인수를 받아 모든 숫자의 합을 반환합니다.
  2. mergeArrays 함수는 두 개의 배열을 인수로 받아 두 배열을 합친 새 배열을 반환합니다.
- 두 함수를 각각 호출하여 결과를 출력하세요.

예시 출력:
합계: 15
병합된 배열: [1, 2, 3, 4, 5, 6]
*/

function sumAll(first, ...args) {
  let result = first;
  for (let arg of args) {
    result += arg;
  }
  return result;
}
console.log(sumAll(1, 2, 3, 4, 5));

const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];

const mergeArrays = [...arr1, ...arr2];
console.log(mergeArrays);

/*
2. 구조분해 할당 활용
- user 객체를 생성하고 name, age, location 속성을 초기화합니다.
- 구조분해 할당을 사용하여 name과 age를 추출하고 이를 이용해 "name은 age살입니다." 형태의 문장을 출력하세요.

임의의 배열을 리터럴로 생성하고,
- 구조분해 할당을 사용하여 배열에서 첫 번째 요소와 나머지 요소를 분리하여 출력하세요.

예시 출력:
홍길동은 30살입니다.
첫 번째 요소: 1
나머지 요소: [2, 3, 4, 5]
*/

// const user = {
//   name: "홍길동",
//   age: 30,
//   location: "서울",
// };

// const { name, age } = user;
// console.log(`${name}은 ${age} 살입니다.`);

// const [firstArg, ...members] = [1, 2, 3, 4, 5];
// console.log(`첫 번째 요소: ${firstArg}`);
// console.log("나머지 요소:", members);

/*
3. 클래스와 구조분해 할당을 활용한 학생 관리 시스템
- Student 클래스를 정의하고 name, age, score 속성을 추가하세요.
- 3명의 학생 데이터를 가진 배열 students를 생성하세요.
- 구조분해 할당을 사용하여 학생들의 이름과 점수만 배열로 추출하여 출력하세요.(map 또는 for...of 사용)

예시 출력:
학생 이름: [유관순, 홍길동, 장보고]
학생 점수: [90, 80, 70]
*/

class Student {
  constructor(name, age, score) {
    this.name = name;
    this.age = age;
    this.score = score;
  }
}

const studentA = new Student("유관순", 10, 90);
const studentB = new Student("홍길동", 11, 80);
const studentC = new Student("장보고", 12, 70);

const students = [studentA, studentB, studentC];

const resultName = students.map(({ name }) => name);
const resultScore = students.map(({ score }) => score);

console.log("학생 이름: ", resultName);
console.log("학생 점수: ", resultScore);
