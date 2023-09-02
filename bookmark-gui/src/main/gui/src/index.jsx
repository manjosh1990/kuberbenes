import React from 'react';
import ReactDOM from 'react-dom/client';
import Layout from './components/Layout';
import Error from './components/Error';
import './index.css';
import {
  RouterProvider,
  createHashRouter,
  createRoutesFromElements,
  Route,
} from "react-router-dom";
import Home,{loader as bookmarksLoader} from './Home';
import AddBookMark from './AddBookMark';

const hashRouter = createHashRouter(createRoutesFromElements(
  <Route path="/" element={<Layout/>} errorElement={<Error/>}>
    <Route index element={<Home/>} loader={bookmarksLoader} />
    <Route path='addBookMarks' element={<AddBookMark/>}/>
  </Route>
)
)
function App() {
  return (
    <RouterProvider router={hashRouter} />
  )
}
ReactDOM.createRoot(document.getElementById('root')).render(<App />
);