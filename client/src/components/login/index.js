import React, { useContext } from "react";
// import { useAuth } from "../../hooks/use-auth-hook";
import { AuthContext } from "../../contexts/auth-provider";

function Login() {
  const { logIn } = useContext(AuthContext);

  return (
    <div
      style={{ marginTop: "100px" }}
      className="d-flex align-items-center justify-content-center align-middle"
    >
      <form>
        <div className="form-outline mb-4">
          <label className="form-label" htmlFor="userId">
            User
          </label>
          <input type="email" id="userId" className="form-control" />
        </div>

        <div className="form-outline mb-4">
          <label className="form-label" htmlFor="passwordId">
            Password
          </label>
          <input type="password" id="passwordId" className="form-control" />
        </div>

        <button
          type="button"
          className="btn btn-primary btn-block mb-4"
          onClick={() => {
            logIn("admin", "admin123");
          }}
        >
          Login
        </button>
      </form>
    </div>
  );
}

export default Login;
