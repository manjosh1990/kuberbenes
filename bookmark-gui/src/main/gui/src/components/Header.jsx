import React from "react";
import { Link, NavLink } from "react-router-dom";

export default function Header() {

  const activeStyle ={
    fontWeight:"bold",
    textDecoration:"underline",
    color:"#161616"
  }


  return (<>
  <header>
    <Link className="site-logo" to="/">#Bookmarks</Link>
    <nav>
      <NavLink to="/addBookMarks"
      style={({isActive})=>isActive?activeStyle:null}>Add Bookmark</NavLink>
    </nav>
  </header>
  </>)
}