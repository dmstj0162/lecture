'use client';
import { getMovieList } from '@/api/MovieAPI';
import { useEffect, useState } from 'react';

export default function MovieList() {

    const [movie, setMovie] = useState([]);
    useEffect(() => {
        getMovieList().then(data => setMovie(data))
    }, [])

    console.log(movie);
    // console.log(movie.boxOfficeResult.dailyBoxOfficeList);
    return (
        <>
            {movie.map(movies => <Card key={movies.id} movies={movies} />)}
        </>
    )
}

function Card({ movies }) {
    return (
        <>
            <div className='card'>
                <div>
                    <h3>순위: {movies.rnum}</h3>
                    <h2>{movies.movieNm}</h2>
                    <h3>개봉일: {movies.openDt}</h3>
                    <h3>누적 관객수: {movies.audiAcc}명</h3>
                </div>
            </div>
        </>
    )
}
// movie &&
// <>
//     <h3>순위: {movie.rank}</h3>
//     <h2>{movie.movieNum}</h2>
//     <h3>개봉일: {movie.openDt}</h3>
//     <h3>누적관객수: {movie.audiAcc}</h3>

// </>