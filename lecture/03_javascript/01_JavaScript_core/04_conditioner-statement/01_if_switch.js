/**
 * 조건문: if-else
 * if(조건식) {
 *      //조건식이 true인 경우 실행구문
 * }else{
 *      //조건식이 false인 경우 실행구문
 * }
 */

let temperature = 5;

if (temperature < 10) {
  console.log("오늘은 춥다.");
} else {
  console.log("오늘은 따뜻하다.");
}

/**
 * 조건문 : if-esle if-else
 */

let score = 85;

if (score >= 90) {
  console.log("매우 우수");
} else if (score >= 70) {
  console.log("양호");
} else if (score >= 50) {
  console.log("보통");
} else {
  console.log("미달");
}

/**
 * switch
 * 하나의 변수에 대해 여러 경우를 처리
 */

let fruit = "바나나";

switch (fruit) {
  case "사과":
    console.log("선택한 과일은 사과임");
    break;
  case "바나나":
    console.log("선택한 과일은 바나나임");
    break;
  default:
    console.log("알 수 없는 과일임");
}
