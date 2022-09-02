import axios from "axios";

const api = {
  api_oauth2: axios.create({
    baseURL: `${process.env.REACT_APP_KEYCLOAK}/auth`,
  }),

  api_spring: axios.create({
    baseURL: "http://localhost:4455/spring-api",
  }),
};

export default api;
