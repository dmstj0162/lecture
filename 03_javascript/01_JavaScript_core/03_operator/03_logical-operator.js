/**
 * 논리 연산자는 여러 조건을 결합하여 하나의 논리적 결과를 도출한다.
 * AND, OR, NOT 연산자가 있다
 */

const a = true;
const b = false;

// 논리 AND (&&): 모두 true일 때만 true 반환
console.log(a && a);
console.log(a && b);

// 논리 OR (||): 둘 중 하나만 true여도 true 반환
console.log(a || b);

// 논리 NOT (!): true이면 false, false이면 true로 반전
console.log(!a);
console.log(!b);

/**
 * 표현식 평가하는 도중 평가 결과가 확정된 경우 나머지 평가 과정을 생략하는것
 *
 */

console.log("apple" || "banana"); // apple
console.log(false || "banana"); //banana

console.log(false && "banana"); //false

// 단축평가를 이용한 Null 체크
let obj = null;

// let objValue = obj.value; TypeError: Cannot read properties of null (reading 'value')

let objValue = obj && obj.value;

/**
 * 치명적 단점
 * 0이나 빈 문자열('')처럼 나름 의미가 있는 값들까지 '문제(Falsy)'로 취급
 */

/**
 * Optional Chaining
 */

const obj1 = null;

// obj가 null 또는 undefined인 경우 undefined 반환
// obj가 다른 Falsy한 값(0, '')인 경우 그대로 0 또는 '' 반환
const objValue1 = obj1?.value;

/**
 * null 병합 연산자(??)
 * 좌항의 피연산자가 null 또는 undefined인 경우 우항의 피연산자 반환,
 * 그렇지 않으면 좌항의 피연산자를 반환한다.
 */

let test = null ?? "기본 값";
console.log(test);

let value = 0 ?? "기본 값";
console.log(value);
