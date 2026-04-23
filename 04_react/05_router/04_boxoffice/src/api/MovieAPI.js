
const API_KEY = '509514174edfc9592b53427a656c46f2'
const URL = `http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=${API_KEY}&targetDt=20260422`


/**일별 박스 오피스 정보 조회 */
export async function getMovieList() {
    const res = await fetch(URL);
    // console.log(res);
    const data = await res.json()
    console.log(data);
    return data.boxOfficeResult.dailyBoxOfficeList;
}






// axios.get(URL, {
//     headers: {
//         Authorization: `Bearer ${API_KEY}`
//     }
// })
//     .then(res => {
//         console.log("성공:", res.data);
//         console.log(res.data.boxOfficeResult.dailyBoxOfficeList)
//     })
//     .catch(err => {
//         console.error("에러:", err.response?.data || err.message);
//     });
// export default async function Axios() {
//     try {
//         const response = await axios.get(URL);
//         const data = response.data;
//         console.log('axios data :', data);
//         console.log('axios response: ', response);
//     } catch (error) {
//         console.log(error);
//     }
// }

// Axios();


/**영화 코드 전달하여 영화 상세 정보 조회 */