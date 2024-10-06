import { useState, useEffect } from "react";
import axios from "axios";

const Main = () => {
  const [posts, setPosts] = useState([]);

  // 게시글 목록을 가져오기 위한 API 호출
  useEffect(() => {
    axios.get("/api/posts").then((response) => setPosts(response.data));
  }, []);

  return (
    <div>
      <h1>게시판</h1>
      <table>
        <thead>
          <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>작성일</th>
          </tr>
        </thead>
        <tbody>
          {posts.map((post, index) => (
            <tr key={post.id}>
              <td>{index + 1}</td>
              <td>
                <a href={`/post/${post.id}`}>{post.title}</a>
              </td>
              <td>{post.author}</td>
              <td>{new Date(post.createdAt).toLocaleDateString()}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default Main;
