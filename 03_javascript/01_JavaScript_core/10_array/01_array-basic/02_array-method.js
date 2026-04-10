const food = ["짜장면", "짬뽕", "볶음밥"];

// push(): 맨 뒤에 값 추가하기
food.push("탕수육");
food.push("양장피");

console.log(food);

// pop(): 맨 뒤 값 떼어내기
food.pop();
console.log(food);

/**
 * unshift(): 맨 앞에 값 추가
 * shift(): 맨 앞 값 제거
 */
const chickenList = ["양념치킨", "후라이드", "파닭", "후라이드"];

chickenList.unshift("간장치킨");
console.log(chickenList);

chickenList.shift();
console.log(chickenList);

/**
 * indexOf(값): 특정 값이 있는 '첫 번째 인덱스'를 알려준다. 없으면 -1을 알려준다.
 * includes(값): 특정 값이 있는지 여부만 true/false로 알려준다.
 */

console.log(chickenList.indexOf("후라이드"));
console.log(chickenList.indexOf("마늘치킨"));

console.log(chickenList.includes("양념치킨"));
console.log(chickenList.includes("뿌링클"));

/**
 * 잘라내기
 * slice: 배열의 요소 선택 잘라내기
 * splice: 배열의 index 위치의 요소 제거 및 추가
 */

const front = ["HTML", "CSS", "JavaScript", "React"];

//slice(시작인덱스, 종료인덱스)
console.log(front.slice(1, 3)); // 1번 인덱스부터 3번 전 인덱스까지 잘라온다.
console.log(front); //원본에 영향 없음

// splice(index, 제거수, 추가값1, 추가값2, ...)
front.splice(2, 2, "Redux");
console.log(front);

/**
 * join: 배열을 구분자로 결합하여 문자열로 반환
 */

const snack = ["사탕", "초콜릿", "과자", "젤리"];
console.log(snack.join());
console.log(snack.join("/"));

//reverse: 배열의 순서
console.log([1, 2, 3, 4, 5].reverse());
