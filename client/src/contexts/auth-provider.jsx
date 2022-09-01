import React, { createContext } from "react";
import api from "../services/axios";

export const AuthContext = createContext({});

export function AuthProvider({ children }) {
  async function logIn(username, password) {
    const request = {
      username,
      password,
      client_id: "my-client",
      client_secret: "1Z298Mrg9wzuSGrL7HIOEFN6gHXW8fx7",
      grant_type: "password",
    };

    try {
      const response = await api.api_oauth2.post(
        `/realms/master/protocol/openid-connect/token`,
        request,
        {
          headers: {
            "Content-Type": "application/x-www-form-urlencoded",
          },
        }
      );
      console.log(response);
    } catch (e) {
      console.log(e);
    }
  }

  return (
    <AuthContext.Provider
      value={{
        logIn,
      }}
    >
      {children}
    </AuthContext.Provider>
  );
}
