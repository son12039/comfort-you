import axios from "axios";

const instance = axios.create({
  baseURL: "http://localhost:8080/server/member/",
});

export const signup = async (data) => {
  console.log("눌리긴함");
  return await instance.post("signup", data);
};

export const login = async (data) => {
  return await instance.post("login", data);
};

export const board = async () => {
  return await instance.get("board");
};
