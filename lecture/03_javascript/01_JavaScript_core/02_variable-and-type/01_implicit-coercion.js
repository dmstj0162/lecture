/**
 * 암묵적 타입 변환
 * 자바스크립트 엔진에 의해 암묵적으로 타입이 자동 변환되는 것
 * 타입 변환 된 결과를 예측할 수 있어야 오류를 방지할 수 있다.
 */

//문자열 타입으로 변환

//문자열 연결 연산자로 동작
//문자열 타입이 아닌 피연사자를 문자열 타입으로 암묵적 변환
console.log(10 + "20");

console.log(1 + "");
console.log(NaN + ""); // not a number
console.log(undefined + "");

// 숫자 타입으로 변환
console.log(10 - "5"); // 5
console.log(10 * "5"); // 50
console.log(10 / "5"); // 2
console.log(10 % "Java");

console.log(10 > "5");

// + 단항 연산자는 피연산자가 숫자 타입의 값이 아니면 숫자 타입으로 암묵적 타입 변환 수행
console.log(+""); // 0
console.log(+true); // 1
console.log(+false); // 0

// 불리언 타입으로 변환

// 자바스크립트 엔진은 불리언 타입이 아닌 값을 truthy 값(참으로 평가 되는 값)
// 또는 Falsy  값(거짓으로 평가되는 값)으로 구분한다.

/**
 * Falsy한 값 (false로 평가되는 값)
 * false
 * 0 (숫자 0)
 * ''(빈 문자열)
 * null
 * undefined
 * NaN(Not a Number)
 */

if (10 > 5) console.log("참 입니다.");
if ("") console.log("if ('')");
if (0) console.log("if(0)");
