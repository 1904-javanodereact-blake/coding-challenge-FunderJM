  import React from 'react';
import { updateCurrentUser } from '../../streams/user-stream';

interface ISignInState {
  userName: string;
  password: string;
  errorMessage: string;
}

export class SignInComponent extends React.Component<any, ISignInState> {
  constructor(props) {
    super(props);
    this.state = {
      userName: '',
      password: '',
      errorMessage: ''
    };
  }

  submit = async (event) => {
    event.preventDefault();
    console.log('attempting to login');
    const credentials = {
      user_name: this.state.userName,
      password: this.state.password
    };

    const userName = this.state.userName;
    const password = this.state.password;

    try {
      console.log(credentials);
      const resp = await fetch('http://localhost:8080/login', {
        method: 'POST',
        credentials: 'include',
        body: JSON.stringify({userName,password}),
        headers: {
          'content-type': 'application/json'
        }
      })
      console.log(resp);

      if (resp.status === 401) {
        this.setState({
          errorMessage: 'Invalid Credentials'
        });
      } else if (resp.status === 201) {
        // redirect to spaceships page
        // const user = await resp.json();
        const body = await resp.json();
        updateCurrentUser(body);
        this.props.history.push('/zillas');
      } else {
        this.setState({
          errorMessage: 'Cannot Login At This Time'
        });
      }
    } catch (err) {
      console.log(err);
    }
  }

  updateUsername = (event) => {
    this.setState({
      userName: event.target.value
    });
  }

  updatePassword = (event) => {
    this.setState({
      password: event.target.value
    })
  }

  render() {
    const { userName, password, errorMessage } = this.state;
    return (
      <div id = "form">
      <form className="form-signin" onSubmit={this.submit}>
        <h1 id = "top" className="h3 mb-3 font-weight-normal">Sign In</h1>
        <label htmlFor="inputUsername" className="sr-only">Username</label>
        <input type="text" id="inputUsername" name="username"
          className="form-control" placeholder="Username"
          required value={userName} onChange={this.updateUsername} />

        <label htmlFor="inputPassword" className="sr-only">Password</label>
        <input type="password" id="inputPassword" name="password"
          className="form-control" placeholder="Password"
          required value={password} onChange={this.updatePassword} />

        <button id = "but" className="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        <p id="login-error">{errorMessage}</p>
      </form>
      </div>
    );
  }
}