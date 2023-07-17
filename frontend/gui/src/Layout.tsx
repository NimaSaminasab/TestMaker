import React from 'react';
import Test from './Pages/test';
import CreateUser from './Pages/CreateUser';
import CreateQuestion from './Pages/CreateQuestion';


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
                    <Link to="/CreateUser">
                        <li>Opprett bruker</li>
                    </Link>
                    <Link to="/CreateQuestion">
                        <li>Opprett spørsmål</li>
                    </Link>
                </ul>
            </aside>
            <main>
            <Routes>
                    <Route path="/createUser" element={<CreateUser/>}></Route>
                    <Route path="/test"       element={<Test/>} ></Route>
                    
                    <Route path="/createQuestion" element={<CreateQuestion/>}></Route>
                    
                    <Route path="*" element={<Navigate to='/createUser'></Navigate>}></Route>
            
            </Routes>
            </main>
        </div>
    );
};

export default Layout;
