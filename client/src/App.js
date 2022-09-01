import React from "react";
import Login from "./components/login";

import { AuthProvider } from "./contexts/auth-provider";

function App() {
  return (
    <AuthProvider>
      <Login />
    </AuthProvider>
  );
}

export default App;
