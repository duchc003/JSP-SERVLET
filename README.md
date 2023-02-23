# 1. JSP (JavaServer Pages): 
JSP là một công nghệ cho phép tạo các trang web động bằng cách kết hợp mã Java với HTML, CSS và JavaScript. Trong một trang JSP, bạn có thể sử dụng các thẻ JSP để chèn mã Java và các thẻ HTML để hiển thị nội dung tương ứng trên trang web. Khi người dùng truy cập trang web JSP, máy chủ sẽ xử lý các thẻ JSP và chuyển đổi chúng thành mã Java, sau đó thực thi mã Java để tạo ra nội dung động trên trang web. Kết quả cuối cùng là một trang web HTML hoàn chỉnh được gửi đến trình duyệt của người dùng.

# 2. Servlet: 
Servlet là một công nghệ để xử lý các yêu cầu HTTP và tạo nội dung động trên trang web. Khi người dùng truy cập một trang web được xử lý bởi Servlet, yêu cầu của người dùng sẽ được gửi đến Servlet Container (ví dụ: Apache Tomcat), nơi Servlet được đăng ký. Sau đó, Servlet sẽ xử lý yêu cầu, truy vấn cơ sở dữ liệu (nếu cần) và tạo nội dung động để trả về cho trình duyệt của người dùng. Kết quả cuối cùng cũng là một trang web HTML hoàn chỉnh được gửi đến trình duyệt của người dùng.

# 3. Http request and Http  response
HTTP Request và HTTP Response là hai khái niệm cơ bản trong giao thức truyền tải dữ liệu trên mạng Web. HTTP Request (yêu cầu HTTP) là một thông điệp được gửi từ client đến server để yêu cầu một tài nguyên nào đó trên máy chủ. Trong khi đó, HTTP Response (phản hồi HTTP) là thông điệp được server trả về cho client sau khi đã xử lý yêu cầu của client.
- HTTP Request bao gồm nhiều phần, bao gồm:
+ Phương thức (method): xác định loại yêu cầu được gửi bởi client, bao gồm GET, POST, PUT, DELETE, vv.
+ Địa chỉ (URL): địa chỉ tài nguyên mà client muốn truy cập trên server.
+ Tiêu đề (header): chứa thông tin về phiên làm việc của client, định dạng tài liệu được yêu cầu, mã hóa, cookie, vv.
+ Thân (body): chỉ được sử dụng trong các yêu cầu POST hoặc PUT, chứa dữ liệu được gửi đến server.
- HTTP Response bao gồm các phần sau:
+ Mã trạng thái (status code): xác định kết quả xử lý yêu cầu của client, bao gồm các mã từ 100 đến 500.
+ Tiêu đề (header): chứa thông tin về phiên làm việc của server, định dạng tài liệu được trả về, mã hóa, cookie, vv.
+ Thân (body): chứa nội dung được trả về từ server.
Ví dụ, khi bạn nhập URL của một trang web vào trình duyệt, trình duyệt sẽ gửi một yêu cầu HTTP đến server của trang web đó, yêu cầu trang web trả về mã HTML để hiển thị trên trình duyệt. Server sẽ xử lý yêu cầu đó và trả về một phản hồi HTTP, chứa mã HTML được trình duyệt sử dụng để hiển thị trang web.

# 4. Dưới đây là một số cú pháp cơ bản của JSP và Servlet:
+ Cú pháp JSP:
1. Khai báo các thư viện và các biến
 <%@ page import="java.util.List"%>
 <%@ page contentType="text/html; charset=UTF-8"%>
 <% String name = "John"; %>
2. Sử dụng biến JSP trong mã HTML
 <h1>Welcome <%=name %>!</h1>
3. Sử dụng cấu trúc điều kiện trong JSP
 <% if (age > 18) { %>
    <h2>You are an adult!</h2>
 <% } else { %>
    <h2>You are a minor!</h2>
 <% } %>
4. Sử dụng vòng lặp trong JSP
  <ul>
 <% for (int i = 1; i <= 10; i++) { %>
    <li>Item <%= i %></li>
 <% } %>
  </ul>
Cú pháp Servlet:
1. Khai báo Servlet
  @WebServlet("/hello")
  public class HelloServlet extends HttpServlet {
      protected void doGet(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {
        // Process request here
     }
  }
2. Lấy thông tin từ yêu cầu HTTP
  String name = request.getParameter("name");
  int age = Integer.parseInt(request.getParameter("age"));
3. Điều hướng yêu cầu tới trang khác
  response.sendRedirect("newpage.jsp");
4. Gửi phản hồi về cho trình duyệt
  response.setContentType("text/html;charset=UTF-8");
  PrintWriter out = response.getWriter();
  out.println("<html><body><h1>Hello World!</h1></body></html>");
