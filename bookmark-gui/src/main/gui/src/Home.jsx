import React, { Suspense } from "react";
import { getBookmarks } from "./api";
import { useLoaderData, defer, Await } from "react-router-dom";
export function loader() {
  return defer({ bookmarks: getBookmarks() });
}
export default function Home() {
  const dataPromise = useLoaderData();
  function renderBookMarks(bookmarks) {
    console.log(bookmarks);
    const bookmarksArr = bookmarks.data;
    const bookmarksElements = bookmarksArr.map(bookmark =>{
      return(
        <div key={bookmark.id} className="bookmark">
            <a target="#" href={bookmark.url} className="bookmark-element">{bookmark.title}</a>
        </div>
      )
    })

    return(
      <div className="bookmark-container">
        <h1>Search bookmarks</h1>
        {bookmarksElements}
      </div>
    )
  }
  return (
    <div>
      <Suspense fallback={<h2>Loading...</h2>}>
        <Await resolve={dataPromise.bookmarks}>
          {renderBookMarks}
        </Await>
      </Suspense>
    </div>)
}