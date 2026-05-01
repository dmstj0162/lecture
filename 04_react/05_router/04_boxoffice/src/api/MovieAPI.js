const API_KEY = "509514174edfc9592b53427a656c46f2";
// const API_KEY = "b76fe790913e7ce1c176c26f041355d2";

/**일별 박스 오피스 정보 조회 */
export async function getMovieList() {
  const API_URL =
    "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json";
  const targetDate = "20260422";

  try {
    const listResponse = await fetch(
      `${API_URL}?key=${API_KEY}&targetDt=${targetDate}`,
    );

    if (!listResponse.ok) throw new Error("영화 목록을 가져올 수 없습니다.");

    const data = await listResponse.json();

    return data.boxOfficeResult.dailyBoxOfficeList;
  } catch (error) {
    console.error(error);
    return [];
  }
  // const res = await fetch(URL);
  // // console.log(res);
  // const data = await res.json()
  // console.log(data);
  // return data.boxOfficeResult.dailyBoxOfficeList;
}

/**영화 코드 전달하여 영화 상세 정보 조회 */
export async function getMovieDetailByMovieCd(movieCd) {
  const API_URL =
    "http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieInfo.json";

  try {
    const detailResponse = await fetch(
      `${API_URL}?key=${API_KEY}&movieCd=${movieCd}`,
    );

    if (!detailResponse.ok)
      throw new Error("영화 상세정보를 가져올 수 없습니다.");

    const data = await detailResponse.json();
    console.log(data);
    return data;
  } catch (error) {
    console.log(error);
    return [];
  }
}
