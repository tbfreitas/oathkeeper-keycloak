import { useContext } from "react";
import { AuthContext } from "../contexts/auth-provider";

export const useAuth = () => {
  return useContext(AuthContext);
};
