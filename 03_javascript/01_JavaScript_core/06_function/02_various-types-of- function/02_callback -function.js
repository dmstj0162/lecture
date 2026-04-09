/**
 * 콜백 함수
 * 다른 함수의 '재료(인자)'로 전달되어, 그 함수의 실행 시점을 제어하는 함수이다.
 */

// 고차 함수: 함수를 인자로 받는 함수
function calculator(calculatorCallback, a, b) {
  console.log("계산을 시작합니다..");
  const result = calculatorCallback(a, b);
  return result;
}

// 콜백 함수
function add(a, b) {
  return a + b;
}

function multyply(a, b) {
  return a * b;
}

const addResult = calculator(add, 10, 5);
console.log(addResult);

const multiplyResult = calculator(multyply, 10, 5);
console.log(multiplyResult);

// 가장 많이 쓰는 배열 예제
const numbers = [3, 10, 1, 6, 4];
numbers.sort(function (a, b) {
  // a - b가 음수면 a가 앞으로, 양수면 b가 앞으로 정렬된다.
  // return a - b; // 오름차순 정렬
  return b - a; //내림차순 정렬
});

// 화살표 함수
numbers.sort((a, b) => a - b);

const a = numbers.sort();
console.log(a);
