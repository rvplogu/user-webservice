import React from "react";
import { BrowserRouter, Route, Redirect } from "react-router-dom";
import Home from "./Homepage";
import Login from "./Loginpage";
import Main from "./Mainpage";
import Logout from "./Logoutpage";

function WrapperLayout() {
  return (
    <Home>
      <Route exact path={"/home/login"} component={Login} />
      <Route exact path={"/home/main"} component={Main} />
      <Route exact path={"/home/logout"} component={Logout} />
    </Home>
  );
}
function App() {
  return (
    <BrowserRouter>
      <Route path={"/home"} component={WrapperLayout} />
      <Route exact path={"/"}>
        <Redirect to={{ pathname: "/home" }} />
      </Route>
    </BrowserRouter>
  );
}

export default App;
