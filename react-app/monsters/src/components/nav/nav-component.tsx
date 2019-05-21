import React from 'react';
import { Link } from 'react-router-dom';

export class NavComponent extends React.Component {
    render() {
      return (
        <div id = "nav">
        <nav className="navbar navbar-toggleable-md navbar-expand-lg navbar-light bg-light display-front nav-pad">
          <div className="collapse navbar-collapse" id="navbarsExample04">
            <ul className="navbar-nav ml-auto margin-nav">  
            <li className="nav-item active">
                <Link to="/sign-in" className="unset-anchor nav-link">Sign In</Link>
                </li>
                   
                <li className="nav-item active">
              <Link to="/trainer" className="unset-anchor nav-link">NewsFeed</Link>
              <Link to="/associate" className="unset-anchor nav-link">Register</Link>
              
            </li>
            </ul>
          </div>
          
        </nav>
        </div>
      );
    }
  }