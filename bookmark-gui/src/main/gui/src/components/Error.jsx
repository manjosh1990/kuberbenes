import React from "react";
import { useRouteError } from "react-router-dom";
export default function Error() {
  const error = useRouteError();
  console.log({error})
  return (<div>
    <h1>Oops! Something Went Wrong</h1>
    <h1>{error.message}</h1>
  </div>)
}