import React from "react";

function Home(props) {
  return (
    <div>
      <h1>User home page</h1>
      {props.children}
    </div>
  );
}

export default Home;
