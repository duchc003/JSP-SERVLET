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
# 5. HttpServletRequest
  + getAuthType(): trả về kiểu xác thực (authentication) của yêu cầu.
  + getCookies(): trả về một mảng các cookie được gửi đến trong yêu cầu.
  + getDateHeader(String name): trả về giá trị của tiêu đề ngày (date header) được gửi đến trong yêu cầu, nếu có.
  + getHeader(String name): trả về giá trị của tiêu đề được gửi đến trong yêu cầu với tên đã cho.
  + getMethod(): trả về phương thức HTTP (GET, POST, PUT, DELETE, ...) được sử dụng trong yêu cầu.
  + getPathInfo(): trả về thông tin đường dẫn được yêu cầu sau tên servlet hoặc null nếu không có.
  + getQueryString(): trả về chuỗi query (nếu có) được gửi đến trong yêu cầu.
  + getRequestURI(): trả về URI được yêu cầu.
  + getServletPath(): trả về đường dẫn của servlet được yêu cầu.
  + getSession(): trả về phiên hiện tại liên kết với yêu cầu hoặc tạo một phiên mới nếu không có phiên hiện tại.
  + getParameter(String name): trả về giá trị của tham số được gửi đến với tên đã cho trong yêu cầu.
  + getParameterNames(): trả về một Enumeration chứa tất cả các tên tham số được gửi đến trong yêu cầu.
  + getParameterValues(String name): trả về một mảng các giá trị của tham số được gửi đến với tên đã cho trong yêu cầu.
  + setAttribute(String name, Object value): đặt thuộc tính với tên và giá trị đã cho trên yêu cầu.
  + getAttribute(String name): trả về giá trị của thuộc tính với tên đã cho trên yêu cầu.
  + getHeaderNames(): trả về tất cả các tên tiêu đề được gửi đến trong yêu cầu.
  + getIntHeader(String name): trả về giá trị của tiêu đề số nguyên được gửi đến trong yêu cầu, nếu có.
  + getRemoteUser(): trả về tên người dùng đã xác thực được liên kết với yêu cầu, nếu có.
  + getRequestedSessionId(): trả về ID phiên được yêu cầu bởi yêu cầu.
  + isRequestedSessionIdValid(): trả về true nếu ID phiên được yêu cầu là hợp lệ trong ngữ cảnh
#. 6. HttpServletResponse
  + addCookie(Cookie cookie): thêm một cookie vào phản hồi.
  + addHeader(String name, String value): thêm một tiêu đề vào phản hồi với tên và giá trị đã cho.
  + containsHeader(String name): kiểm tra xem tiêu đề với tên đã cho có được gửi trong phản hồi hay không.
  + encodeRedirectURL(String url): mã hóa lại URL để chuyển hướng, thêm thông tin phiên vào URL nếu cần thiết.
  + encodeURL(String url): mã hóa lại URL, thêm thông tin phiên vào URL nếu cần thiết.
  + sendError(int sc): gửi một mã lỗi HTTP với mã trạng thái đã cho.
  + sendRedirect(String location): chuyển hướng yêu cầu đến URL đã cho.
  + setDateHeader(String name, long date): đặt giá trị tiêu đề ngày (date header) với tên đã cho.
  + setHeader(String name, String value): đặt giá trị tiêu đề với tên đã cho.
  + setContentType(String type): đặt kiểu nội dung (content type) của phản hồi.
  + setContentLength(int len): đặt độ dài nội dung (content length) của phản hồi.
  + setStatus(int sc): đặt mã trạng thái (status code) của phản hồi.
  + getWriter(): trả về một đối tượng PrintWriter được sử dụng để ghi nội dung phản hồi.
  + getOutputStream(): trả về một đối tượng ServletOutputStream được sử dụng để ghi nội dung phản hồi.
  + reset(): xóa nội dung phản hồi và thiết lập lại tất cả các thông số mặc định.
  + resetBuffer(): xóa nội dung của bộ đệm phản hồi.
  + setBufferSize(int size): đặt kích thước của bộ đệm phản hồi.
  + flushBuffer(): gửi nội dung phản hồi tới máy khách và xóa bộ đệm phản hồi.
  + isCommitted(): kiểm tra xem phản hồi đã được gửi tới máy khách chưa.
