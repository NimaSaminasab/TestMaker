import React from 'react';
import Test from './Pages/test';


import './Layout.css' 

import {Link, Navigate, Route, Routes} from "react-router-dom";

const Layout = () => {
    return (
        <div className="layout">
            <header className="myHeader">
                <h1> Samfunnskunnskap </h1>
            </header>
            <aside>
                <ul className="sidebarMenus">
                    <Link to="/test" >
                        <li>Ta en test</li>
                    </Link>
                    <Link to="/opplaring">
                        <li>Opplæring</li>
                    </Link>
                </ul>
            </aside>
            <main>
            <Routes>
                    <Route path="/test" element={<Test/>} ></Route>
                    <Route path="/opplaring" ></Route>
                    <Route path="*" element={<Navigate to='/test'></Navigate>}></Route>
            
            </Routes>
            </main>
        </div>
    );
};

export default Layout;
