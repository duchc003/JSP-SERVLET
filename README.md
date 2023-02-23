# 1. JSP (JavaServer Pages): 
JSP là một công nghệ cho phép tạo các trang web động bằng cách kết hợp mã Java với HTML, CSS và JavaScript. Trong một trang JSP, bạn có thể sử dụng các thẻ JSP để chèn mã Java và các thẻ HTML để hiển thị nội dung tương ứng trên trang web. Khi người dùng truy cập trang web JSP, máy chủ sẽ xử lý các thẻ JSP và chuyển đổi chúng thành mã Java, sau đó thực thi mã Java để tạo ra nội dung động trên trang web. Kết quả cuối cùng là một trang web HTML hoàn chỉnh được gửi đến trình duyệt của người dùng.

# 2. Servlet: 
Servlet là một công nghệ để xử lý các yêu cầu HTTP và tạo nội dung động trên trang web. Khi người dùng truy cập một trang web được xử lý bởi Servlet, yêu cầu của người dùng sẽ được gửi đến Servlet Container (ví dụ: Apache Tomcat), nơi Servlet được đăng ký. Sau đó, Servlet sẽ xử lý yêu cầu, truy vấn cơ sở dữ liệu (nếu cần) và tạo nội dung động để trả về cho trình duyệt của người dùng. Kết quả cuối cùng cũng là một trang web HTML hoàn chỉnh được gửi đến trình duyệt của người dùng.

# 3. Http request and Http  response
HTTP Request và HTTP Response là hai khái niệm cơ bản trong giao thức truyền tải dữ liệu trên mạng Web. HTTP Request (yêu cầu HTTP) là một thông điệp được gửi từ client đến server để yêu cầu một tài nguyên nào đó trên máy chủ. Trong khi đó, HTTP Response (phản hồi HTTP) là thông điệp được server trả về cho client sau khi đã xử lý yêu cầu của client.
+ HTTP Request bao gồm nhiều phần, bao gồm:
  - Phương thức (method): xác định loại yêu cầu được gửi bởi client, bao gồm GET, POST, PUT, DELETE, vv.
  - Địa chỉ (URL): địa chỉ tài nguyên mà client muốn truy cập trên server.
  - Tiêu đề (header): chứa thông tin về phiên làm việc của client, định dạng tài liệu được yêu cầu, mã hóa, cookie, vv.
  - Thân (body): chỉ được sử dụng trong các yêu cầu POST hoặc PUT, chứa dữ liệu được gửi đến server.
+ HTTP Response bao gồm các phần sau:
  - Mã trạng thái (status code): xác định kết quả xử lý yêu cầu của client, bao gồm các mã từ 100 đến 500.
  - Tiêu đề (header): chứa thông tin về phiên làm việc của server, định dạng tài liệu được trả về, mã hóa, cookie, vv.
  - Thân (body): chứa nội dung được trả về từ server.
Ví dụ, khi bạn nhập URL của một trang web vào trình duyệt, trình duyệt sẽ gửi một yêu cầu HTTP đến server của trang web đó, yêu cầu trang web trả về mã HTML để hiển thị trên trình duyệt. Server sẽ xử lý yêu cầu đó và trả về một phản hồi HTTP, chứa mã HTML được trình duyệt sử dụng để hiển thị trang web.

# 4. GET, POST và SERVICE
+ GET:
  - Phương thức GET được sử dụng để yêu cầu dữ liệu từ máy chủ web.
  - Dữ liệu được truyền thông qua URL và hiển thị trên địa chỉ URL.
  - Phương thức này chỉ nên được sử dụng để lấy dữ liệu và không nên được sử dụng để gửi hoặc cập nhật dữ liệu.
+ POST:
  - Phương thức POST được sử dụng để gửi dữ liệu đến máy chủ web.
  - Dữ liệu được gửi trong phần thân yêu cầu và không hiển thị trên địa chỉ URL.
  - Phương thức này thường được sử dụng để gửi hoặc cập nhật dữ liệu.
+ SERVICE:
  - Phương thức SERVICE được sử dụng trong Servlet để xử lý yêu cầu HTTP.
  - Khi một yêu cầu HTTP được gửi đến Servlet, phương thức SERVICE được gọi để xử lý yêu cầu đó.
  - Phương thức SERVICE có thể được sử dụng để xử lý các phương thức HTTP khác nhau như GET, POST, PUT, DELETE và nhiều hơn nữa.
Tóm lại, GET và POST được sử dụng để gửi dữ liệu đến máy chủ web hoặc lấy dữ liệu từ máy chủ web, trong khi SERVICE được sử dụng để xử lý yêu cầu HTTP.
