"use client";

import { getMovieDetailByMovieCd } from "@/api/MovieAPI";
import { useParams } from "next/navigation";
import { useState } from "react";

export default function MovieDetail() {
  const { movieCd } = useParams();

  const [movie, setMovie] = useState([]);

  useEffect(() => {
    const fetchMovieDetail = async () => {
      const data = await getMovieDetailByMovieCd(movieCd);
      setMovie(data);
    };
    fetchMovieDetail();
  }, []);
  console.log(movie);

  return movie && <></>;
}
