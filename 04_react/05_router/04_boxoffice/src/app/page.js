import Link from "next/link";

export default function Home() {
  return (
    <>
      <div>
        <Link href='/'></Link>
        <Link href='/movie'>박스오피스 영화 순위 보러 가기</Link>
        {/* <Link href='/movie'>MOVIE</Link> */}
      </div>
    </>
  )
}
