import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import './App.css';
import { NavComponent } from '../src/components/nav/nav-component';
import './include/bootstrap';
import { SignInComponent } from '../src/components/sign-in/sign-in.component';

const App: React.FC = () => {
  return (
    <BrowserRouter>
      <NavComponent />
      <div id="main-content-container">
        <Switch>

        <Route path="/sign-in" component={SignInComponent} />
        </Switch>
      </div>
    </BrowserRouter>
  );
}

export default App;
